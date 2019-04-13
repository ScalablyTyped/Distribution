package typings
package cleaveDotJsLib.reactPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] {
  var htmlRef: js.UndefOr[js.Function1[/* i */ js.Any, scala.Unit]] = js.undefined
  @JSName("onChange")
  var onChange_Props: js.UndefOr[ChangeEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onInit: js.UndefOr[InitHandler] = js.undefined
  var options: cleaveDotJsLib.optionsMod.CleaveOptions
}

object Props {
  @scala.inline
  def apply(
    options: cleaveDotJsLib.optionsMod.CleaveOptions,
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    htmlRef: /* i */ js.Any => scala.Unit = null,
    onChange: ChangeEventHandler[stdLib.HTMLInputElement] = null,
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

