package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectRequest extends js.Object {
  /**
    * Sets the execution timeout value (in minutes) for a project. All test runs in this project use the specified execution timeout value unless overridden when scheduling a run.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  /**
    * The project's name.
    */
  var name: Name = js.native
}

object CreateProjectRequest {
  @scala.inline
  def apply(name: Name, defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultJobTimeoutMinutes)) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

