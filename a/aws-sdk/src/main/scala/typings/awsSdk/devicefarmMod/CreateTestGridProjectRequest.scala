package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridProjectRequest extends js.Object {
  /**
    * Human-readable description of the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.native
  /**
    * Human-readable name of the Selenium testing project.
    */
  var name: ResourceName = js.native
}

object CreateTestGridProjectRequest {
  @scala.inline
  def apply(name: ResourceName, description: ResourceDescription = null): CreateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridProjectRequest]
  }
}

