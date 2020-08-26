package typings.blueprintjsCore.anon

import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName[H /* <: HTMLAttributes[HTMLElement] */] extends js.Object {
  var className: String = js.native
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any = js.native
  var onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any = js.native
  var tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any = js.native
  def onKeyDown(e: KeyboardEvent[_]): Unit = js.native
  def onKeyUp(e: KeyboardEvent[_]): Unit = js.native
}

object ClassName {
  @scala.inline
  def apply[/* <: typings.react.mod.HTMLAttributes[typings.std.HTMLElement] */ H](
    className: String,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any,
    onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: KeyboardEvent[_] => Unit,
    onKeyUp: KeyboardEvent[_] => Unit,
    tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName[H]]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName[_], /* <: typings.react.mod.HTMLAttributes[typings.std.HTMLElement] */ H] (val x: Self with ClassName[H]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any
    ): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
    ): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[_] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[_] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def setTabIndex(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
    ): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
  
}

