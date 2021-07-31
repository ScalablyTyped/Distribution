package typings.blueprintjsCore.anon

import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName[H /* <: HTMLAttributes[HTMLElement] */] extends StObject {
  
  var className: String
  
  var disabled: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any
  ] = js.undefined
  
  def onBlur(e: FocusEvent[js.Any]): Unit
  
  var onClick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  ] = js.undefined
  
  def onKeyDown(e: KeyboardEvent[js.Any]): Unit
  
  def onKeyUp(e: KeyboardEvent[js.Any]): Unit
  
  var tabIndex: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any)
  ] = js.undefined
}
object ClassName {
  
  @scala.inline
  def apply[H /* <: HTMLAttributes[HTMLElement] */](
    className: String,
    onBlur: FocusEvent[js.Any] => Unit,
    onKeyDown: KeyboardEvent[js.Any] => Unit,
    onKeyUp: KeyboardEvent[js.Any] => Unit
  ): ClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
    __obj.asInstanceOf[ClassName[H]]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName[?], H /* <: HTMLAttributes[HTMLElement] */] (val x: Self & ClassName[H]) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['disabled'] */ js.Any
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[js.Any] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[js.Any] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[js.Any] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabIndex(
      value: Double | (/* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any)
    ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
