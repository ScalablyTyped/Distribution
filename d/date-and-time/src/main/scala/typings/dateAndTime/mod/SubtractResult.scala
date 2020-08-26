package typings.dateAndTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubtractResult extends js.Object {
  def toDays(): Double = js.native
  def toHours(): Double = js.native
  def toMilliseconds(): Double = js.native
  def toMinutes(): Double = js.native
  def toSeconds(): Double = js.native
}

object SubtractResult {
  @scala.inline
  def apply(
    toDays: () => Double,
    toHours: () => Double,
    toMilliseconds: () => Double,
    toMinutes: () => Double,
    toSeconds: () => Double
  ): SubtractResult = {
    val __obj = js.Dynamic.literal(toDays = js.Any.fromFunction0(toDays), toHours = js.Any.fromFunction0(toHours), toMilliseconds = js.Any.fromFunction0(toMilliseconds), toMinutes = js.Any.fromFunction0(toMinutes), toSeconds = js.Any.fromFunction0(toSeconds))
    __obj.asInstanceOf[SubtractResult]
  }
  @scala.inline
  implicit class SubtractResultOps[Self <: SubtractResult] (val x: Self) extends AnyVal {
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
    def setToDays(value: () => Double): Self = this.set("toDays", js.Any.fromFunction0(value))
    @scala.inline
    def setToHours(value: () => Double): Self = this.set("toHours", js.Any.fromFunction0(value))
    @scala.inline
    def setToMilliseconds(value: () => Double): Self = this.set("toMilliseconds", js.Any.fromFunction0(value))
    @scala.inline
    def setToMinutes(value: () => Double): Self = this.set("toMinutes", js.Any.fromFunction0(value))
    @scala.inline
    def setToSeconds(value: () => Double): Self = this.set("toSeconds", js.Any.fromFunction0(value))
  }
  
}

