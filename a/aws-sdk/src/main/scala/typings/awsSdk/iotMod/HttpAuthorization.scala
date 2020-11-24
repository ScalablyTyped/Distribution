package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpAuthorization extends js.Object {
  
  /**
    * Use Sig V4 authorization. For more information, see Signature Version 4 Signing Process.
    */
  var sigv4: js.UndefOr[SigV4Authorization] = js.native
}
object HttpAuthorization {
  
  @scala.inline
  def apply(): HttpAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpAuthorization]
  }
  
  @scala.inline
  implicit class HttpAuthorizationOps[Self <: HttpAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSigv4(value: SigV4Authorization): Self = this.set("sigv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigv4: Self = this.set("sigv4", js.undefined)
  }
}
