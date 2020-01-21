package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * Configuration ID of the application to be updated.
    */
  var configurationId: ApplicationId = js.native
  /**
    * New description of the application to be updated.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * New name of the application to be updated.
    */
  var name: js.UndefOr[String] = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(configurationId: ApplicationId, description: String = null, name: String = null): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(configurationId = configurationId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
}

