package typings.cathoQuantum.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var activePage: js.UndefOr[Double] = js.undefined
  var activePageAriaLabel: js.UndefOr[String] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var followOnlyFirstPage: js.UndefOr[Boolean] = js.undefined
  var infoFormatter: js.UndefOr[
    js.Function2[/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double], Unit]
  ] = js.undefined
  var nextButtonText: js.UndefOr[String] = js.undefined
  var onPageClick: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.undefined
  var pageAriaLabel: js.UndefOr[String] = js.undefined
  var pageHref: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.undefined
  var prevButtonText: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var totalPages: Double
}

object PaginationProps {
  @scala.inline
  def apply(
    totalPages: Double,
    activePage: Int | Double = null,
    activePageAriaLabel: String = null,
    ariaLabel: String = null,
    followOnlyFirstPage: js.UndefOr[Boolean] = js.undefined,
    infoFormatter: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Unit = null,
    nextButtonText: String = null,
    onPageClick: /* page */ js.UndefOr[Double] => Unit = null,
    pageAriaLabel: String = null,
    pageHref: /* page */ js.UndefOr[Double] => Unit = null,
    prevButtonText: String = null,
    tabIndex: Int | Double = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    if (activePage != null) __obj.updateDynamic("activePage")(activePage.asInstanceOf[js.Any])
    if (activePageAriaLabel != null) __obj.updateDynamic("activePageAriaLabel")(activePageAriaLabel.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(followOnlyFirstPage)) __obj.updateDynamic("followOnlyFirstPage")(followOnlyFirstPage.asInstanceOf[js.Any])
    if (infoFormatter != null) __obj.updateDynamic("infoFormatter")(js.Any.fromFunction2(infoFormatter))
    if (nextButtonText != null) __obj.updateDynamic("nextButtonText")(nextButtonText.asInstanceOf[js.Any])
    if (onPageClick != null) __obj.updateDynamic("onPageClick")(js.Any.fromFunction1(onPageClick))
    if (pageAriaLabel != null) __obj.updateDynamic("pageAriaLabel")(pageAriaLabel.asInstanceOf[js.Any])
    if (pageHref != null) __obj.updateDynamic("pageHref")(js.Any.fromFunction1(pageHref))
    if (prevButtonText != null) __obj.updateDynamic("prevButtonText")(prevButtonText.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

