package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSystemTemplateResponse extends js.Object {
  /**
    * The summary object that describes the created system.
    */
  var summary: js.UndefOr[SystemTemplateSummary] = js.native
}

object CreateSystemTemplateResponse {
  @scala.inline
  def apply(summary: SystemTemplateSummary = null): CreateSystemTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemTemplateResponse]
  }
}

