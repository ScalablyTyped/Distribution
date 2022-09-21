package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrainingJobRequest extends StObject {
  
  /**
    * Configuration information for Debugger system monitoring, framework profiling, and storage paths.
    */
  var ProfilerConfig: js.UndefOr[ProfilerConfigForUpdate] = js.undefined
  
  /**
    * Configuration information for Debugger rules for profiling system and framework metrics.
    */
  var ProfilerRuleConfigurations: js.UndefOr[typings.awsSdk.sagemakerMod.ProfilerRuleConfigurations] = js.undefined
  
  /**
    * The name of a training job to update the Debugger profiling configuration.
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName
}
object UpdateTrainingJobRequest {
  
  inline def apply(TrainingJobName: TrainingJobName): UpdateTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrainingJobRequest]
  }
  
  extension [Self <: UpdateTrainingJobRequest](x: Self) {
    
    inline def setProfilerConfig(value: ProfilerConfigForUpdate): Self = StObject.set(x, "ProfilerConfig", value.asInstanceOf[js.Any])
    
    inline def setProfilerConfigUndefined: Self = StObject.set(x, "ProfilerConfig", js.undefined)
    
    inline def setProfilerRuleConfigurations(value: ProfilerRuleConfigurations): Self = StObject.set(x, "ProfilerRuleConfigurations", value.asInstanceOf[js.Any])
    
    inline def setProfilerRuleConfigurationsUndefined: Self = StObject.set(x, "ProfilerRuleConfigurations", js.undefined)
    
    inline def setProfilerRuleConfigurationsVarargs(value: ProfilerRuleConfiguration*): Self = StObject.set(x, "ProfilerRuleConfigurations", js.Array(value*))
    
    inline def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
  }
}
