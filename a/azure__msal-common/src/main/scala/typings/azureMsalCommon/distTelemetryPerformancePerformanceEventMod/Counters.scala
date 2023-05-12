package typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counters extends StObject {
  
  var incompleteSubsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Amount of times queued in the JS event queue.
    *
    * @type {?number}
    */
  var queuedCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Amount of manually completed queue events.
    *
    * @type {?number}
    */
  var queuedManuallyCompletedCount: js.UndefOr[Double] = js.undefined
  
  var visibilityChangeCount: js.UndefOr[Double] = js.undefined
}
object Counters {
  
  inline def apply(): Counters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Counters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Counters] (val x: Self) extends AnyVal {
    
    inline def setIncompleteSubsCount(value: Double): Self = StObject.set(x, "incompleteSubsCount", value.asInstanceOf[js.Any])
    
    inline def setIncompleteSubsCountUndefined: Self = StObject.set(x, "incompleteSubsCount", js.undefined)
    
    inline def setQueuedCount(value: Double): Self = StObject.set(x, "queuedCount", value.asInstanceOf[js.Any])
    
    inline def setQueuedCountUndefined: Self = StObject.set(x, "queuedCount", js.undefined)
    
    inline def setQueuedManuallyCompletedCount(value: Double): Self = StObject.set(x, "queuedManuallyCompletedCount", value.asInstanceOf[js.Any])
    
    inline def setQueuedManuallyCompletedCountUndefined: Self = StObject.set(x, "queuedManuallyCompletedCount", js.undefined)
    
    inline def setVisibilityChangeCount(value: Double): Self = StObject.set(x, "visibilityChangeCount", value.asInstanceOf[js.Any])
    
    inline def setVisibilityChangeCountUndefined: Self = StObject.set(x, "visibilityChangeCount", js.undefined)
  }
}
