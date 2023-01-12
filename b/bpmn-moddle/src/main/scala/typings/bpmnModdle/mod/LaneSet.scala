package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaneSet
  extends StObject
     with BaseElement {
  
  var lanes: js.Array[Lane]
  
  var name: String
}
object LaneSet {
  
  inline def apply($parent: TypeDerived, $type: ElementType, id: String, lanes: js.Array[Lane], name: String): LaneSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaneSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaneSet] (val x: Self) extends AnyVal {
    
    inline def setLanes(value: js.Array[Lane]): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
    
    inline def setLanesVarargs(value: Lane*): Self = StObject.set(x, "lanes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
