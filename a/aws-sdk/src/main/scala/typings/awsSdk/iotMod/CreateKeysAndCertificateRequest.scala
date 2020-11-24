package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeysAndCertificateRequest extends js.Object {
  
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}
object CreateKeysAndCertificateRequest {
  
  @scala.inline
  def apply(): CreateKeysAndCertificateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeysAndCertificateRequest]
  }
  
  @scala.inline
  implicit class CreateKeysAndCertificateRequestOps[Self <: CreateKeysAndCertificateRequest] (val x: Self) extends AnyVal {
    
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
    def setSetAsActive(value: SetAsActive): Self = this.set("setAsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAsActive: Self = this.set("setAsActive", js.undefined)
  }
}
