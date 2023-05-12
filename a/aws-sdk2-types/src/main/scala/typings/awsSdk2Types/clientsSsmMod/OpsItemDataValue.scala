package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemDataValue extends StObject {
  
  /**
    * The type of key-value pair. Valid types include SearchableString and String.
    */
  var Type: js.UndefOr[OpsItemDataType] = js.undefined
  
  /**
    * The value of the OperationalData key.
    */
  var Value: js.UndefOr[OpsItemDataValueString] = js.undefined
}
object OpsItemDataValue {
  
  inline def apply(): OpsItemDataValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemDataValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpsItemDataValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: OpsItemDataType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: OpsItemDataValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
