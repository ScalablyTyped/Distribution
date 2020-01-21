package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEnvironmentRequest extends js.Object {
  /**
    * Any new or replacement description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.native
  /**
    * The ID of the environment to change settings.
    */
  var environmentId: EnvironmentId = js.native
  /**
    * A replacement name for the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.native
}

object UpdateEnvironmentRequest {
  @scala.inline
  def apply(
    environmentId: EnvironmentId,
    description: EnvironmentDescription = null,
    name: EnvironmentName = null
  ): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
}

