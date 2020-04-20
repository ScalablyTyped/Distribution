package typings.bpmnModdle.mod

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
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDerived]
  }
}

