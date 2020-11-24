package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anomaly extends js.Object {
  
  /**
    *  The last day the anomaly is detected. 
    */
  var AnomalyEndDate: js.UndefOr[YearMonthDay] = js.native
  
  /**
    *  The unique identifier for the anomaly. 
    */
  var AnomalyId: GenericString = js.native
  
  /**
    *  The latest and maximum score for the anomaly. 
    */
  var AnomalyScore: typings.awsSdk.costexplorerMod.AnomalyScore = js.native
  
  /**
    *  The first day the anomaly is detected. 
    */
  var AnomalyStartDate: js.UndefOr[YearMonthDay] = js.native
  
  /**
    *  The dimension for the anomaly. For example, an AWS service in a service monitor. 
    */
  var DimensionValue: js.UndefOr[GenericString] = js.native
  
  /**
    *  The feedback value. 
    */
  var Feedback: js.UndefOr[AnomalyFeedbackType] = js.native
  
  /**
    *  The dollar impact for the anomaly. 
    */
  var Impact: typings.awsSdk.costexplorerMod.Impact = js.native
  
  /**
    *  The Amazon Resource Name (ARN) for the cost monitor that generated this anomaly. 
    */
  var MonitorArn: GenericString = js.native
  
  /**
    *  The list of identified root causes for the anomaly. 
    */
  var RootCauses: js.UndefOr[typings.awsSdk.costexplorerMod.RootCauses] = js.native
}
object Anomaly {
  
  @scala.inline
  def apply(AnomalyId: GenericString, AnomalyScore: AnomalyScore, Impact: Impact, MonitorArn: GenericString): Anomaly = {
    val __obj = js.Dynamic.literal(AnomalyId = AnomalyId.asInstanceOf[js.Any], AnomalyScore = AnomalyScore.asInstanceOf[js.Any], Impact = Impact.asInstanceOf[js.Any], MonitorArn = MonitorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anomaly]
  }
  
  @scala.inline
  implicit class AnomalyOps[Self <: Anomaly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnomalyId(value: GenericString): Self = this.set("AnomalyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomalyScore(value: AnomalyScore): Self = this.set("AnomalyScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpact(value: Impact): Self = this.set("Impact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = this.set("MonitorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomalyEndDate(value: YearMonthDay): Self = this.set("AnomalyEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnomalyEndDate: Self = this.set("AnomalyEndDate", js.undefined)
    
    @scala.inline
    def setAnomalyStartDate(value: YearMonthDay): Self = this.set("AnomalyStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnomalyStartDate: Self = this.set("AnomalyStartDate", js.undefined)
    
    @scala.inline
    def setDimensionValue(value: GenericString): Self = this.set("DimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValue: Self = this.set("DimensionValue", js.undefined)
    
    @scala.inline
    def setFeedback(value: AnomalyFeedbackType): Self = this.set("Feedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedback: Self = this.set("Feedback", js.undefined)
    
    @scala.inline
    def setRootCausesVarargs(value: RootCause*): Self = this.set("RootCauses", js.Array(value :_*))
    
    @scala.inline
    def setRootCauses(value: RootCauses): Self = this.set("RootCauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCauses: Self = this.set("RootCauses", js.undefined)
  }
}
