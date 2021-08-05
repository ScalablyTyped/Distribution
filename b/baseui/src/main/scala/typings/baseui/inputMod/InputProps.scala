package typings.baseui.inputMod

import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputProps
  extends StObject
     with BaseInputProps[HTMLInputElement] {
  
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.undefined
  
  @JSName("overrides")
  var overrides_InputProps: js.UndefOr[InputOverrides] = js.undefined
  
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode] = js.undefined
}
object InputProps {
  
  inline def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  extension [Self <: InputProps](x: Self) {
    
    inline def setEndEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "endEnhancer", js.Any.fromFunction1(value))
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setOverrides(value: InputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setStartEnhancer(value: (js.Function1[/* args */ SharedProps, ReactNode]) | ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    inline def setStartEnhancerFunction1(value: /* args */ SharedProps => ReactNode): Self = StObject.set(x, "startEnhancer", js.Any.fromFunction1(value))
    
    inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
  }
}
