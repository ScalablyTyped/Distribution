package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSlotTypeVersionRequest extends StObject {
  
  /**
    * The name of the slot type.
    */
  var name: SlotTypeName
  
  /**
    * The version of the slot type to delete. You cannot delete the $LATEST version of the slot type. To delete the $LATEST version, use the DeleteSlotType operation.
    */
  var version: NumericalVersion
}
object DeleteSlotTypeVersionRequest {
  
  inline def apply(name: SlotTypeName, version: NumericalVersion): DeleteSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotTypeVersionRequest]
  }
  
  extension [Self <: DeleteSlotTypeVersionRequest](x: Self) {
    
    inline def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
