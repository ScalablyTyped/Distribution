package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkEventDefinition
  extends StObject
     with BaseElement {
  
  var name: String
  
  var source: LinkEventDefinition
  
  var target: LinkEventDefinition
}
object LinkEventDefinition {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    source: LinkEventDefinition,
    target: LinkEventDefinition
  ): LinkEventDefinition = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkEventDefinition]
  }
  
  extension [Self <: LinkEventDefinition](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: LinkEventDefinition): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: LinkEventDefinition): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
