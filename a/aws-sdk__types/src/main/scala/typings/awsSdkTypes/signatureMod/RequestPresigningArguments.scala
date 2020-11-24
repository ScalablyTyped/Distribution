package typings.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPresigningArguments extends RequestSigningArguments {
  
  /**
    * The number of seconds before the presigned URL expires
    */
  var expiresIn: js.UndefOr[Double] = js.native
}
object RequestPresigningArguments {
  
  @scala.inline
  def apply(): RequestPresigningArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPresigningArguments]
  }
  
  @scala.inline
  implicit class RequestPresigningArgumentsOps[Self <: RequestPresigningArguments] (val x: Self) extends AnyVal {
    
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
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
  }
}
