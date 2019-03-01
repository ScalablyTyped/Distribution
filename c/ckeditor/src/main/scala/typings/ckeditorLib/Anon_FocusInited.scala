package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FocusInited extends js.Object {
  var focusInited: js.UndefOr[scala.Boolean] = js.undefined
  var initOnlyNew: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FocusInited {
  @scala.inline
  def apply(
    focusInited: js.UndefOr[scala.Boolean] = js.undefined,
    initOnlyNew: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FocusInited = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusInited)) __obj.updateDynamic("focusInited")(focusInited)
    if (!js.isUndefined(initOnlyNew)) __obj.updateDynamic("initOnlyNew")(initOnlyNew)
    __obj.asInstanceOf[Anon_FocusInited]
  }
}

