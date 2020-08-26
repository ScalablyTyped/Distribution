package typings.blueprintjsCore.overflowListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowListState[T] extends js.Object {
  /** Length of last overflow to dedupe `onOverflow` calls during smooth resizing. */
  var lastOverflowCount: Double = js.native
  var overflow: js.Array[T] = js.native
  var visible: js.Array[T] = js.native
}

object IOverflowListState {
  @scala.inline
  def apply[T](lastOverflowCount: Double, overflow: js.Array[T], visible: js.Array[T]): IOverflowListState[T] = {
    val __obj = js.Dynamic.literal(lastOverflowCount = lastOverflowCount.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowListState[T]]
  }
  @scala.inline
  implicit class IOverflowListStateOps[Self <: IOverflowListState[_], T] (val x: Self with IOverflowListState[T]) extends AnyVal {
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
    def setLastOverflowCount(value: Double): Self = this.set("lastOverflowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflowVarargs(value: T*): Self = this.set("overflow", js.Array(value :_*))
    @scala.inline
    def setOverflow(value: js.Array[T]): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleVarargs(value: T*): Self = this.set("visible", js.Array(value :_*))
    @scala.inline
    def setVisible(value: js.Array[T]): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

