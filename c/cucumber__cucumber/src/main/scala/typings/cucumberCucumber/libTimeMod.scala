package typings.cucumberCucumber

import typings.cucumberCucumber.anon.FnCall
import typings.cucumberCucumber.anon.FnCallImmediateId
import typings.cucumberCucumber.anon.TypeofsetImmediate
import typings.cucumberCucumber.anon.TypeofsetInterval
import typings.cucumberCucumber.anon.TypeofsetTimeout
import typings.cucumberMessages.mod.Duration
import typings.cucumberMessages.mod.Timestamp
import typings.node.perfHooksMod.Performance_
import typings.node.timersMod.global.NodeJS.Immediate
import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimeMod {
  
  @JSImport("@cucumber/cucumber/lib/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Partial<@cucumber/cucumber.@cucumber/cucumber/lib/time.ProtectedTimingBuiltins> */
  object default {
    
    @JSImport("@cucumber/cucumber/lib/time", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber/lib/time", "default.Date")
    @js.native
    def Date: js.UndefOr[DateConstructor] = js.native
    inline def Date_=(x: js.UndefOr[DateConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.clearImmediate")
    @js.native
    def clearImmediate: js.UndefOr[FnCallImmediateId] = js.native
    inline def clearImmediate_=(x: js.UndefOr[FnCallImmediateId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearImmediate")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.clearInterval")
    @js.native
    def clearInterval: js.UndefOr[FnCall] = js.native
    inline def clearInterval_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.clearTimeout")
    @js.native
    def clearTimeout: js.UndefOr[FnCall] = js.native
    inline def clearTimeout_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.performance")
    @js.native
    def performance: js.UndefOr[Performance_] = js.native
    inline def performance_=(x: js.UndefOr[Performance_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("performance")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.setImmediate")
    @js.native
    def setImmediate: js.UndefOr[TypeofsetImmediate] = js.native
    inline def setImmediate_=(x: js.UndefOr[TypeofsetImmediate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.setInterval")
    @js.native
    def setInterval: js.UndefOr[TypeofsetInterval] = js.native
    inline def setInterval_=(x: js.UndefOr[TypeofsetInterval]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(x.asInstanceOf[js.Any])
    
    @JSImport("@cucumber/cucumber/lib/time", "default.setTimeout")
    @js.native
    def setTimeout: js.UndefOr[TypeofsetTimeout] = js.native
    inline def setTimeout_=(x: js.UndefOr[TypeofsetTimeout]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(x.asInstanceOf[js.Any])
  }
  
  inline def durationBetweenTimestamps(startedTimestamp: Timestamp, finishedTimestamp: Timestamp): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("durationBetweenTimestamps")(startedTimestamp.asInstanceOf[js.Any], finishedTimestamp.asInstanceOf[js.Any])).asInstanceOf[Duration]
  
  inline def wrapPromiseWithTimeout[T](promise: js.Promise[T], timeoutInMilliseconds: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapPromiseWithTimeout")(promise.asInstanceOf[js.Any], timeoutInMilliseconds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def wrapPromiseWithTimeout[T](promise: js.Promise[T], timeoutInMilliseconds: Double, timeoutMessage: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapPromiseWithTimeout")(promise.asInstanceOf[js.Any], timeoutInMilliseconds.asInstanceOf[js.Any], timeoutMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait ProtectedTimingBuiltins extends StObject {
    
    /* standard es5 */
    def Date(): String
    @JSName("Date")
    var Date_Original: DateConstructor
    
    def clearImmediate(): Unit
    def clearImmediate(immediateId: Immediate): Unit
    @JSName("clearImmediate")
    var clearImmediate_Original: FnCallImmediateId
    
    def clearInterval(): Unit
    def clearInterval(timeoutId: String): Unit
    def clearInterval(timeoutId: Double): Unit
    def clearInterval(timeoutId: Timeout): Unit
    @JSName("clearInterval")
    var clearInterval_Original: FnCall
    
    def clearTimeout(): Unit
    def clearTimeout(timeoutId: String): Unit
    def clearTimeout(timeoutId: Double): Unit
    def clearTimeout(timeoutId: Timeout): Unit
    @JSName("clearTimeout")
    var clearTimeout_Original: FnCall
    
    var performance: Performance_
    
    var setImmediate: TypeofsetImmediate
    
    var setInterval: TypeofsetInterval
    
    var setTimeout: TypeofsetTimeout
  }
  object ProtectedTimingBuiltins {
    
    inline def apply(
      Date: DateConstructor,
      clearImmediate: FnCallImmediateId,
      clearInterval: FnCall,
      clearTimeout: FnCall,
      performance: Performance_,
      setImmediate: TypeofsetImmediate,
      setInterval: TypeofsetInterval,
      setTimeout: TypeofsetTimeout
    ): ProtectedTimingBuiltins = {
      val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], clearImmediate = clearImmediate.asInstanceOf[js.Any], clearInterval = clearInterval.asInstanceOf[js.Any], clearTimeout = clearTimeout.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], setImmediate = setImmediate.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtectedTimingBuiltins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProtectedTimingBuiltins] (val x: Self) extends AnyVal {
      
      inline def setClearImmediate(value: FnCallImmediateId): Self = StObject.set(x, "clearImmediate", value.asInstanceOf[js.Any])
      
      inline def setClearInterval(value: FnCall): Self = StObject.set(x, "clearInterval", value.asInstanceOf[js.Any])
      
      inline def setClearTimeout(value: FnCall): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
      
      inline def setDate(value: DateConstructor): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Performance_): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setSetImmediate(value: TypeofsetImmediate): Self = StObject.set(x, "setImmediate", value.asInstanceOf[js.Any])
      
      inline def setSetInterval(value: TypeofsetInterval): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
      
      inline def setSetTimeout(value: TypeofsetTimeout): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    }
  }
}
