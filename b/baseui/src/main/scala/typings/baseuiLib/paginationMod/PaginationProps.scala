package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends Callbacks {
  var currentPage: scala.Double
  var labels: js.UndefOr[Labels] = js.undefined
  var numPages: scala.Double
  var overrides: js.UndefOr[PaginationOverrides] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    currentPage: scala.Double,
    numPages: scala.Double,
    labels: Labels = null,
    onNextClick: /* args */ baseuiLib.Anon_EventAny => _ = null,
    onPageChange: /* args */ baseuiLib.Anon_NextPage => _ = null,
    onPrevClick: /* args */ baseuiLib.Anon_EventAny => _ = null,
    overrides: PaginationOverrides = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage, numPages = numPages)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[PaginationProps]
  }
}

