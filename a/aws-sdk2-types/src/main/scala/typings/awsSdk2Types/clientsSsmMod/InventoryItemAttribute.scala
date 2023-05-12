package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItemAttribute extends StObject {
  
  /**
    * The data type of the inventory item attribute. 
    */
  var DataType: InventoryAttributeDataType
  
  /**
    * Name of the inventory item attribute.
    */
  var Name: InventoryItemAttributeName
}
object InventoryItemAttribute {
  
  inline def apply(DataType: InventoryAttributeDataType, Name: InventoryItemAttributeName): InventoryItemAttribute = {
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItemAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItemAttribute] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: InventoryAttributeDataType): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setName(value: InventoryItemAttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
