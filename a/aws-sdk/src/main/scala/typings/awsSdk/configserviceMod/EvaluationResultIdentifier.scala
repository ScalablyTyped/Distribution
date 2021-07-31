package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResultIdentifier extends StObject {
  
  /**
    * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated resource.
    */
  var EvaluationResultQualifier: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResultQualifier] = js.undefined
  
  /**
    * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config delivered a configuration item change notification, or it can indicate when AWS Config delivered the configuration snapshot, depending on which event triggered the evaluation.
    */
  var OrderingTimestamp: js.UndefOr[Date] = js.undefined
}
object EvaluationResultIdentifier {
  
  @scala.inline
  def apply(): EvaluationResultIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultIdentifier]
  }
  
  @scala.inline
  implicit class EvaluationResultIdentifierMutableBuilder[Self <: EvaluationResultIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationResultQualifier(value: EvaluationResultQualifier): Self = StObject.set(x, "EvaluationResultQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultQualifierUndefined: Self = StObject.set(x, "EvaluationResultQualifier", js.undefined)
    
    @scala.inline
    def setOrderingTimestamp(value: Date): Self = StObject.set(x, "OrderingTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderingTimestampUndefined: Self = StObject.set(x, "OrderingTimestamp", js.undefined)
  }
}
