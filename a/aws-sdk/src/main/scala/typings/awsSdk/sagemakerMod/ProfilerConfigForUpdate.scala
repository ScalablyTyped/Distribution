package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerConfigForUpdate extends StObject {
  
  /**
    * To disable Debugger monitoring and profiling, set to True.
    */
  var DisableProfiler: js.UndefOr[typings.awsSdk.sagemakerMod.DisableProfiler] = js.undefined
  
  /**
    * A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1 second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
    */
  var ProfilingIntervalInMilliseconds: js.UndefOr[typings.awsSdk.sagemakerMod.ProfilingIntervalInMilliseconds] = js.undefined
  
  /**
    * Configuration information for capturing framework metrics. Available key strings for different profiling options are DetailedProfilingConfig, PythonProfilingConfig, and DataLoaderProfilingConfig. The following codes are configuration structures for the ProfilingParameters parameter. To learn more about how to configure the ProfilingParameters parameter, see Use the SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job. 
    */
  var ProfilingParameters: js.UndefOr[typings.awsSdk.sagemakerMod.ProfilingParameters] = js.undefined
  
  /**
    * Path to Amazon S3 storage location for system and framework metrics.
    */
  var S3OutputPath: js.UndefOr[S3Uri] = js.undefined
}
object ProfilerConfigForUpdate {
  
  inline def apply(): ProfilerConfigForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfilerConfigForUpdate]
  }
  
  extension [Self <: ProfilerConfigForUpdate](x: Self) {
    
    inline def setDisableProfiler(value: DisableProfiler): Self = StObject.set(x, "DisableProfiler", value.asInstanceOf[js.Any])
    
    inline def setDisableProfilerUndefined: Self = StObject.set(x, "DisableProfiler", js.undefined)
    
    inline def setProfilingIntervalInMilliseconds(value: ProfilingIntervalInMilliseconds): Self = StObject.set(x, "ProfilingIntervalInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setProfilingIntervalInMillisecondsUndefined: Self = StObject.set(x, "ProfilingIntervalInMilliseconds", js.undefined)
    
    inline def setProfilingParameters(value: ProfilingParameters): Self = StObject.set(x, "ProfilingParameters", value.asInstanceOf[js.Any])
    
    inline def setProfilingParametersUndefined: Self = StObject.set(x, "ProfilingParameters", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setS3OutputPathUndefined: Self = StObject.set(x, "S3OutputPath", js.undefined)
  }
}
