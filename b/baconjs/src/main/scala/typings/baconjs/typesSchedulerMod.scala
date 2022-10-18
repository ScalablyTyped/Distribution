package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSchedulerMod {
  
  @JSImport("baconjs/types/scheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("baconjs/types/scheduler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/scheduler", "default.scheduler")
    @js.native
    def scheduler: Scheduler = js.native
    inline def scheduler_=(x: Scheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baconjs/types/scheduler", "defaultScheduler")
  @js.native
  val defaultScheduler: Scheduler = js.native
  
  inline def getScheduler(): Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("getScheduler")().asInstanceOf[Scheduler]
  
  inline def setScheduler(newScheduler: Scheduler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScheduler")(newScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Scheduler extends StObject {
    
    def clearInterval(id: Double): Any
    
    def clearTimeout(id: Double): Any
    
    def now(): Double
    
    def setInterval(f: js.Function, i: Double): Double
    
    def setTimeout(f: js.Function, d: Double): Double
  }
  object Scheduler {
    
    inline def apply(
      clearInterval: Double => Any,
      clearTimeout: Double => Any,
      now: () => Double,
      setInterval: (js.Function, Double) => Double,
      setTimeout: (js.Function, Double) => Double
    ): Scheduler = {
      val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), now = js.Any.fromFunction0(now), setInterval = js.Any.fromFunction2(setInterval), setTimeout = js.Any.fromFunction2(setTimeout))
      __obj.asInstanceOf[Scheduler]
    }
    
    extension [Self <: Scheduler](x: Self) {
      
      inline def setClearInterval(value: Double => Any): Self = StObject.set(x, "clearInterval", js.Any.fromFunction1(value))
      
      inline def setClearTimeout(value: Double => Any): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      inline def setSetInterval(value: (js.Function, Double) => Double): Self = StObject.set(x, "setInterval", js.Any.fromFunction2(value))
      
      inline def setSetTimeout(value: (js.Function, Double) => Double): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
    }
  }
}
