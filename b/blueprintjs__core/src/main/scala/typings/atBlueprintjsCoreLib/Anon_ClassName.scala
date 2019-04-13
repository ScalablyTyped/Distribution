package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName[H /* <: reactLib.reactMod.HTMLAttributes[_] */] extends js.Object {
  var className: java.lang.String
  var disabled: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any
  var onClick: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  var tabIndex: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  def onKeyDown(e: reactLib.reactMod.KeyboardEvent[_]): scala.Unit
  def onKeyUp(e: reactLib.reactMod.KeyboardEvent[_]): scala.Unit
  def ref(ref: stdLib.HTMLElement): scala.Unit
}

object Anon_ClassName {
  @scala.inline
  def apply[H /* <: reactLib.reactMod.HTMLAttributes[_] */](
    className: java.lang.String,
    disabled: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any,
    onClick: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: reactLib.reactMod.KeyboardEvent[_] => scala.Unit,
    onKeyUp: reactLib.reactMod.KeyboardEvent[_] => scala.Unit,
    ref: stdLib.HTMLElement => scala.Unit,
    tabIndex: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): Anon_ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className, disabled = disabled, onClick = onClick, onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = js.Any.fromFunction1(ref), tabIndex = tabIndex)
  
    __obj.asInstanceOf[Anon_ClassName[H]]
  }
}

