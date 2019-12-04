package typings.baseui.paginationMod

import typings.baseui.Anon_EventAny
import typings.baseui.Anon_NextPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends Callbacks {
  var currentPage: Double
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    currentPage: Double,
    numPages: Double,
    labels: Labels = null,
    onNextClick: /* args */ Anon_EventAny => _ = null,
    onPageChange: /* args */ Anon_NextPage => _ = null,
    onPrevClick: /* args */ Anon_EventAny => _ = null,
    overrides: PaginationOverrides = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

