package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var cancelButton: js.UndefOr[java.lang.String] = js.undefined
  var continueButton: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: js.Function = null,
    cancelButton: java.lang.String = null,
    continueButton: java.lang.String = null,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    message: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton)
    if (continueButton != null) __obj.updateDynamic("continueButton")(continueButton)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Callback]
  }
}

