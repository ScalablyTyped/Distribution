package typings.baseui

import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.reset
import typings.baseui.baseuiStrings.submit
import typings.baseui.buttonTypesMod.ButtonOverrides
import typings.baseui.buttonTypesMod.CustomColors
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonTimedTypesMod {
  
  trait ButtonTimedOverrides
    extends StObject
       with ButtonOverrides {
    
    var TimerContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object ButtonTimedOverrides {
    
    inline def apply(): ButtonTimedOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonTimedOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonTimedOverrides] (val x: Self) extends AnyVal {
      
      inline def setTimerContainer(value: Override[Any]): Self = StObject.set(x, "TimerContainer", value.asInstanceOf[js.Any])
      
      inline def setTimerContainerUndefined: Self = StObject.set(x, "TimerContainer", js.undefined)
    }
  }
  
  /* Inlined std.Omit<baseui.baseui/button.ButtonProps, 'kind' | 'shape' | 'size' | 'onClick' | 'overrides'> & {  initialTime :number,   paused :boolean | undefined, onClick (a : react.react.SyntheticEvent<std.HTMLButtonElement, std.Event> | undefined): unknown,   overrides :baseui.baseui/button-timed/types.ButtonTimedOverrides | undefined} */
  @js.native
  trait ButtonTimedProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var colors: js.UndefOr[CustomColors] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endEnhancer: js.UndefOr[ReactNode | ComponentType[Any]] = js.native
    
    var initialTime: Double = js.native
    
    var isLoading: js.UndefOr[Boolean] = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
    
    def onClick(): Any = js.native
    def onClick(a: SyntheticEvent[HTMLButtonElement, Event]): Any = js.native
    
    var overrides: js.UndefOr[ButtonTimedOverrides] = js.native
    
    var paused: js.UndefOr[Boolean] = js.native
    
    var startEnhancer: js.UndefOr[ReactNode | ComponentType[Any]] = js.native
    
    var `type`: js.UndefOr[submit | reset | button] = js.native
  }
}
