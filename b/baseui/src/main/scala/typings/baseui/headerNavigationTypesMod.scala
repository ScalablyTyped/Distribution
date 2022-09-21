package typings.baseui

import typings.baseui.overridesMod.Override
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
    
    extension [Self <: HeaderNavigationOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait HeaderNavigationProps extends StObject {
    
    var overrides: HeaderNavigationOverrides
  }
  object HeaderNavigationProps {
    
    inline def apply(overrides: HeaderNavigationOverrides): HeaderNavigationProps = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNavigationProps]
    }
    
    extension [Self <: HeaderNavigationProps](x: Self) {
      
      inline def setOverrides(value: HeaderNavigationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    }
  }
}
