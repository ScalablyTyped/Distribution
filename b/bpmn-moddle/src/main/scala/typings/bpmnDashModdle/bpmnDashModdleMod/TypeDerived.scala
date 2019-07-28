package typings.bpmnDashModdle.bpmnDashModdleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDerived extends js.Object {
  @JSName("$parent")
  var $parent: TypeDerived
  @JSName("$type")
  var $type: ElementType
}

object TypeDerived {
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType): TypeDerived = {
    val __obj = js.Dynamic.literal($parent = $parent, $type = $type)
  
    __obj.asInstanceOf[TypeDerived]
  }
}

