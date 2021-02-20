package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signal extends BaseElement {
  
  var name: String = js.native
  
  var structureRef: ItemDefinition = js.native
}
object Signal {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, name: String, structureRef: ItemDefinition): Signal = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  @scala.inline
  implicit class SignalMutableBuilder[Self <: Signal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureRef(value: ItemDefinition): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}
