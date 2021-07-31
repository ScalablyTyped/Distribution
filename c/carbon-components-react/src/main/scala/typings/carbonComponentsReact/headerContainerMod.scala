package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerContainerMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RP](props: FCProps[HeaderContainerProps[RP]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  trait HeaderContainerProps[RP] extends StObject {
    
    var isSideNavExpanded: js.UndefOr[Boolean] = js.undefined
    
    var render: ComponentType[RP]
  }
  object HeaderContainerProps {
    
    @scala.inline
    def apply[RP](render: ComponentType[RP]): HeaderContainerProps[RP] = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderContainerProps[RP]]
    }
    
    @scala.inline
    implicit class HeaderContainerPropsMutableBuilder[Self <: HeaderContainerProps[?], RP] (val x: Self & HeaderContainerProps[RP]) extends AnyVal {
      
      @scala.inline
      def setIsSideNavExpanded(value: Boolean): Self = StObject.set(x, "isSideNavExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSideNavExpandedUndefined: Self = StObject.set(x, "isSideNavExpanded", js.undefined)
      
      @scala.inline
      def setRender(value: ComponentType[RP]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeaderContainerRenderProps extends StObject {
    
    var isSideNavExpanded: Boolean
    
    def onClickSideNavExpand(): Unit
  }
  object HeaderContainerRenderProps {
    
    @scala.inline
    def apply(isSideNavExpanded: Boolean, onClickSideNavExpand: () => Unit): HeaderContainerRenderProps = {
      val __obj = js.Dynamic.literal(isSideNavExpanded = isSideNavExpanded.asInstanceOf[js.Any], onClickSideNavExpand = js.Any.fromFunction0(onClickSideNavExpand))
      __obj.asInstanceOf[HeaderContainerRenderProps]
    }
    
    @scala.inline
    implicit class HeaderContainerRenderPropsMutableBuilder[Self <: HeaderContainerRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSideNavExpanded(value: Boolean): Self = StObject.set(x, "isSideNavExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickSideNavExpand(value: () => Unit): Self = StObject.set(x, "onClickSideNavExpand", js.Any.fromFunction0(value))
    }
  }
}
