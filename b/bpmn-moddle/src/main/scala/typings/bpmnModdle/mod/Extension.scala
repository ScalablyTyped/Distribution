package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extension
  extends StObject
     with TypeDerived {
  
  var definition: ExtensionDefinition
  
  /**
    * @default false
    */
  var mustUnderstand: Boolean
}
object Extension {
  
  inline def apply($parent: TypeDerived, $type: ElementType, definition: ExtensionDefinition, mustUnderstand: Boolean): Extension = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], mustUnderstand = mustUnderstand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  extension [Self <: Extension](x: Self) {
    
    inline def setDefinition(value: ExtensionDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setMustUnderstand(value: Boolean): Self = StObject.set(x, "mustUnderstand", value.asInstanceOf[js.Any])
  }
}
