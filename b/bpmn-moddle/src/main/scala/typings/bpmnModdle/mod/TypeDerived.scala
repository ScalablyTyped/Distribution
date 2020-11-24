package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDerived extends js.Object {
  
  @JSName("$parent")
  var $parent: TypeDerived = js.native
  
  @JSName("$type")
  var $type: ElementType = js.native
}
object TypeDerived {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType): TypeDerived = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDerived]
  }
  
  @scala.inline
  implicit class TypeDerivedOps[Self <: TypeDerived] (val x: Self) extends AnyVal {
    
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
    def set$parent(value: TypeDerived): Self = this.set("$parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$type(value: ElementType): Self = this.set("$type", value.asInstanceOf[js.Any])
  }
}
