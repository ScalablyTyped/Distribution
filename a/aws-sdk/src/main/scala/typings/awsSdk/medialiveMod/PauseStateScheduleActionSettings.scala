package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseStateScheduleActionSettings extends StObject {
  
  var Pipelines: js.UndefOr[listOfPipelinePauseStateSettings] = js.native
}
object PauseStateScheduleActionSettings {
  
  @scala.inline
  def apply(): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
  
  @scala.inline
  implicit class PauseStateScheduleActionSettingsMutableBuilder[Self <: PauseStateScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelines(value: listOfPipelinePauseStateSettings): Self = StObject.set(x, "Pipelines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelinesUndefined: Self = StObject.set(x, "Pipelines", js.undefined)
    
    @scala.inline
    def setPipelinesVarargs(value: PipelinePauseStateSettings*): Self = StObject.set(x, "Pipelines", js.Array(value :_*))
  }
}
