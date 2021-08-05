package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signal
  extends StObject
     with BaseElement {
  
  var name: String
  
  var structureRef: ItemDefinition
}
object Signal {
  
  inline def apply($parent: TypeDerived, $type: ElementType, id: String, name: String, structureRef: ItemDefinition): Signal = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  extension [Self <: Signal](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStructureRef(value: ItemDefinition): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}
