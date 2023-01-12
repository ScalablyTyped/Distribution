package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import typings.baseui.stylesTypesMod.Theme
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersTypesMod {
  
  trait BaseProviderOverrides extends StObject {
    
    var AppContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var LayersContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object BaseProviderOverrides {
    
    inline def apply(): BaseProviderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProviderOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProviderOverrides] (val x: Self) extends AnyVal {
      
      inline def setAppContainer(value: Override[Any]): Self = StObject.set(x, "AppContainer", value.asInstanceOf[js.Any])
      
      inline def setAppContainerUndefined: Self = StObject.set(x, "AppContainer", js.undefined)
      
      inline def setLayersContainer(value: Override[Any]): Self = StObject.set(x, "LayersContainer", value.asInstanceOf[js.Any])
      
      inline def setLayersContainerUndefined: Self = StObject.set(x, "LayersContainer", js.undefined)
    }
  }
  
  trait BaseProviderProps extends StObject {
    
    /** Children element to be rendered. Normally the BaseProvider
      should be added at the top level of an application. */
    var children: js.UndefOr[ReactNode | Null] = js.undefined
    
    var overrides: js.UndefOr[BaseProviderOverrides] = js.undefined
    
    /** The base theme to be used in the application. */
    var theme: Theme
    
    /** A value of z-index to be set on the layers. */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object BaseProviderProps {
    
    inline def apply(theme: Theme): BaseProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOverrides(value: BaseProviderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
