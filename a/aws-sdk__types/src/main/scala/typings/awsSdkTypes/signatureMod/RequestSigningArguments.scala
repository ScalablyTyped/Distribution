package typings.awsSdkTypes.signatureMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSigningArguments extends SigningArguments {
  
  /**
    * A set of strings whose members represents headers that should be signed.
    * Any values passed here will override those provided via unsignableHeaders,
    * allowing them to be signed.
    *
    * All headers in the provided request will have their names converted to
    * lower case before signing.
    */
  var signableHeaders: js.UndefOr[Set[String]] = js.native
  
  /**
    * A set of strings whose members represents headers that cannot be signed.
    * All headers in the provided request will have their names converted to
    * lower case and then checked for existence in the unsignableHeaders set.
    */
  var unsignableHeaders: js.UndefOr[Set[String]] = js.native
}
object RequestSigningArguments {
  
  @scala.inline
  def apply(): RequestSigningArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestSigningArguments]
  }
  
  @scala.inline
  implicit class RequestSigningArgumentsOps[Self <: RequestSigningArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSignableHeaders(value: Set[String]): Self = this.set("signableHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignableHeaders: Self = this.set("signableHeaders", js.undefined)
    
    @scala.inline
    def setUnsignableHeaders(value: Set[String]): Self = this.set("unsignableHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsignableHeaders: Self = this.set("unsignableHeaders", js.undefined)
  }
}
