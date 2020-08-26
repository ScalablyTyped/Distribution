package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalHandlers[T] extends js.Object {
  var enter: js.UndefOr[TraversalHandler[T]] = js.native
  var exit: js.UndefOr[TraversalHandler[T]] = js.native
}

object TraversalHandlers {
  @scala.inline
  def apply[T](): TraversalHandlers[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraversalHandlers[T]]
  }
  @scala.inline
  implicit class TraversalHandlersOps[Self <: TraversalHandlers[_], T] (val x: Self with TraversalHandlers[T]) extends AnyVal {
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
    def setEnter(value: TraversalHandler[T]): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: TraversalHandler[T]): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
  
}

