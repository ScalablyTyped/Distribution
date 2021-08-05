package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultAttribute extends StObject {
  
  /**
    * Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.
    */
  var TypeName: InventoryItemTypeName
}
object ResultAttribute {
  
  inline def apply(TypeName: InventoryItemTypeName): ResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultAttribute]
  }
  
  extension [Self <: ResultAttribute](x: Self) {
    
    inline def setTypeName(value: InventoryItemTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
