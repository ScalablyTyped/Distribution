package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HPOResourceConfig extends StObject {
  
  /**
    * The maximum number of training jobs when you create a solution version. The maximum value for maxNumberOfTrainingJobs is 40.
    */
  var maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.native
  
  /**
    * The maximum number of parallel training jobs when you create a solution version. The maximum value for maxParallelTrainingJobs is 10.
    */
  var maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.native
}
object HPOResourceConfig {
  
  @scala.inline
  def apply(): HPOResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOResourceConfig]
  }
  
  @scala.inline
  implicit class HPOResourceConfigMutableBuilder[Self <: HPOResourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNumberOfTrainingJobs(value: HPOResource): Self = StObject.set(x, "maxNumberOfTrainingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumberOfTrainingJobsUndefined: Self = StObject.set(x, "maxNumberOfTrainingJobs", js.undefined)
    
    @scala.inline
    def setMaxParallelTrainingJobs(value: HPOResource): Self = StObject.set(x, "maxParallelTrainingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelTrainingJobsUndefined: Self = StObject.set(x, "maxParallelTrainingJobs", js.undefined)
  }
}
