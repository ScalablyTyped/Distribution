package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePortalResponse extends js.Object {
  
  /**
    * The ARN of the portal, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId} 
    */
  var portalArn: ARN = js.native
  
  /**
    * The service to use to authenticate users to the portal.
    */
  var portalAuthMode: js.UndefOr[AuthMode] = js.native
  
  /**
    * The AWS SSO application generated client ID (used with AWS SSO APIs). AWS IoT SiteWise includes portalClientId for only portals that use AWS SSO to authenticate users.
    */
  var portalClientId: PortalClientId = js.native
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email = js.native
  
  /**
    * The date the portal was created, in Unix epoch time.
    */
  var portalCreationDate: Timestamp = js.native
  
  /**
    * The portal's description.
    */
  var portalDescription: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the portal.
    */
  var portalId: ID = js.native
  
  /**
    * The date the portal was last updated, in Unix epoch time.
    */
  var portalLastUpdateDate: Timestamp = js.native
  
  /**
    * The portal's logo image, which is available at a URL.
    */
  var portalLogoImageLocation: js.UndefOr[ImageLocation] = js.native
  
  /**
    * The name of the portal.
    */
  var portalName: Name = js.native
  
  /**
    * The URL for the AWS IoT SiteWise Monitor portal. You can use this URL to access portals that use AWS SSO for authentication. For portals that use IAM for authentication, you must use the CreatePresignedPortalUrl operation to create a URL that you can use to access the portal.
    */
  var portalStartUrl: Url = js.native
  
  /**
    * The current status of the portal, which contains a state and any error message.
    */
  var portalStatus: PortalStatus = js.native
  
  /**
    * The ARN of the service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: js.UndefOr[ARN] = js.native
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
  implicit class DescribePortalResponseOps[Self <: DescribePortalResponse] (val x: Self) extends AnyVal {
    
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
    def setPortalArn(value: ARN): Self = this.set("portalArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalClientId(value: PortalClientId): Self = this.set("portalClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalContactEmail(value: Email): Self = this.set("portalContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalCreationDate(value: Timestamp): Self = this.set("portalCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLastUpdateDate(value: Timestamp): Self = this.set("portalLastUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalName(value: Name): Self = this.set("portalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalStartUrl(value: Url): Self = this.set("portalStartUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalStatus(value: PortalStatus): Self = this.set("portalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalAuthMode(value: AuthMode): Self = this.set("portalAuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalAuthMode: Self = this.set("portalAuthMode", js.undefined)
    
    @scala.inline
    def setPortalDescription(value: Description): Self = this.set("portalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalDescription: Self = this.set("portalDescription", js.undefined)
    
    @scala.inline
    def setPortalLogoImageLocation(value: ImageLocation): Self = this.set("portalLogoImageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortalLogoImageLocation: Self = this.set("portalLogoImageLocation", js.undefined)
    
    @scala.inline
    def setRoleArn(value: ARN): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
}
