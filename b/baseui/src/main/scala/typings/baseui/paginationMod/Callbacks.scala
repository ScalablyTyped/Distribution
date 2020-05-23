package typings.baseui.paginationMod

import typings.baseui.anon.EventAny
import typings.baseui.anon.NextPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var onNextClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.undefined
  var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, _]] = js.undefined
  var onPrevClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    onNextClick: /* args */ EventAny => _ = null,
    onPageChange: /* args */ NextPage => _ = null,
    onPrevClick: /* args */ EventAny => _ = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1(onNextClick))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1(onPrevClick))
    __obj.asInstanceOf[Callbacks]
  }
}

