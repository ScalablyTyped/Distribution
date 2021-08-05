package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HPOResourceConfig extends StObject {
  
  /**
    * The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
    */
  var maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.undefined
  
  /**
    * The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
    */
  var maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.undefined
}
object HPOResourceConfig {
  
  inline def apply(): HPOResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOResourceConfig]
  }
  
  extension [Self <: HPOResourceConfig](x: Self) {
    
    inline def setMaxNumberOfTrainingJobs(value: HPOResource): Self = StObject.set(x, "maxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfTrainingJobsUndefined: Self = StObject.set(x, "maxNumberOfTrainingJobs", js.undefined)
    
    inline def setMaxParallelTrainingJobs(value: HPOResource): Self = StObject.set(x, "maxParallelTrainingJobs", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelTrainingJobsUndefined: Self = StObject.set(x, "maxParallelTrainingJobs", js.undefined)
  }
}
