package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePortalResponse extends js.Object {
  /**
    * The ARN of the portal, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId} 
    */
  var portalArn: ARN = js.native
  /**
    * The AWS SSO application generated client ID (used with AWS SSO APIs).
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
    * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
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
    portalStatus: PortalStatus,
    portalDescription: Description = null,
    portalLogoImageLocation: ImageLocation = null,
    roleArn: ARN = null
  ): DescribePortalResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], portalClientId = portalClientId.asInstanceOf[js.Any], portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalCreationDate = portalCreationDate.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalLastUpdateDate = portalLastUpdateDate.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], portalStartUrl = portalStartUrl.asInstanceOf[js.Any], portalStatus = portalStatus.asInstanceOf[js.Any])
    if (portalDescription != null) __obj.updateDynamic("portalDescription")(portalDescription.asInstanceOf[js.Any])
    if (portalLogoImageLocation != null) __obj.updateDynamic("portalLogoImageLocation")(portalLogoImageLocation.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalResponse]
  }
}

