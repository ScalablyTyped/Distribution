package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoppingCondition extends StObject {
  
  /**
    * The maximum length of time, in seconds, that the training or compilation job can run. If job does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. The maximum value is 28 days.
    */
  var MaxRuntimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxRuntimeInSeconds] = js.undefined
  
  /**
    * The maximum length of time, in seconds, how long you are willing to wait for a managed spot training job to complete. It is the amount of time spent waiting for Spot capacity plus the amount of time the training job runs. It must be equal to or greater than MaxRuntimeInSeconds. 
    */
  var MaxWaitTimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxWaitTimeInSeconds] = js.undefined
}
object StoppingCondition {
  
  inline def apply(): StoppingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoppingCondition]
  }
  
  extension [Self <: StoppingCondition](x: Self) {
    
    inline def setMaxRuntimeInSeconds(value: MaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxRuntimeInSecondsUndefined: Self = StObject.set(x, "MaxRuntimeInSeconds", js.undefined)
    
    inline def setMaxWaitTimeInSeconds(value: MaxWaitTimeInSeconds): Self = StObject.set(x, "MaxWaitTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitTimeInSecondsUndefined: Self = StObject.set(x, "MaxWaitTimeInSeconds", js.undefined)
  }
}
