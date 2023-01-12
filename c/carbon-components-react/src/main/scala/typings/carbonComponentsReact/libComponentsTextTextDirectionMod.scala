package typings.carbonComponentsReact

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextTextDirectionMod {
  
  @JSImport("carbon-components-react/lib/components/Text/TextDirection", "TextDirection")
  @js.native
  val TextDirection: FC[TextDirectionProps] = js.native
  
  trait TextDirectionProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dir: js.UndefOr[
        typings.carbonComponentsReact.libComponentsTextTextDirectionContextMod.TextDirection
      ] = js.undefined
    
    var getTextDirection: js.UndefOr[
        js.Function1[
          /* repeated */ Any, 
          js.UndefOr[
            typings.carbonComponentsReact.libComponentsTextTextDirectionContextMod.TextDirection | Null
          ]
        ]
      ] = js.undefined
  }
  object TextDirectionProps {
    
    inline def apply(): TextDirectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDirectionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextDirectionProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDir(value: typings.carbonComponentsReact.libComponentsTextTextDirectionContextMod.TextDirection): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setGetTextDirection(
        value: /* repeated */ Any => js.UndefOr[
              typings.carbonComponentsReact.libComponentsTextTextDirectionContextMod.TextDirection | Null
            ]
      ): Self = StObject.set(x, "getTextDirection", js.Any.fromFunction1(value))
      
      inline def setGetTextDirectionUndefined: Self = StObject.set(x, "getTextDirection", js.undefined)
    }
  }
}
