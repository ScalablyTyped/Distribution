package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideAnomalyFeedbackResponse extends StObject {
  
  /**
    *  The ID of the modified cost anomaly. 
    */
  var AnomalyId: GenericString = js.native
}
object ProvideAnomalyFeedbackResponse {
  
  @scala.inline
  def apply(AnomalyId: GenericString): ProvideAnomalyFeedbackResponse = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideAnomalyFeedbackResponse]
  }
  
  @scala.inline
  implicit class ProvideAnomalyFeedbackResponseMutableBuilder[Self <: ProvideAnomalyFeedbackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalyId(value: GenericString): Self = StObject.set(x, "AnomalyId", value.asInstanceOf[js.Any])
  }
}
