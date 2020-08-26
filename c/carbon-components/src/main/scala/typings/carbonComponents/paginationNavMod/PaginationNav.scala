package typings.carbonComponents.paginationNavMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait PaginationNav extends js.Object {
  def clearActivePage(evt: js.Any): Unit = js.native
  def getActivePageNumber(): js.UndefOr[Double] = js.native
  def handleClick(evt: js.Any): Unit = js.native
  def handleSelectChange(evt: js.Any): Unit = js.native
  def setPrevNextStates(): Unit = js.native
}

object PaginationNav {
  @scala.inline
  def apply(
    clearActivePage: js.Any => Unit,
    getActivePageNumber: () => js.UndefOr[Double],
    handleClick: js.Any => Unit,
    handleSelectChange: js.Any => Unit,
    setPrevNextStates: () => Unit
  ): PaginationNav = {
    val __obj = js.Dynamic.literal(clearActivePage = js.Any.fromFunction1(clearActivePage), getActivePageNumber = js.Any.fromFunction0(getActivePageNumber), handleClick = js.Any.fromFunction1(handleClick), handleSelectChange = js.Any.fromFunction1(handleSelectChange), setPrevNextStates = js.Any.fromFunction0(setPrevNextStates))
    __obj.asInstanceOf[PaginationNav]
  }
  @scala.inline
  implicit class PaginationNavOps[Self <: PaginationNav] (val x: Self) extends AnyVal {
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
    def setClearActivePage(value: js.Any => Unit): Self = this.set("clearActivePage", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActivePageNumber(value: () => js.UndefOr[Double]): Self = this.set("getActivePageNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleClick(value: js.Any => Unit): Self = this.set("handleClick", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleSelectChange(value: js.Any => Unit): Self = this.set("handleSelectChange", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPrevNextStates(value: () => Unit): Self = this.set("setPrevNextStates", js.Any.fromFunction0(value))
  }
  
}

