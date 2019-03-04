package typings
package cleaveDotJsLib.reactPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] {
  var htmlRef: js.UndefOr[js.Function1[/* i */ js.Any, scala.Unit]] = js.undefined
  @JSName("onChange")
  var onChange_Props: js.UndefOr[ChangeEventHandler[reactLib.HTMLInputElement]] = js.undefined
  var onInit: js.UndefOr[InitHandler] = js.undefined
  var options: cleaveDotJsLib.optionsMod.CleaveOptions
}

object Props {
  @scala.inline
  def apply(
    options: cleaveDotJsLib.optionsMod.CleaveOptions,
    InputHTMLAttributes: reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] = null,
    htmlRef: js.Function1[/* i */ js.Any, scala.Unit] = null,
    onChange: ChangeEventHandler[reactLib.HTMLInputElement] = null,
    onInit: InitHandler = null
  ): Props = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (htmlRef != null) __obj.updateDynamic("htmlRef")(htmlRef)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onInit != null) __obj.updateDynamic("onInit")(onInit)
    __obj.asInstanceOf[Props]
  }
}

