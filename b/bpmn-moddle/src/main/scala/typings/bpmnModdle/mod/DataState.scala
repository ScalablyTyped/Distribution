package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataState
  extends StObject
     with BaseElement {
  
  var name: String
}
object DataState {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, name: String): DataState = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataState]
  }
  
  @scala.inline
  implicit class DataStateMutableBuilder[Self <: DataState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
