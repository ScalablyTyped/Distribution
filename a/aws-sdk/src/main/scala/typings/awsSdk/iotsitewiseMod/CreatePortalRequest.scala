package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePortalRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The service to use to authenticate users to the portal. Choose from the following options:    SSO – The portal uses AWS Single Sign-On to authenticate users and manage user permissions. Before you can create a portal that uses AWS SSO, you must enable AWS SSO. For more information, see Enabling AWS SSO in the AWS IoT SiteWise User Guide. This option is only available in AWS Regions other than the China Regions.    IAM – The portal uses AWS Identity and Access Management (IAM) to authenticate users and manage user permissions. IAM users must have the iotsitewise:CreatePresignedPortalUrl permission to sign in to the portal. This option is only available in the China Regions.   You can't change this value after you create a portal. Default: SSO 
    */
  var portalAuthMode: js.UndefOr[AuthMode] = js.undefined
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email
  
  /**
    * A description for the portal.
    */
  var portalDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark background.
    */
  var portalLogoImageFile: js.UndefOr[ImageFile] = js.undefined
  
  /**
    * A friendly name for the portal.
    */
  var portalName: Name
  
  /**
    * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: ARN
  
  /**
    * A list of key-value pairs that contain metadata for the portal. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreatePortalRequest {
  
  @scala.inline
  def apply(portalContactEmail: Email, portalName: Name, roleArn: ARN): CreatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalRequest]
  }
  
  @scala.inline
  implicit class CreatePortalRequestMutableBuilder[Self <: CreatePortalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setPortalAuthMode(value: AuthMode): Self = StObject.set(x, "portalAuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalAuthModeUndefined: Self = StObject.set(x, "portalAuthMode", js.undefined)
    
    @scala.inline
    def setPortalContactEmail(value: Email): Self = StObject.set(x, "portalContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDescription(value: Description): Self = StObject.set(x, "portalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDescriptionUndefined: Self = StObject.set(x, "portalDescription", js.undefined)
    
    @scala.inline
    def setPortalLogoImageFile(value: ImageFile): Self = StObject.set(x, "portalLogoImageFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLogoImageFileUndefined: Self = StObject.set(x, "portalLogoImageFile", js.undefined)
    
    @scala.inline
    def setPortalName(value: Name): Self = StObject.set(x, "portalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
