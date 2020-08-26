package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait miscVisitors[V] extends js.Object {
  var Noop: js.UndefOr[V] = js.native
  var ParenthesizedExpression: js.UndefOr[V] = js.native
}

object miscVisitors {
  @scala.inline
  def apply[V](): miscVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[miscVisitors[V]]
  }
  @scala.inline
  implicit class miscVisitorsOps[Self <: miscVisitors[_], V] (val x: Self with miscVisitors[V]) extends AnyVal {
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
    def setNoop(value: V): Self = this.set("Noop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoop: Self = this.set("Noop", js.undefined)
    @scala.inline
    def setParenthesizedExpression(value: V): Self = this.set("ParenthesizedExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParenthesizedExpression: Self = this.set("ParenthesizedExpression", js.undefined)
  }
  
}

