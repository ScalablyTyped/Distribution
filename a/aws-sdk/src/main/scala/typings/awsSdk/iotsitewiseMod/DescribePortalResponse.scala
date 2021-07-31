package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePortalResponse extends StObject {
  
  /**
    * The ARN of the portal, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId} 
    */
  var portalArn: ARN
  
  /**
    * The service to use to authenticate users to the portal.
    */
  var portalAuthMode: js.UndefOr[AuthMode] = js.undefined
  
  /**
    * The AWS SSO application generated client ID (used with AWS SSO APIs). AWS IoT SiteWise includes portalClientId for only portals that use AWS SSO to authenticate users.
    */
  var portalClientId: PortalClientId
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email
  
  /**
    * The date the portal was created, in Unix epoch time.
    */
  var portalCreationDate: Timestamp
  
  /**
    * The portal's description.
    */
  var portalDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the portal.
    */
  var portalId: ID
  
  /**
    * The date the portal was last updated, in Unix epoch time.
    */
  var portalLastUpdateDate: Timestamp
  
  /**
    * The portal's logo image, which is available at a URL.
    */
  var portalLogoImageLocation: js.UndefOr[ImageLocation] = js.undefined
  
  /**
    * The name of the portal.
    */
  var portalName: Name
  
  /**
    * The URL for the AWS IoT SiteWise Monitor portal. You can use this URL to access portals that use AWS SSO for authentication. For portals that use IAM for authentication, you must use the CreatePresignedPortalUrl operation to create a URL that you can use to access the portal.
    */
  var portalStartUrl: Url
  
  /**
    * The current status of the portal, which contains a state and any error message.
    */
  var portalStatus: PortalStatus
  
  /**
    * The ARN of the service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: js.UndefOr[ARN] = js.undefined
}
object DescribePortalResponse {
  
  @scala.inline
  def apply(
    portalArn: ARN,
    portalClientId: PortalClientId,
    portalContactEmail: Email,
    portalCreationDate: Timestamp,
    portalId: ID,
    portalLastUpdateDate: Timestamp,
    portalName: Name,
    portalStartUrl: Url,
    portalStatus: PortalStatus
  ): DescribePortalResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], portalClientId = portalClientId.asInstanceOf[js.Any], portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalCreationDate = portalCreationDate.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalLastUpdateDate = portalLastUpdateDate.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], portalStartUrl = portalStartUrl.asInstanceOf[js.Any], portalStatus = portalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalResponse]
  }
  
  @scala.inline
  implicit class DescribePortalResponseMutableBuilder[Self <: DescribePortalResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPortalArn(value: ARN): Self = StObject.set(x, "portalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalAuthMode(value: AuthMode): Self = StObject.set(x, "portalAuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalAuthModeUndefined: Self = StObject.set(x, "portalAuthMode", js.undefined)
    
    @scala.inline
    def setPortalClientId(value: PortalClientId): Self = StObject.set(x, "portalClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalContactEmail(value: Email): Self = StObject.set(x, "portalContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalCreationDate(value: Timestamp): Self = StObject.set(x, "portalCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDescription(value: Description): Self = StObject.set(x, "portalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDescriptionUndefined: Self = StObject.set(x, "portalDescription", js.undefined)
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLastUpdateDate(value: Timestamp): Self = StObject.set(x, "portalLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLogoImageLocation(value: ImageLocation): Self = StObject.set(x, "portalLogoImageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLogoImageLocationUndefined: Self = StObject.set(x, "portalLogoImageLocation", js.undefined)
    
    @scala.inline
    def setPortalName(value: Name): Self = StObject.set(x, "portalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalStartUrl(value: Url): Self = StObject.set(x, "portalStartUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalStatus(value: PortalStatus): Self = StObject.set(x, "portalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
