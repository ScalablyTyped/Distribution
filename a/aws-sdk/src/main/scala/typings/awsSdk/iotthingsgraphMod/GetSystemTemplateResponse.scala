package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSystemTemplateResponse extends js.Object {
  /**
    * An object that contains summary data about the system.
    */
  var description: js.UndefOr[SystemTemplateDescription] = js.native
}

object GetSystemTemplateResponse {
  @scala.inline
  def apply(description: SystemTemplateDescription = null): GetSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemTemplateResponse]
  }
}

