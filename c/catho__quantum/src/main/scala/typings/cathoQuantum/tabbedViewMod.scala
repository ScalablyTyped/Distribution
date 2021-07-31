package typings.cathoQuantum

import typings.cathoQuantum.anon.ComponentsSpacing
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabbedViewMod {
  
  @JSImport("@catho/quantum/TabbedView", "Tab")
  @js.native
  class Tab protected ()
    extends Component[TabProps, js.Object, js.Any] {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: js.Any) = this()
  }
  
  @JSImport("@catho/quantum/TabbedView", "TabbedView")
  @js.native
  class TabbedView protected ()
    extends Component[TabbedViewProps, js.Object, js.Any] {
    def this(props: TabbedViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabbedViewProps, context: js.Any) = this()
  }
  
  trait TabProps extends StObject {
    
    var badge: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.Array[ReactNode] | ReactNode
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var title: String
  }
  object TabProps {
    
    @scala.inline
    def apply(title: String): TabProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabProps]
    }
    
    @scala.inline
    implicit class TabPropsMutableBuilder[Self <: TabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: ReactNode): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabbedViewProps extends StObject {
    
    var activeTab: js.UndefOr[String] = js.undefined
    
    var children: js.Array[ReactNode] | ReactNode
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var skin: js.UndefOr[neutral | primary] = js.undefined
    
    var theme: js.UndefOr[ComponentsSpacing] = js.undefined
  }
  object TabbedViewProps {
    
    @scala.inline
    def apply(): TabbedViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabbedViewProps]
    }
    
    @scala.inline
    implicit class TabbedViewPropsMutableBuilder[Self <: TabbedViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSkin(value: neutral | primary): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTheme(value: ComponentsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
