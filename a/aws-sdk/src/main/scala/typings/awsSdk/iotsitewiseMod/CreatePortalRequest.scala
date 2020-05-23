package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePortalRequest extends js.Object {
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
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
  def apply(
    portalContactEmail: Email,
    portalName: Name,
    roleArn: ARN,
    clientToken: ClientToken = null,
    portalDescription: Description = null,
    portalLogoImageFile: ImageFile = null,
    tags: TagMap = null
  ): CreatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (portalDescription != null) __obj.updateDynamic("portalDescription")(portalDescription.asInstanceOf[js.Any])
    if (portalLogoImageFile != null) __obj.updateDynamic("portalLogoImageFile")(portalLogoImageFile.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalRequest]
  }
}

