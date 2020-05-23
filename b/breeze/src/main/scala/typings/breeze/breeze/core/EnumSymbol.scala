package typings.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumSymbol extends js.Object {
  var parentEnum: IEnum
  def getName(): String
}

object EnumSymbol {
  @scala.inline
  def apply(getName: () => String, parentEnum: IEnum): EnumSymbol = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSymbol]
  }
}

