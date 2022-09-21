package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.`2xl`
import typings.carbonComponentsReact.carbonComponentsReactStrings.field
import typings.carbonComponentsReact.carbonComponentsReactStrings.lg
import typings.carbonComponentsReact.carbonComponentsReactStrings.md
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.carbonComponentsReact.carbonComponentsReactStrings.small
import typings.carbonComponentsReact.carbonComponentsReactStrings.xl
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Button/Button.Skeleton", JSImport.Default)
  @js.native
  val default: FC[ButtonSkeletonProps] = js.native
  
  trait ButtonSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var href: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[
        typings.carbonComponentsReact.carbonComponentsReactStrings.default | field | lg | md | sm | small | xl | `2xl`
      ] = js.undefined
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonSkeletonProps {
    
    inline def apply(): ButtonSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonSkeletonProps]
    }
    
    extension [Self <: ButtonSkeletonProps](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setSize(
        value: typings.carbonComponentsReact.carbonComponentsReactStrings.default | field | lg | md | sm | small | xl | `2xl`
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  type _To = FC[ButtonSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `buttonSkeletonMod.foo` */
  override def _to: FC[ButtonSkeletonProps] = default
}
