package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterThingResponse extends js.Object {
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  
  /**
    * ARNs for the generated resources.
    */
  var resourceArns: js.UndefOr[ResourceArns] = js.native
}
object RegisterThingResponse {
  
  @scala.inline
  def apply(): RegisterThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterThingResponse]
  }
  
  @scala.inline
  implicit class RegisterThingResponseOps[Self <: RegisterThingResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificatePem(value: CertificatePem): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePem: Self = this.set("certificatePem", js.undefined)
    
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = this.set("resourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArns: Self = this.set("resourceArns", js.undefined)
  }
}
