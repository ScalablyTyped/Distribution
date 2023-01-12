package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavigationTypesMod {
  
  trait HeaderNavigationOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object HeaderNavigationOverrides {
    
    inline def apply(): HeaderNavigationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderNavigationOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderNavigationOverrides] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{  overrides :baseui.baseui/header-navigation/types.HeaderNavigationOverrides}> */
  trait HeaderNavigationProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var overrides: HeaderNavigationOverrides
  }
  object HeaderNavigationProps {
    
    inline def apply(overrides: HeaderNavigationOverrides): HeaderNavigationProps = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNavigationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderNavigationProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOverrides(value: HeaderNavigationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    }
  }
}
