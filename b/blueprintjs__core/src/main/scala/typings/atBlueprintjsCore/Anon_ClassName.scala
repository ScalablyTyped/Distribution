package typings.atBlueprintjsCore

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName[H /* <: HTMLAttributes[_] */] extends js.Object {
  var className: String
  var disabled: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any
  var onClick: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  var tabIndex: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  def onKeyDown(e: KeyboardEvent[_]): Unit
  def onKeyUp(e: KeyboardEvent[_]): Unit
  def ref(ref: HTMLElement): Unit
}

object Anon_ClassName {
  @scala.inline
  def apply[H /* <: HTMLAttributes[_] */](
    className: String,
    disabled: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any,
    onClick: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: KeyboardEvent[_] => Unit,
    onKeyUp: KeyboardEvent[_] => Unit,
    ref: HTMLElement => Unit,
    tabIndex: /* import warning: ImportType.apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): Anon_ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className, disabled = disabled, onClick = onClick, onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = js.Any.fromFunction1(ref), tabIndex = tabIndex)
  
    __obj.asInstanceOf[Anon_ClassName[H]]
  }
}

