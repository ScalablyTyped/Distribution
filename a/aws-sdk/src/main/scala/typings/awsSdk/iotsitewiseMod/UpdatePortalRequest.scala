package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePortalRequest extends js.Object {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email = js.native
  
  /**
    * A new description for the portal.
    */
  var portalDescription: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the portal to update.
    */
  var portalId: ID = js.native
  
  var portalLogoImage: js.UndefOr[Image] = js.native
  
  /**
    * A new friendly name for the portal.
    */
  var portalName: Name = js.native
  
  /**
    * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: ARN = js.native
}
object UpdatePortalRequest {
  
  @scala.inline
  def apply(portalContactEmail: Email, portalId: ID, portalName: Name, roleArn: ARN): UpdatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalRequest]
  }
  
  @scala.inline
  implicit class UpdatePortalRequestOps[Self <: UpdatePortalRequest] (val x: Self) extends AnyVal {
    
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
    def setPortalContactEmail(value: Email): Self = this.set("portalContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalName(value: Name): Self = this.set("portalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: ARN): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setPortalDescription(value: Description): Self = this.set("portalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalDescription: Self = this.set("portalDescription", js.undefined)
    
    @scala.inline
    def setPortalLogoImage(value: Image): Self = this.set("portalLogoImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalLogoImage: Self = this.set("portalLogoImage", js.undefined)
  }
}
