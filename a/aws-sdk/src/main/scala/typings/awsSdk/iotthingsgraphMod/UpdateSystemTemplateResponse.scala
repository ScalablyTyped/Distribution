package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSystemTemplateResponse extends js.Object {
  /**
    * An object containing summary information about the updated system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
}

object UpdateSystemTemplateResponse {
  @scala.inline
  def apply(summary: SystemTemplateSummary = null): UpdateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSystemTemplateResponse]
  }
}

