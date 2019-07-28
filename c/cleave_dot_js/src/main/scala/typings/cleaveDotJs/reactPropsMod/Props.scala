package typings.cleaveDotJs.reactPropsMod

import typings.cleaveDotJs.optionsMod.CleaveOptions
import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends InputHTMLAttributes[HTMLInputElement] {
  var htmlRef: js.UndefOr[js.Function1[/* i */ js.Any, Unit]] = js.undefined
  @JSName("onChange")
  var onChange_Props: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var onInit: js.UndefOr[InitHandler] = js.undefined
  var options: CleaveOptions
}

object Props {
  @scala.inline
  def apply(
    options: CleaveOptions,
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    htmlRef: /* i */ js.Any => Unit = null,
    onChange: ChangeEventHandler[HTMLInputElement] = null,
    onInit: InitHandler = null
  ): Props = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (htmlRef != null) __obj.updateDynamic("htmlRef")(js.Any.fromFunction1(htmlRef))
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    __obj.asInstanceOf[Props]
  }
}

