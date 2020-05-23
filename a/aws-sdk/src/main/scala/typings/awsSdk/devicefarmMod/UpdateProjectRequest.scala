package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project whose name to update.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The number of minutes a test run in the project executes before it times out.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * A string that represents the new name of the project that you are updating.
    */
  var name: js.UndefOr[Name] = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
    name: Name = null
  ): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultJobTimeoutMinutes)) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

