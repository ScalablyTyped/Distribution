package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISerializedGast extends StObject {
  
  var definition: js.UndefOr[js.Array[ISerializedGast]] = js.undefined
  
  var `type`: ProductionType
}
object ISerializedGast {
  
  inline def apply(`type`: ProductionType): ISerializedGast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerializedGast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISerializedGast] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: js.Array[ISerializedGast]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: ISerializedGast*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setType(value: ProductionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
