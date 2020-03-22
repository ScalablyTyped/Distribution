package typings.baseui.paginationMod

import typings.baseui.AnonEventAny
import typings.baseui.AnonNextPage
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends Callbacks {
  var currentPage: Double
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    currentPage: Double,
    numPages: Double,
    labels: Labels = null,
    onNextClick: /* args */ AnonEventAny => _ = null,
    onPageChange: /* args */ AnonNextPage => _ = null,
    onPrevClick: /* args */ AnonEventAny => _ = null,
    overrides: PaginationOverrides = null,
    size: mini | default_ | compact | large_ = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

