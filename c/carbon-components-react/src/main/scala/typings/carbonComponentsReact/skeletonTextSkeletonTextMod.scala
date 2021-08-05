package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLParagraphElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonTextSkeletonTextMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/SkeletonText/SkeletonText", JSImport.Default)
  @js.native
  val default: FC[SkeletonTextProps] = js.native
  
  trait SkeletonTextProps
    extends StObject
       with HTMLAttributes[HTMLParagraphElement] {
    
    var heading: js.UndefOr[Boolean] = js.undefined
    
    var lineCount: js.UndefOr[Double] = js.undefined
    
    var paragraph: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object SkeletonTextProps {
    
    inline def apply(): SkeletonTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonTextProps]
    }
    
    extension [Self <: SkeletonTextProps](x: Self) {
      
      inline def setHeading(value: Boolean): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
      
      inline def setLineCountUndefined: Self = StObject.set(x, "lineCount", js.undefined)
      
      inline def setParagraph(value: Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FC[SkeletonTextProps]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonTextSkeletonTextMod.foo` */
  override def _to: FC[SkeletonTextProps] = default
}
