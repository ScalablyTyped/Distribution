package typings.c3.anon

import typings.c3.mod.ArrayOrString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Done extends js.Object {
  /** Called after data is loaded, but not after rendering. This is because rendering will finish after some transition and there is some time lag between loading and rendering. */
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var ids: js.UndefOr[ArrayOrString] = js.native
}

object Done {
  @scala.inline
  def apply(): Done = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Done]
  }
  @scala.inline
  implicit class DoneOps[Self <: Done] (val x: Self) extends AnyVal {
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
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: ArrayOrString): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
  }
  
}

