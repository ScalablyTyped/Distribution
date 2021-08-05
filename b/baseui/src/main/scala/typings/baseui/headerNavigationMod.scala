package typings.baseui

import typings.baseui.baseuiStrings.`flex-end`
import typings.baseui.baseuiStrings.`flex-start`
import typings.baseui.baseuiStrings.center
import typings.react.mod.Component
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavigationMod {
  
  trait ALIGN extends StObject {
    
    var center: typings.baseui.baseuiStrings.center
    
    var left: `flex-start`
    
    var right: `flex-end`
  }
  object ALIGN {
    
    @JSImport("baseui/header-navigation", "ALIGN")
    @js.native
    val ^ : ALIGN = js.native
    
    extension [Self <: ALIGN](x: Self) {
      
      inline def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: `flex-start`): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: `flex-end`): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  class HeaderNavigation protected ()
    extends Component[HeaderNavigationProps, js.Object, js.Any] {
    def this(props: HeaderNavigationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HeaderNavigationProps, context: js.Any) = this()
  }
  
  @JSImport("baseui/header-navigation", "StyledNavigationItem")
  @js.native
  val StyledNavigationItem: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/header-navigation", "StyledNavigationList")
  @js.native
  val StyledNavigationList: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/header-navigation", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  trait HeaderNavigationOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object HeaderNavigationOverrides {
    
    inline def apply(): HeaderNavigationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderNavigationOverrides]
    }
    
    extension [Self <: HeaderNavigationOverrides](x: Self) {
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait HeaderNavigationProps extends StObject {
    
    var overrides: js.UndefOr[HeaderNavigationOverrides] = js.undefined
  }
  object HeaderNavigationProps {
    
    inline def apply(): HeaderNavigationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderNavigationProps]
    }
    
    extension [Self <: HeaderNavigationProps](x: Self) {
      
      inline def setOverrides(value: HeaderNavigationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
}
