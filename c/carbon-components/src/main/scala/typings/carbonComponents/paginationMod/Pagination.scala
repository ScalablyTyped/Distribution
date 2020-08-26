package typings.carbonComponents.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Pagination extends js.Object {
  def _emitEvent(evtName: js.Any, detail: js.Any): Unit = js.native
}

object Pagination {
  @scala.inline
  def apply(_emitEvent: (js.Any, js.Any) => Unit): Pagination = {
    val __obj = js.Dynamic.literal(_emitEvent = js.Any.fromFunction2(_emitEvent))
    __obj.asInstanceOf[Pagination]
  }
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
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
    def set_emitEvent(value: (js.Any, js.Any) => Unit): Self = this.set("_emitEvent", js.Any.fromFunction2(value))
  }
  
}

