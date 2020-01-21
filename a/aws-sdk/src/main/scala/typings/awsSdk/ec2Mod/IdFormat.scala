package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdFormat extends js.Object {
  /**
    * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
    */
  var Deadline: js.UndefOr[DateTime] = js.native
  /**
    * The type of resource.
    */
  var Resource: js.UndefOr[String] = js.native
  /**
    * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
    */
  var UseLongIds: js.UndefOr[Boolean] = js.native
}

object IdFormat {
  @scala.inline
  def apply(
    Deadline: DateTime = null,
    Resource: String = null,
    UseLongIds: js.UndefOr[scala.Boolean] = js.undefined
  ): IdFormat = {
    val __obj = js.Dynamic.literal()
    if (Deadline != null) __obj.updateDynamic("Deadline")(Deadline.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    if (!js.isUndefined(UseLongIds)) __obj.updateDynamic("UseLongIds")(UseLongIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdFormat]
  }
}

