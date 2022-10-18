package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryRunConfigInput extends StObject {
  
  /**
    * Specifies whether this canary is to use active X-Ray tracing when it runs. Active tracing enables this canary run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that has X-Ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see  Canaries and X-Ray tracing. You can enable active tracing only for canaries that use version syn-nodejs-2.0 or later for their canary runtime.
    */
  var ActiveTracing: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Specifies the keys and values to use for any environment variables used in the canary script. Use the following format: { "key1" : "value1", "key2" : "value2", ...} Keys must start with a letter and be at least two characters. The total size of your environment variables cannot exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your environment variables. For more information about reserved keys, see  Runtime environment variables.  The environment variables keys and values are not encrypted. Do not store sensitive information in this field. 
    */
  var EnvironmentVariables: js.UndefOr[EnvironmentVariablesMap] = js.undefined
  
  /**
    * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of 64.
    */
  var MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined
  
  /**
    * How long the canary is allowed to run before it must stop. You can't set this time to be longer than the frequency of the runs of this canary. If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
    */
  var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined
}
object CanaryRunConfigInput {
  
  inline def apply(): CanaryRunConfigInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunConfigInput]
  }
  
  extension [Self <: CanaryRunConfigInput](x: Self) {
    
    inline def setActiveTracing(value: NullableBoolean): Self = StObject.set(x, "ActiveTracing", value.asInstanceOf[js.Any])
    
    inline def setActiveTracingUndefined: Self = StObject.set(x, "ActiveTracing", js.undefined)
    
    inline def setEnvironmentVariables(value: EnvironmentVariablesMap): Self = StObject.set(x, "EnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "EnvironmentVariables", js.undefined)
    
    inline def setMemoryInMB(value: MaxSize3008): Self = StObject.set(x, "MemoryInMB", value.asInstanceOf[js.Any])
    
    inline def setMemoryInMBUndefined: Self = StObject.set(x, "MemoryInMB", js.undefined)
    
    inline def setTimeoutInSeconds(value: MaxFifteenMinutesInSeconds): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "TimeoutInSeconds", js.undefined)
  }
}
