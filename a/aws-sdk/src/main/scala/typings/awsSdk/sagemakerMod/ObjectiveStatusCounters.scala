package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectiveStatusCounters extends StObject {
  
  /**
    * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.
    */
  var Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined
  
  /**
    * The number of training jobs that are in progress and pending evaluation of their final objective metric.
    */
  var Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined
  
  /**
    * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.
    */
  var Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined
}
object ObjectiveStatusCounters {
  
  @scala.inline
  def apply(): ObjectiveStatusCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectiveStatusCounters]
  }
  
  @scala.inline
  implicit class ObjectiveStatusCountersMutableBuilder[Self <: ObjectiveStatusCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailed(value: ObjectiveStatusCounter): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    @scala.inline
    def setPending(value: ObjectiveStatusCounter): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    @scala.inline
    def setSucceeded(value: ObjectiveStatusCounter): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
  }
}
