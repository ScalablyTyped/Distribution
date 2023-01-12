package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryRunConfigOutput extends StObject {
  
  /**
    * Displays whether this canary run used active X-Ray tracing. 
    */
  var ActiveTracing: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of 64.
    */
  var MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined
  
  /**
    * How long the canary is allowed to run before it must stop.
    */
  var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined
}
object CanaryRunConfigOutput {
  
  inline def apply(): CanaryRunConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanaryRunConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setActiveTracing(value: NullableBoolean): Self = StObject.set(x, "ActiveTracing", value.asInstanceOf[js.Any])
    
    inline def setActiveTracingUndefined: Self = StObject.set(x, "ActiveTracing", js.undefined)
    
    inline def setMemoryInMB(value: MaxSize3008): Self = StObject.set(x, "MemoryInMB", value.asInstanceOf[js.Any])
    
    inline def setMemoryInMBUndefined: Self = StObject.set(x, "MemoryInMB", js.undefined)
    
    inline def setTimeoutInSeconds(value: MaxFifteenMinutesInSeconds): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "TimeoutInSeconds", js.undefined)
  }
}
