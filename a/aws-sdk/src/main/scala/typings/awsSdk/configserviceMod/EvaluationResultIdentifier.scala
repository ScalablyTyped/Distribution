package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationResultIdentifier extends js.Object {
  
  /**
    * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated resource.
    */
  var EvaluationResultQualifier: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResultQualifier] = js.native
  
  /**
    * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config delivered a configuration item change notification, or it can indicate when AWS Config delivered the configuration snapshot, depending on which event triggered the evaluation.
    */
  var OrderingTimestamp: js.UndefOr[Date] = js.native
}
object EvaluationResultIdentifier {
  
  @scala.inline
  def apply(): EvaluationResultIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResultIdentifier]
  }
  
  @scala.inline
  implicit class EvaluationResultIdentifierOps[Self <: EvaluationResultIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvaluationResultQualifier(value: EvaluationResultQualifier): Self = this.set("EvaluationResultQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationResultQualifier: Self = this.set("EvaluationResultQualifier", js.undefined)
    
    @scala.inline
    def setOrderingTimestamp(value: Date): Self = this.set("OrderingTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderingTimestamp: Self = this.set("OrderingTimestamp", js.undefined)
  }
}
