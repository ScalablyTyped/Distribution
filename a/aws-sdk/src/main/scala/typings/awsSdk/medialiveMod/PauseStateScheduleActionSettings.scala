package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PauseStateScheduleActionSettings extends js.Object {
  var Pipelines: js.UndefOr[listOfPipelinePauseStateSettings] = js.native
}

object PauseStateScheduleActionSettings {
  @scala.inline
  def apply(Pipelines: listOfPipelinePauseStateSettings = null): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    if (Pipelines != null) __obj.updateDynamic("Pipelines")(Pipelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
}

