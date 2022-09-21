package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeBreakpointsComponents
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbedViewMod {
  
  @JSImport("@catho/quantum/TabbedView", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TabbedViewProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/TabbedView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/TabbedView", "default.Tab")
    @js.native
    def Tab: typings.cathoQuantum.tabbedViewMod.Tab = js.native
    inline def Tab_=(x: Tab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  }
  
  type Tab = Component[TabProps, js.Object, Any]
  
  trait TabProps extends StObject {
    
    var badge: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.Array[ReactNode] | ReactNode
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var title: String
  }
  object TabProps {
    
    inline def apply(title: String): TabProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setBadge(value: ReactNode): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type TabbedView = Component[TabbedViewProps, js.Object, Any]
  
  trait TabbedViewProps extends StObject {
    
    var activeTab: js.UndefOr[String] = js.undefined
    
    var children: js.Array[ReactNode] | ReactNode
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var onTabClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var skin: js.UndefOr[neutral | primary] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeBreakpointsComponents] = js.undefined
  }
  object TabbedViewProps {
    
    inline def apply(): TabbedViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabbedViewProps]
    }
    
    extension [Self <: TabbedViewProps](x: Self) {
      
      inline def setActiveTab(value: String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      inline def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setOnTabClick(value: () => Unit): Self = StObject.set(x, "onTabClick", js.Any.fromFunction0(value))
      
      inline def setOnTabClickUndefined: Self = StObject.set(x, "onTabClick", js.undefined)
      
      inline def setSkin(value: neutral | primary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: BaseFontSizeBreakpointsComponents): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
