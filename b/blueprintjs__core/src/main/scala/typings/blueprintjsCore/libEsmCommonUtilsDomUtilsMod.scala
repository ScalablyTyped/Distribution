package typings.blueprintjsCore

import typings.react.mod.KeyboardEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.GetRootNodeOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonUtilsDomUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/domUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clickElementOnKeyPress(keys: js.Array[String]): js.Function1[/* e */ KeyboardEvent[Element], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clickElementOnKeyPress")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* e */ KeyboardEvent[Element], Boolean]]
  
  inline def elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementIsOrContains")(element.asInstanceOf[js.Any], testElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def elementIsTextInput(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elementIsTextInput")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getActiveElement(): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")().asInstanceOf[Element | Null]
  inline def getActiveElement(element: Null, options: GetRootNodeOptions): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getActiveElement(element: Unit, options: GetRootNodeOptions): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getActiveElement(element: HTMLElement): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def getActiveElement(element: HTMLElement, options: GetRootNodeOptions): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def throttle[T /* <: js.Function */](method: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(method.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def throttleEvent(target: EventTarget, eventName: String, newEventName: String): js.Function1[/* event */ Event, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event */ Event, Unit]]
  
  inline def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](callback: js.Function2[/* event */ E, /* repeated */ Any, Any]): js.Function1[/* event2 */ E, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  inline def throttleReactEventCallback[E /* <: SyntheticEvent[Element, Event] */](
    callback: js.Function2[/* event */ E, /* repeated */ Any, Any],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ E, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleReactEventCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* event2 */ E, Unit]]
  
  trait IThrottledReactEventOptions extends StObject {
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
  }
  object IThrottledReactEventOptions {
    
    inline def apply(): IThrottledReactEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThrottledReactEventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IThrottledReactEventOptions] (val x: Self) extends AnyVal {
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    }
  }
}
