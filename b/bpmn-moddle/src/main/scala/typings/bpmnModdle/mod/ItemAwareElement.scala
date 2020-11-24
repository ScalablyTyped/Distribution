package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemAwareElement extends BaseElement {
  
  var dataState: DataState = js.native
  
  var itemSubjectRef: ItemDefinition = js.native
}
object ItemAwareElement {
  
  @scala.inline
  def apply(
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
  implicit class ItemAwareElementOps[Self <: ItemAwareElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataState(value: DataState): Self = this.set("dataState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSubjectRef(value: ItemDefinition): Self = this.set("itemSubjectRef", value.asInstanceOf[js.Any])
  }
}
