package typings.datejs.sugarpak

import typings.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateElementEvaluator extends js.Object {
  def after(): Date = js.native
  def ago(): Date = js.native
  def before(): Date = js.native
  def fromNow(): Date = js.native
}

object IDateElementEvaluator {
  @scala.inline
  def apply(after: () => Date, ago: () => Date, before: () => Date, fromNow: () => Date): IDateElementEvaluator = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction0(after), ago = js.Any.fromFunction0(ago), before = js.Any.fromFunction0(before), fromNow = js.Any.fromFunction0(fromNow))
    __obj.asInstanceOf[IDateElementEvaluator]
  }
  @scala.inline
  implicit class IDateElementEvaluatorOps[Self <: IDateElementEvaluator] (val x: Self) extends AnyVal {
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
    def setAfter(value: () => Date): Self = this.set("after", js.Any.fromFunction0(value))
    @scala.inline
    def setAgo(value: () => Date): Self = this.set("ago", js.Any.fromFunction0(value))
    @scala.inline
    def setBefore(value: () => Date): Self = this.set("before", js.Any.fromFunction0(value))
    @scala.inline
    def setFromNow(value: () => Date): Self = this.set("fromNow", js.Any.fromFunction0(value))
  }
  
}

