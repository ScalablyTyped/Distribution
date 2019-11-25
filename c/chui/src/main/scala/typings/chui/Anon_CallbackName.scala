package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackName extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object Anon_CallbackName {
  @scala.inline
  def apply(callback: js.Function = null, name: String = null, selected: Int | Double = null): Anon_CallbackName = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CallbackName]
  }
}

