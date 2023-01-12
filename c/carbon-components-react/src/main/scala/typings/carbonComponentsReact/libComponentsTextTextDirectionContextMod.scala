package typings.carbonComponentsReact

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextTextDirectionContextMod {
  
  @JSImport("carbon-components-react/lib/components/Text/TextDirectionContext", "TextDirectionContext")
  @js.native
  val TextDirectionContext: Context[TextDirectionContextData] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.auto
    - typings.carbonComponentsReact.carbonComponentsReactStrings.ltr
    - typings.carbonComponentsReact.carbonComponentsReactStrings.rtl
  */
  trait TextDirection extends StObject
  object TextDirection {
    
    inline def auto: typings.carbonComponentsReact.carbonComponentsReactStrings.auto = "auto".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.auto]
    
    inline def ltr: typings.carbonComponentsReact.carbonComponentsReactStrings.ltr = "ltr".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.ltr]
    
    inline def rtl: typings.carbonComponentsReact.carbonComponentsReactStrings.rtl = "rtl".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.rtl]
  }
  
  trait TextDirectionContextData extends StObject {
    
    var direction: js.UndefOr[TextDirection] = js.undefined
    
    var getTextDirection: js.UndefOr[js.Function1[/* repeated */ Any, js.UndefOr[TextDirection | Null]]] = js.undefined
  }
  object TextDirectionContextData {
    
    inline def apply(): TextDirectionContextData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDirectionContextData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextDirectionContextData] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: TextDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGetTextDirection(value: /* repeated */ Any => js.UndefOr[TextDirection | Null]): Self = StObject.set(x, "getTextDirection", js.Any.fromFunction1(value))
      
      inline def setGetTextDirectionUndefined: Self = StObject.set(x, "getTextDirection", js.undefined)
    }
  }
}
