package typings.carbonComponentsReact

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formContextMod {
  
  @JSImport("carbon-components-react/lib/components/FluidForm/FormContext", "FormContext")
  @js.native
  val FormContext: Context[FormContextProps] = js.native
  
  trait FormContextProps extends StObject {
    
    var isFluid: js.UndefOr[Boolean] = js.undefined
  }
  object FormContextProps {
    
    inline def apply(): FormContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormContextProps]
    }
    
    extension [Self <: FormContextProps](x: Self) {
      
      inline def setIsFluid(value: Boolean): Self = StObject.set(x, "isFluid", value.asInstanceOf[js.Any])
      
      inline def setIsFluidUndefined: Self = StObject.set(x, "isFluid", js.undefined)
    }
  }
}
