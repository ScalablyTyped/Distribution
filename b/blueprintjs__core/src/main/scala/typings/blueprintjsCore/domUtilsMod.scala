package typings.blueprintjsCore

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementIsOrContains")(element.asInstanceOf[js.Any], testElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def throttle[T /* <: js.Function */](method: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(method.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Event, Unit]]
  
  @scala.inline
  def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](callback: js.Function2[/* event */ E, /* repeated */ js.Any, js.Any]): js.Function1[/* event2 */ E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  @scala.inline
  def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](
    callback: js.Function2[/* event */ E, /* repeated */ js.Any, js.Any],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ E, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  
  trait IThrottledReactEventOptions extends StObject {
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
  }
  object IThrottledReactEventOptions {
    
    @scala.inline
    def apply(): IThrottledReactEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThrottledReactEventOptions]
    }
    
    @scala.inline
    implicit class IThrottledReactEventOptionsMutableBuilder[Self <: IThrottledReactEventOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    }
  }
}
