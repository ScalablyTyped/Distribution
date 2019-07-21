package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.FormHTMLAttributes<std.HTMLFormElement>, std.HTMLFormElement>, 'onSubmit'> ]: react.react.DetailedHTMLProps<react.react.FormHTMLAttributes<std.HTMLFormElement>, std.HTMLFormElement>[P]} */ trait FormProps extends js.Object {
  var onChange: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLFormElement], scala.Unit]
  ] = js.undefined
  var onReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* context */ FormContext, scala.Unit]] = js.undefined
  var onUpdate: js.UndefOr[js.Function1[/* context */ FormContext, scala.Unit]] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    onChange: /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLFormElement] => scala.Unit = null,
    onReset: () => scala.Unit = null,
    onSubmit: /* context */ FormContext => scala.Unit = null,
    onUpdate: /* context */ FormContext => scala.Unit = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    __obj.asInstanceOf[FormProps]
  }
}

