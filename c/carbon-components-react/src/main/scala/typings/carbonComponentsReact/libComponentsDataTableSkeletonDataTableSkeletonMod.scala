package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableSkeletonDataTableSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTableSkeleton/DataTableSkeleton", JSImport.Default)
  @js.native
  val default: FC[DataTableSkeletonProps] = js.native
  
  trait DataTableSkeletonHeader extends StObject {
    
    var header: js.UndefOr[String] = js.undefined
  }
  object DataTableSkeletonHeader {
    
    inline def apply(): DataTableSkeletonHeader = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableSkeletonHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableSkeletonHeader] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  trait DataTableSkeletonProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement] {
    
    var columnCount: js.UndefOr[Double] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Array[DataTableSkeletonHeader]] = js.undefined
    
    var rowCount: js.UndefOr[Double] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    var zebra: js.UndefOr[Boolean] = js.undefined
  }
  object DataTableSkeletonProps {
    
    inline def apply(): DataTableSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableSkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableSkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setHeaders(value: js.Array[DataTableSkeletonHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: DataTableSkeletonHeader*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setZebra(value: Boolean): Self = StObject.set(x, "zebra", value.asInstanceOf[js.Any])
      
      inline def setZebraUndefined: Self = StObject.set(x, "zebra", js.undefined)
    }
  }
  
  type _To = FC[DataTableSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableSkeletonDataTableSkeletonMod.foo` */
  override def _to: FC[DataTableSkeletonProps] = default
}
