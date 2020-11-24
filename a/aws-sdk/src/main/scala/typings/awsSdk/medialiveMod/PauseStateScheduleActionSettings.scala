package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseStateScheduleActionSettings extends js.Object {
  
  var Pipelines: js.UndefOr[listOfPipelinePauseStateSettings] = js.native
}
object PauseStateScheduleActionSettings {
  
  @scala.inline
  def apply(): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
  
  @scala.inline
  implicit class PauseStateScheduleActionSettingsOps[Self <: PauseStateScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPipelinesVarargs(value: PipelinePauseStateSettings*): Self = this.set("Pipelines", js.Array(value :_*))
    
    @scala.inline
    def setPipelines(value: listOfPipelinePauseStateSettings): Self = this.set("Pipelines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelines: Self = this.set("Pipelines", js.undefined)
  }
}
