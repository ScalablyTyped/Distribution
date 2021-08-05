package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryRunTimeline extends StObject {
  
  /**
    * The end time of the run.
    */
  var Completed: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The start time of the run.
    */
  var Started: js.UndefOr[Timestamp] = js.undefined
}
object CanaryRunTimeline {
  
  inline def apply(): CanaryRunTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunTimeline]
  }
  
  extension [Self <: CanaryRunTimeline](x: Self) {
    
    inline def setCompleted(value: Timestamp): Self = StObject.set(x, "Completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "Completed", js.undefined)
    
    inline def setStarted(value: Timestamp): Self = StObject.set(x, "Started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "Started", js.undefined)
  }
}
