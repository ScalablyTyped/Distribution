package typings.blueprintjsCore.anon

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName[E /* <: HTMLButtonElement | HTMLAnchorElement */] extends StObject {
  
  var className: String
  
  var disabled: Boolean | (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['disabled'] */ js.Any
  ])
  
  def onBlur(e: FocusEvent[Any, Element]): Unit
  
  var onClick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['onClick'] */ js.Any
  ] = js.undefined
  
  var onFocus: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['onFocus'] */ js.Any
  ] = js.undefined
  
  def onKeyDown(e: KeyboardEvent[Any]): Unit
  
  def onKeyUp(e: KeyboardEvent[Any]): Unit
  
  var tabIndex: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['tabIndex'] */ js.Any)
  ] = js.undefined
}
object ClassName {
  
  inline def apply[E /* <: HTMLButtonElement | HTMLAnchorElement */](
    className: String,
    disabled: Boolean | (NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['disabled'] */ js.Any
    ]),
    onBlur: FocusEvent[Any, Element] => Unit,
    onKeyDown: KeyboardEvent[Any] => Unit,
    onKeyUp: KeyboardEvent[Any] => Unit
  ): ClassName[E] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
    __obj.asInstanceOf[ClassName[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassName[?], E /* <: HTMLButtonElement | HTMLAnchorElement */] (val x: Self & ClassName[E]) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDisabled(
      value: Boolean | (NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['disabled'] */ js.Any
        ])
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: FocusEvent[Any, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['onClick'] */ js.Any
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['onFocus'] */ js.Any
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[Any] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyUp(value: KeyboardEvent[Any] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setTabIndex(
      value: Double | (/* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.ButtonProps<E> & E extends std.HTMLButtonElement ? react.react.ButtonHTMLAttributes<std.HTMLButtonElement> : react.react.AnchorHTMLAttributes<std.HTMLAnchorElement>['tabIndex'] */ js.Any)
    ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
