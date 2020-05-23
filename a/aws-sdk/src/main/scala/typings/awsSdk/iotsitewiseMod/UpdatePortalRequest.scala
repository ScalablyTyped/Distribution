package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * A logo image to display in the portal. Upload a square, high-resolution image. The image is displayed on a dark background.
    */
  var portalLogoImageFile: js.UndefOr[ImageFile] = js.native
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
  def apply(
    portalContactEmail: Email,
    portalId: ID,
    portalName: Name,
    roleArn: ARN,
    clientToken: ClientToken = null,
    portalDescription: Description = null,
    portalLogoImageFile: ImageFile = null
  ): UpdatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (portalDescription != null) __obj.updateDynamic("portalDescription")(portalDescription.asInstanceOf[js.Any])
    if (portalLogoImageFile != null) __obj.updateDynamic("portalLogoImageFile")(portalLogoImageFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalRequest]
  }
}

