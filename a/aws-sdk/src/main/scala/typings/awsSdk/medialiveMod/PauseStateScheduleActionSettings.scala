package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseStateScheduleActionSettings extends StObject {
  
  var Pipelines: js.UndefOr[listOfPipelinePauseStateSettings] = js.undefined
}
object PauseStateScheduleActionSettings {
  
  inline def apply(): PauseStateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseStateScheduleActionSettings]
  }
  
  extension [Self <: PauseStateScheduleActionSettings](x: Self) {
    
    inline def setPipelines(value: listOfPipelinePauseStateSettings): Self = StObject.set(x, "Pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "Pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: PipelinePauseStateSettings*): Self = StObject.set(x, "Pipelines", js.Array(value*))
  }
}
