package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSummary extends StObject {
  
  /**
    *  The time at which the label was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The timestamp indicating the end of the label. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Indicates that a label pertains to a particular piece of equipment. 
    */
  var Equipment: js.UndefOr[typings.awsSdk.lookoutequipmentMod.Equipment] = js.undefined
  
  /**
    *  Indicates the type of anomaly associated with the label.  Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var FaultCode: js.UndefOr[typings.awsSdk.lookoutequipmentMod.FaultCode] = js.undefined
  
  /**
    *  The ARN of the label group. 
    */
  var LabelGroupArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LabelGroupArn] = js.undefined
  
  /**
    *  The name of the label group. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LabelGroupName] = js.undefined
  
  /**
    *  The ID of the label. 
    */
  var LabelId: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LabelId] = js.undefined
  
  /**
    *  Indicates whether a labeled event represents an anomaly. 
    */
  var Rating: js.UndefOr[LabelRating] = js.undefined
  
  /**
    *  The timestamp indicating the start of the label. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object LabelSummary {
  
  inline def apply(): LabelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSummary]
  }
  
  extension [Self <: LabelSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEquipment(value: Equipment): Self = StObject.set(x, "Equipment", value.asInstanceOf[js.Any])
    
    inline def setEquipmentUndefined: Self = StObject.set(x, "Equipment", js.undefined)
    
    inline def setFaultCode(value: FaultCode): Self = StObject.set(x, "FaultCode", value.asInstanceOf[js.Any])
    
    inline def setFaultCodeUndefined: Self = StObject.set(x, "FaultCode", js.undefined)
    
    inline def setLabelGroupArn(value: LabelGroupArn): Self = StObject.set(x, "LabelGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupArnUndefined: Self = StObject.set(x, "LabelGroupArn", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
    
    inline def setLabelId(value: LabelId): Self = StObject.set(x, "LabelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "LabelId", js.undefined)
    
    inline def setRating(value: LabelRating): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "Rating", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
