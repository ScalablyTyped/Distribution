package typings.breeze.breeze.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumSymbol extends js.Object {
  var parentEnum: IEnum = js.native
  def getName(): String = js.native
}

object EnumSymbol {
  @scala.inline
  def apply(getName: () => String, parentEnum: IEnum): EnumSymbol = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSymbol]
  }
  @scala.inline
  implicit class EnumSymbolOps[Self <: EnumSymbol] (val x: Self) extends AnyVal {
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
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setParentEnum(value: IEnum): Self = this.set("parentEnum", value.asInstanceOf[js.Any])
  }
  
}

