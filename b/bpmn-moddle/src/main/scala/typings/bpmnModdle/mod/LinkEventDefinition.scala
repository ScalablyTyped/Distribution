package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkEventDefinition extends BaseElement {
  
  var name: String = js.native
  
  var source: LinkEventDefinition = js.native
  
  var target: LinkEventDefinition = js.native
}
object LinkEventDefinition {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LinkEventDefinitionMutableBuilder[Self <: LinkEventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: LinkEventDefinition): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: LinkEventDefinition): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
