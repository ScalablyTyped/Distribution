package typings.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var logger: typings.concurrently.loggerMod.Logger
  
  var scheduler: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.SchedulerLike */ Any
  ] = js.undefined
  
  var tries: js.UndefOr[Double] = js.undefined
}
object Delay {
  
  inline def apply(logger: typings.concurrently.loggerMod.Logger): Delay = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  extension [Self <: Delay](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setLogger(value: typings.concurrently.loggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setScheduler(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rx.SchedulerLike */ Any
    ): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
    
    inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
    
    inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
    
    inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
  }
}
