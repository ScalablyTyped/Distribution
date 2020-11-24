package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateWebsiteCertificateAuthorityRequest extends js.Object {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
  
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: Id = js.native
}
object DisassociateWebsiteCertificateAuthorityRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn, WebsiteCaId: Id): DisassociateWebsiteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], WebsiteCaId = WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateWebsiteCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class DisassociateWebsiteCertificateAuthorityRequestOps[Self <: DisassociateWebsiteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
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
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteCaId(value: Id): Self = this.set("WebsiteCaId", value.asInstanceOf[js.Any])
  }
}
