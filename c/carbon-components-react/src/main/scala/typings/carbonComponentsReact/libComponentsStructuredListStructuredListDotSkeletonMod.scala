package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsStructuredListStructuredListDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/StructuredList/StructuredList.Skeleton", JSImport.Default)
  @js.native
  val default: FC[StructuredListSkeletonProps] = js.native
  
  trait StructuredListSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var border: js.UndefOr[Boolean] = js.undefined
    
    var rowCount: js.UndefOr[Double] = js.undefined
  }
  object StructuredListSkeletonProps {
    
    inline def apply(): StructuredListSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StructuredListSkeletonProps]
    }
    
    extension [Self <: StructuredListSkeletonProps](x: Self) {
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    }
  }
  
  type _To = FC[StructuredListSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsStructuredListStructuredListDotSkeletonMod.foo` */
  override def _to: FC[StructuredListSkeletonProps] = default
}
