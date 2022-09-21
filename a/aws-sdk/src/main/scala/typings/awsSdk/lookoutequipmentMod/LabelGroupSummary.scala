package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelGroupSummary extends StObject {
  
  /**
    *  The time at which the label group was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of the label group. 
    */
  var LabelGroupArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LabelGroupArn] = js.undefined
  
  /**
    *  The name of the label group. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.LabelGroupName] = js.undefined
  
  /**
    *  The time at which the label group was updated. 
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object LabelGroupSummary {
  
  inline def apply(): LabelGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelGroupSummary]
  }
  
  extension [Self <: LabelGroupSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setLabelGroupArn(value: LabelGroupArn): Self = StObject.set(x, "LabelGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupArnUndefined: Self = StObject.set(x, "LabelGroupArn", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
