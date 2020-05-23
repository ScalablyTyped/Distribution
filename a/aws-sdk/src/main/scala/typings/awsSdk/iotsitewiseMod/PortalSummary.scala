package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalSummary extends js.Object {
  /**
    * The date the portal was created, in Unix epoch time.
    */
  var creationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The portal's description.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The ID of the portal.
    */
  var id: ID = js.native
  /**
    * The date the portal was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the portal.
    */
  var name: Name = js.native
  /**
    * The ARN of the service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: js.UndefOr[ARN] = js.native
  /**
    * The public root URL for the AWS IoT AWS IoT SiteWise Monitor application portal.
    */
  var startUrl: Url = js.native
}

object PortalSummary {
  @scala.inline
  def apply(
    id: ID,
    name: Name,
    startUrl: Url,
    creationDate: Timestamp = null,
    description: Description = null,
    lastUpdateDate: Timestamp = null,
    roleArn: ARN = null
  ): PortalSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startUrl = startUrl.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalSummary]
  }
}

