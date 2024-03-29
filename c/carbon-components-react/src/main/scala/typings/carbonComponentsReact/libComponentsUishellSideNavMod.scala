package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.carbonComponentsReact.typingsTranslationMod._CarbonTranslationKey
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNav", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLElement, SideNavProps] = js.native
  
  trait SideNavProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with InternationalProps[SideNavTranslationKey, Record[String, Any]] {
    
    var addFocusListeners: js.UndefOr[Boolean] = js.undefined
    
    var addMouseListeners: js.UndefOr[Boolean] = js.undefined
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var isChildOfHeader: js.UndefOr[Boolean] = js.undefined
    
    var isFixedNav: js.UndefOr[Boolean] = js.undefined
    
    var isPersistent: js.UndefOr[Boolean] = js.undefined
    
    var isRail: js.UndefOr[Boolean] = js.undefined
    
    var onOverlayClick: js.UndefOr[js.Function1[/* evt */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.undefined
    
    var onToggle: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLElement, Element], /* focus */ Boolean, Unit]
      ] = js.undefined
  }
  object SideNavProps {
    
    inline def apply(): SideNavProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavProps] (val x: Self) extends AnyVal {
      
      inline def setAddFocusListeners(value: Boolean): Self = StObject.set(x, "addFocusListeners", value.asInstanceOf[js.Any])
      
      inline def setAddFocusListenersUndefined: Self = StObject.set(x, "addFocusListeners", js.undefined)
      
      inline def setAddMouseListeners(value: Boolean): Self = StObject.set(x, "addMouseListeners", value.asInstanceOf[js.Any])
      
      inline def setAddMouseListenersUndefined: Self = StObject.set(x, "addMouseListeners", js.undefined)
      
      inline def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setIsChildOfHeader(value: Boolean): Self = StObject.set(x, "isChildOfHeader", value.asInstanceOf[js.Any])
      
      inline def setIsChildOfHeaderUndefined: Self = StObject.set(x, "isChildOfHeader", js.undefined)
      
      inline def setIsFixedNav(value: Boolean): Self = StObject.set(x, "isFixedNav", value.asInstanceOf[js.Any])
      
      inline def setIsFixedNavUndefined: Self = StObject.set(x, "isFixedNav", js.undefined)
      
      inline def setIsPersistent(value: Boolean): Self = StObject.set(x, "isPersistent", value.asInstanceOf[js.Any])
      
      inline def setIsPersistentUndefined: Self = StObject.set(x, "isPersistent", js.undefined)
      
      inline def setIsRail(value: Boolean): Self = StObject.set(x, "isRail", value.asInstanceOf[js.Any])
      
      inline def setIsRailUndefined: Self = StObject.set(x, "isRail", js.undefined)
      
      inline def setOnOverlayClick(value: /* evt */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction1(value))
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setOnToggle(value: (/* event */ FocusEvent[HTMLElement, Element], /* focus */ Boolean) => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction2(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDotsidenavDotstateDotclosed
    - typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDotsidenavDotstateDotopen
  */
  trait SideNavTranslationKey
    extends StObject
       with _CarbonTranslationKey
  object SideNavTranslationKey {
    
    inline def carbonDotsidenavDotstateDotclosed: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDotsidenavDotstateDotclosed = "carbon.sidenav.state.closed".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDotsidenavDotstateDotclosed]
    
    inline def carbonDotsidenavDotstateDotopen: typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDotsidenavDotstateDotopen = "carbon.sidenav.state.open".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDotsidenavDotstateDotopen]
  }
  
  type _To = ForwardRefReturn[HTMLElement, SideNavProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavMod.foo` */
  override def _to: ForwardRefReturn[HTMLElement, SideNavProps] = default
}
