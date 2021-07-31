package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSize
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleMod {
  
  @JSImport("@catho/quantum/Toggle", JSImport.Default)
  @js.native
  class default ()
    extends Component[ToggleProps, js.Object, js.Any]
  
  type Toggle = Component[ToggleProps, js.Object, js.Any]
  
  trait ToggleProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var theme: js.UndefOr[BaseFontSize] = js.undefined
  }
  object ToggleProps {
    
    @scala.inline
    def apply(): ToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleProps]
    }
    
    @scala.inline
    implicit class TogglePropsMutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
