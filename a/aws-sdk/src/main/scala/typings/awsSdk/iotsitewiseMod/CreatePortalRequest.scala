package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePortalRequest extends js.Object {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The service to use to authenticate users to the portal. Choose from the following options:    SSO – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see Enabling AWS SSO in the AWS IoT SiteWise User Guide. This option is only available in AWS Regions other than the China Regions.    IAM – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user permissions. IAM users must have the iotsitewise:CreatePresignedPortalUrl permission to sign in to the portal. This option is only available in the China Regions.   You can't change this value after you create a portal. Default: SSO 
    */
  var portalAuthMode: js.UndefOr[AuthMode] = js.native
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email = js.native
  
  /**
    * A description for the portal.
    */
  var portalDescription: js.UndefOr[Description] = js.native
  
  /**
    * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark background.
    */
  var portalLogoImageFile: js.UndefOr[ImageFile] = js.native
  
  /**
    * A friendly name for the portal.
    */
  var portalName: Name = js.native
  
  /**
    * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: ARN = js.native
  
  /**
    * A list of key-value pairs that contain metadata for the portal. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreatePortalRequest {
  
  @scala.inline
  def apply(portalContactEmail: Email, portalName: Name, roleArn: ARN): CreatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalRequest]
  }
  
  @scala.inline
  implicit class CreatePortalRequestOps[Self <: CreatePortalRequest] (val x: Self) extends AnyVal {
    
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
    def setPortalName(value: Name): Self = this.set("portalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: ARN): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setPortalAuthMode(value: AuthMode): Self = this.set("portalAuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalAuthMode: Self = this.set("portalAuthMode", js.undefined)
    
    @scala.inline
    def setPortalDescription(value: Description): Self = this.set("portalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalDescription: Self = this.set("portalDescription", js.undefined)
    
    @scala.inline
    def setPortalLogoImageFile(value: ImageFile): Self = this.set("portalLogoImageFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalLogoImageFile: Self = this.set("portalLogoImageFile", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
