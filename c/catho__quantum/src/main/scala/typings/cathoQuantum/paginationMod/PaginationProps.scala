package typings.cathoQuantum.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps extends js.Object {
  var activePage: js.UndefOr[Double] = js.native
  var activePageAriaLabel: js.UndefOr[String] = js.native
  var ariaLabel: js.UndefOr[String] = js.native
  var followOnlyFirstPage: js.UndefOr[Boolean] = js.native
  var infoFormatter: js.UndefOr[
    js.Function2[/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double], Unit]
  ] = js.native
  var nextButtonText: js.UndefOr[String] = js.native
  var onPageClick: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.native
  var pageAriaLabel: js.UndefOr[String] = js.native
  var pageHref: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.native
  var prevButtonText: js.UndefOr[String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var totalPages: Double = js.native
}

object PaginationProps {
  @scala.inline
  def apply(totalPages: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
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
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivePage(value: Double): Self = this.set("activePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivePage: Self = this.set("activePage", js.undefined)
    @scala.inline
    def setActivePageAriaLabel(value: String): Self = this.set("activePageAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivePageAriaLabel: Self = this.set("activePageAriaLabel", js.undefined)
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setFollowOnlyFirstPage(value: Boolean): Self = this.set("followOnlyFirstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowOnlyFirstPage: Self = this.set("followOnlyFirstPage", js.undefined)
    @scala.inline
    def setInfoFormatter(value: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Unit): Self = this.set("infoFormatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInfoFormatter: Self = this.set("infoFormatter", js.undefined)
    @scala.inline
    def setNextButtonText(value: String): Self = this.set("nextButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButtonText: Self = this.set("nextButtonText", js.undefined)
    @scala.inline
    def setOnPageClick(value: /* page */ js.UndefOr[Double] => Unit): Self = this.set("onPageClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageClick: Self = this.set("onPageClick", js.undefined)
    @scala.inline
    def setPageAriaLabel(value: String): Self = this.set("pageAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageAriaLabel: Self = this.set("pageAriaLabel", js.undefined)
    @scala.inline
    def setPageHref(value: /* page */ js.UndefOr[Double] => Unit): Self = this.set("pageHref", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageHref: Self = this.set("pageHref", js.undefined)
    @scala.inline
    def setPrevButtonText(value: String): Self = this.set("prevButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButtonText: Self = this.set("prevButtonText", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

