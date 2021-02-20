package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyInstance extends StObject {
  
  /**
    *  The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The universally unique identifier (UUID) of an instance of an anomaly in a metric. 
    */
  var id: String = js.native
  
  /**
    *  The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var startTime: Timestamp = js.native
  
  /**
    * Feedback type on a specific instance of anomaly submitted by the user.
    */
  var userFeedback: js.UndefOr[UserFeedback] = js.native
}
object AnomalyInstance {
  
  @scala.inline
  def apply(id: String, startTime: Timestamp): AnomalyInstance = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyInstance]
  }
  
  @scala.inline
  implicit class AnomalyInstanceMutableBuilder[Self <: AnomalyInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFeedback(value: UserFeedback): Self = StObject.set(x, "userFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFeedbackUndefined: Self = StObject.set(x, "userFeedback", js.undefined)
  }
}
