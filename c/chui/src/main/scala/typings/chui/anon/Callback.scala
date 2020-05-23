package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var cancelButton: js.UndefOr[String] = js.undefined
  var continueButton: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Callback {
  @scala.inline
  def apply(
    callback: js.Function = null,
    cancelButton: String = null,
    continueButton: String = null,
    empty: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    message: String = null,
    title: String = null
  ): Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (cancelButton != null) __obj.updateDynamic("cancelButton")(cancelButton.asInstanceOf[js.Any])
    if (continueButton != null) __obj.updateDynamic("continueButton")(continueButton.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

