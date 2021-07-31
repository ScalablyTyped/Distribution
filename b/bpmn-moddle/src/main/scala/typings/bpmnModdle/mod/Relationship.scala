package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relationship
  extends StObject
     with BaseElement {
  
  var direction: RelationshipDirection
  
  var source: js.Array[BaseElement]
  
  var target: js.Array[BaseElement]
  
  var `type`: String
}
object Relationship {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    direction: RelationshipDirection,
    id: String,
    source: js.Array[BaseElement],
    target: js.Array[BaseElement],
    `type`: String
  ): Relationship = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relationship]
  }
  
  @scala.inline
  implicit class RelationshipMutableBuilder[Self <: Relationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: RelationshipDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: js.Array[BaseElement]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVarargs(value: BaseElement*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Array[BaseElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: BaseElement*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
