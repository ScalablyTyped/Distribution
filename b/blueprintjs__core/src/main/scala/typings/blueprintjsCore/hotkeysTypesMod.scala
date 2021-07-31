package typings.blueprintjsCore

import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotkeysTypesMod {
  
  trait IHotkeysProps
    extends StObject
       with IProps {
    
    /**
      * In order to make local hotkeys work on elements that are not normally
      * focusable, such as `<div>`s or `<span>`s, we add a `tabIndex` attribute
      * to the hotkey target, which makes it focusable. By default, we use `0`,
      * but you can override this value to change the tab navigation behavior
      * of the component. You may even set this value to `null`, which will omit
      * the `tabIndex` from the component decorated by `HotkeysTarget`.
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object IHotkeysProps {
    
    @scala.inline
    def apply(): IHotkeysProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHotkeysProps]
    }
    
    @scala.inline
    implicit class IHotkeysPropsMutableBuilder[Self <: IHotkeysProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
