package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemAwareElement
  extends StObject
     with BaseElement {
  
  var dataState: DataState
  
  var itemSubjectRef: ItemDefinition
}
object ItemAwareElement {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataState: DataState,
    id: String,
    itemSubjectRef: ItemDefinition
  ): ItemAwareElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataState = dataState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemSubjectRef = itemSubjectRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAwareElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemAwareElement] (val x: Self) extends AnyVal {
    
    inline def setDataState(value: DataState): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    inline def setItemSubjectRef(value: ItemDefinition): Self = StObject.set(x, "itemSubjectRef", value.asInstanceOf[js.Any])
  }
}
