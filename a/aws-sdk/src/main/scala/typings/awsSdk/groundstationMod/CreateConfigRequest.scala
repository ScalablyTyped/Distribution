package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigRequest extends js.Object {
  /**
    * Parameters of a Config.
    */
  var configData: ConfigTypeData = js.native
  /**
    * Name of a Config.
    */
  var name: SafeName = js.native
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object CreateConfigRequest {
  @scala.inline
  def apply(configData: ConfigTypeData, name: SafeName, tags: TagsMap = null): CreateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigRequest]
  }
}

