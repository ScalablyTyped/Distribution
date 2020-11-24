package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyMonitor extends js.Object {
  
  /**
    *  The date when the monitor was created. 
    */
  var CreationDate: js.UndefOr[YearMonthDay] = js.native
  
  /**
    *  The value for evaluated dimensions. 
    */
  var DimensionalValueCount: js.UndefOr[NonNegativeInteger] = js.native
  
  /**
    *  The date when the monitor last evaluated for anomalies. 
    */
  var LastEvaluatedDate: js.UndefOr[YearMonthDay] = js.native
  
  /**
    *  The date when the monitor was last updated. 
    */
  var LastUpdatedDate: js.UndefOr[YearMonthDay] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) value. 
    */
  var MonitorArn: js.UndefOr[GenericString] = js.native
  
  /**
    *  The dimensions to evaluate. 
    */
  var MonitorDimension: js.UndefOr[typings.awsSdk.costexplorerMod.MonitorDimension] = js.native
  
  /**
    *  The name of the monitor. 
    */
  var MonitorName: GenericString = js.native
  
  var MonitorSpecification: js.UndefOr[Expression] = js.native
  
  /**
    *  The possible type values. 
    */
  var MonitorType: typings.awsSdk.costexplorerMod.MonitorType = js.native
}
object AnomalyMonitor {
  
  @scala.inline
  def apply(MonitorName: GenericString, MonitorType: MonitorType): AnomalyMonitor = {
    val __obj = js.Dynamic.literal(MonitorName = MonitorName.asInstanceOf[js.Any], MonitorType = MonitorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnomalyMonitor]
  }
  
  @scala.inline
  implicit class AnomalyMonitorOps[Self <: AnomalyMonitor] (val x: Self) extends AnyVal {
    
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
    def setMonitorName(value: GenericString): Self = this.set("MonitorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorType(value: MonitorType): Self = this.set("MonitorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: YearMonthDay): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setDimensionalValueCount(value: NonNegativeInteger): Self = this.set("DimensionalValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionalValueCount: Self = this.set("DimensionalValueCount", js.undefined)
    
    @scala.inline
    def setLastEvaluatedDate(value: YearMonthDay): Self = this.set("LastEvaluatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedDate: Self = this.set("LastEvaluatedDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: YearMonthDay): Self = this.set("LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = this.set("MonitorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorArn: Self = this.set("MonitorArn", js.undefined)
    
    @scala.inline
    def setMonitorDimension(value: MonitorDimension): Self = this.set("MonitorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorDimension: Self = this.set("MonitorDimension", js.undefined)
    
    @scala.inline
    def setMonitorSpecification(value: Expression): Self = this.set("MonitorSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorSpecification: Self = this.set("MonitorSpecification", js.undefined)
  }
}
