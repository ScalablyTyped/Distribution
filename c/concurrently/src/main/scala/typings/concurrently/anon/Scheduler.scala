package typings.concurrently.anon

import typings.concurrently.distSrcCompletionListenerMod.SuccessCondition
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scheduler extends StObject {
  
  /**
    * For testing only.
    */
  var scheduler: js.UndefOr[SchedulerLike] = js.undefined
  
  /**
    * How this instance will define that a list of commands ran successfully.
    * Defaults to `all`.
    *
    * @see {SuccessCondition}
    */
  var successCondition: js.UndefOr[SuccessCondition] = js.undefined
}
object Scheduler {
  
  inline def apply(): Scheduler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheduler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scheduler] (val x: Self) extends AnyVal {
    
    inline def setScheduler(value: SchedulerLike): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setSuccessCondition(value: SuccessCondition): Self = StObject.set(x, "successCondition", value.asInstanceOf[js.Any])
    
    inline def setSuccessConditionUndefined: Self = StObject.set(x, "successCondition", js.undefined)
  }
}
