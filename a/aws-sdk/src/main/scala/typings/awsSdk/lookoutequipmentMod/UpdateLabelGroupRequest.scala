package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLabelGroupRequest extends StObject {
  
  /**
    *  Updates the code indicating the type of anomaly associated with the label.  Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var FaultCodes: js.UndefOr[typings.awsSdk.lookoutequipmentMod.FaultCodes] = js.undefined
  
  /**
    *  The name of the label group to be updated. 
    */
  var LabelGroupName: typings.awsSdk.lookoutequipmentMod.LabelGroupName
}
object UpdateLabelGroupRequest {
  
  inline def apply(LabelGroupName: LabelGroupName): UpdateLabelGroupRequest = {
    val __obj = js.Dynamic.literal(LabelGroupName = LabelGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLabelGroupRequest]
  }
  
  extension [Self <: UpdateLabelGroupRequest](x: Self) {
    
    inline def setFaultCodes(value: FaultCodes): Self = StObject.set(x, "FaultCodes", value.asInstanceOf[js.Any])
    
    inline def setFaultCodesUndefined: Self = StObject.set(x, "FaultCodes", js.undefined)
    
    inline def setFaultCodesVarargs(value: FaultCode*): Self = StObject.set(x, "FaultCodes", js.Array(value*))
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
  }
}
