package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.ltr
import typings.carbonComponentsReact.carbonComponentsReactStrings.rtl
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLayoutLayoutDirectionContextMod {
  
  @JSImport("carbon-components-react/lib/components/Layout/LayoutDirectionContext", "LayoutDirectionContext")
  @js.native
  val LayoutDirectionContext: Context[LayoutDirectionContextData] = js.native
  
  trait LayoutDirectionContextData extends StObject {
    
    var direction: ltr | rtl
  }
  object LayoutDirectionContextData {
    
    inline def apply(direction: ltr | rtl): LayoutDirectionContextData = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutDirectionContextData]
    }
    
    extension [Self <: LayoutDirectionContextData](x: Self) {
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    }
  }
}
