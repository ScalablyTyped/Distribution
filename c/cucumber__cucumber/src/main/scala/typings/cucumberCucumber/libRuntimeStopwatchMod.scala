package typings.cucumberCucumber

import typings.cucumberMessages.mod.Duration
import typings.cucumberMessages.mod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuntimeStopwatchMod {
  
  @JSImport("@cucumber/cucumber/lib/runtime/stopwatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): IStopwatch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[IStopwatch]
  inline def create(base: Duration): IStopwatch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(base.asInstanceOf[js.Any]).asInstanceOf[IStopwatch]
  
  trait IStopwatch extends StObject {
    
    def duration(): Duration
    
    def start(): IStopwatch
    
    def stop(): IStopwatch
    
    def timestamp(): Timestamp
  }
  object IStopwatch {
    
    inline def apply(
      duration: () => Duration,
      start: () => IStopwatch,
      stop: () => IStopwatch,
      timestamp: () => Timestamp
    ): IStopwatch = {
      val __obj = js.Dynamic.literal(duration = js.Any.fromFunction0(duration), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), timestamp = js.Any.fromFunction0(timestamp))
      __obj.asInstanceOf[IStopwatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStopwatch] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: () => Duration): Self = StObject.set(x, "duration", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => IStopwatch): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => IStopwatch): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTimestamp(value: () => Timestamp): Self = StObject.set(x, "timestamp", js.Any.fromFunction0(value))
    }
  }
}
