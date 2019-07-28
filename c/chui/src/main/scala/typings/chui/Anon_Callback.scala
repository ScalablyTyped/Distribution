package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var cancelButton: js.UndefOr[String] = js.undefined
  var continueButton: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: js.Function = null,
    cancelButton: String = null,
    continueButton: String = null,
    empty: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    message: String = null,
    title: String = null
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

