package typings.carbonComponents.numberInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait NumberInput extends js.Object {
  def _handleClick(event: js.Any): Unit = js.native
}

object NumberInput {
  @scala.inline
  def apply(_handleClick: js.Any => Unit): NumberInput = {
    val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick))
    __obj.asInstanceOf[NumberInput]
  }
  @scala.inline
  implicit class NumberInputOps[Self <: NumberInput] (val x: Self) extends AnyVal {
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
    def set_handleClick(value: js.Any => Unit): Self = this.set("_handleClick", js.Any.fromFunction1(value))
  }
  
}

