package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName[H /* <: reactLib.reactMod.ReactNs.HTMLAttributes[_] */] extends js.Object {
  var className: java.lang.String
  var disabled: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any
  var onClick: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  var tabIndex: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  def onKeyDown(e: reactLib.reactMod.ReactNs.KeyboardEvent[_]): scala.Unit
  def onKeyUp(e: reactLib.reactMod.ReactNs.KeyboardEvent[_]): scala.Unit
  def ref(ref: reactLib.HTMLElement): scala.Unit
}

object Anon_ClassName {
  @scala.inline
  def apply[H /* <: reactLib.reactMod.ReactNs.HTMLAttributes[_] */](
    className: java.lang.String,
    disabled: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any,
    onClick: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: js.Function1[reactLib.reactMod.ReactNs.KeyboardEvent[_], scala.Unit],
    onKeyUp: js.Function1[reactLib.reactMod.ReactNs.KeyboardEvent[_], scala.Unit],
    ref: js.Function1[reactLib.HTMLElement, scala.Unit],
    tabIndex: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): Anon_ClassName[H] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("onKeyDown")(onKeyDown)
    __obj.updateDynamic("onKeyUp")(onKeyUp)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("tabIndex")(tabIndex)
    __obj.asInstanceOf[Anon_ClassName[H]]
  }
}

