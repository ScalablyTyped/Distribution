package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyMonitor extends StObject {
  
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
  implicit class AnomalyMonitorMutableBuilder[Self <: AnomalyMonitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: YearMonthDay): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDimensionalValueCount(value: NonNegativeInteger): Self = StObject.set(x, "DimensionalValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionalValueCountUndefined: Self = StObject.set(x, "DimensionalValueCount", js.undefined)
    
    @scala.inline
    def setLastEvaluatedDate(value: YearMonthDay): Self = StObject.set(x, "LastEvaluatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEvaluatedDateUndefined: Self = StObject.set(x, "LastEvaluatedDate", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: YearMonthDay): Self = StObject.set(x, "LastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "LastUpdatedDate", js.undefined)
    
    @scala.inline
    def setMonitorArn(value: GenericString): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    @scala.inline
    def setMonitorDimension(value: MonitorDimension): Self = StObject.set(x, "MonitorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorDimensionUndefined: Self = StObject.set(x, "MonitorDimension", js.undefined)
    
    @scala.inline
    def setMonitorName(value: GenericString): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorSpecification(value: Expression): Self = StObject.set(x, "MonitorSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorSpecificationUndefined: Self = StObject.set(x, "MonitorSpecification", js.undefined)
    
    @scala.inline
    def setMonitorType(value: MonitorType): Self = StObject.set(x, "MonitorType", value.asInstanceOf[js.Any])
  }
}
