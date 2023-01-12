package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assignment
  extends StObject
     with BaseElement {
  
  var from: Expression
  
  var to: Expression
}
object Assignment {
  
  inline def apply($parent: TypeDerived, $type: ElementType, from: Expression, id: String, to: Expression): Assignment = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Expression): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Expression): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
