package typings.carbonComponentsReact

import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ReactCreateElementParam
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell/Content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: js.Object */](props: FCProps[ContentProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  type ContentProps[E /* <: js.Object */] = E & ContentPropsBase
  
  trait ContentPropsBase extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var tagName: js.UndefOr[ReactCreateElementParam] = js.undefined
  }
  object ContentPropsBase {
    
    inline def apply(): ContentPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentPropsBase]
    }
    
    extension [Self <: ContentPropsBase](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTagName(value: ReactCreateElementParam): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
