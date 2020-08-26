package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalQueryComparisonOptions extends js.Object {
  def setAsDefault(): Unit = js.native
}

object LocalQueryComparisonOptions {
  @scala.inline
  def apply(setAsDefault: () => Unit): LocalQueryComparisonOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault))
    __obj.asInstanceOf[LocalQueryComparisonOptions]
  }
  @scala.inline
  implicit class LocalQueryComparisonOptionsOps[Self <: LocalQueryComparisonOptions] (val x: Self) extends AnyVal {
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
    def setSetAsDefault(value: () => Unit): Self = this.set("setAsDefault", js.Any.fromFunction0(value))
  }
  
}

