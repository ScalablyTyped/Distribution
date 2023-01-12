package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPaginationExperimentalPaginationMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Pagination/experimental/Pagination", JSImport.Default)
  @js.native
  val default: FC[ExperimentalPaginationProps] = js.native
  
  trait ExperimentalPaginationProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var backwardText: js.UndefOr[String] = js.undefined
    
    var forwardText: js.UndefOr[String] = js.undefined
    
    var initialPage: js.UndefOr[Double] = js.undefined
    
    var itemRangeText: js.UndefOr[js.Function3[/* min */ Double, /* max */ Double, /* total */ Double, String]] = js.undefined
    
    var itemText: js.UndefOr[js.Function2[/* min */ Double, /* max */ Double, String]] = js.undefined
    
    var itemsPerPageText: js.UndefOr[String] = js.undefined
    
    var pageRangeText: js.UndefOr[js.Function2[/* current */ Double | String, /* total */ Double, String]] = js.undefined
    
    var pageSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var pageText: js.UndefOr[js.Function1[/* currentPage */ Double, String]] = js.undefined
    
    var pagesUnknown: js.UndefOr[Boolean] = js.undefined
    
    var totalItems: js.UndefOr[Double] = js.undefined
  }
  object ExperimentalPaginationProps {
    
    inline def apply(): ExperimentalPaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExperimentalPaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExperimentalPaginationProps] (val x: Self) extends AnyVal {
      
      inline def setBackwardText(value: String): Self = StObject.set(x, "backwardText", value.asInstanceOf[js.Any])
      
      inline def setBackwardTextUndefined: Self = StObject.set(x, "backwardText", js.undefined)
      
      inline def setForwardText(value: String): Self = StObject.set(x, "forwardText", value.asInstanceOf[js.Any])
      
      inline def setForwardTextUndefined: Self = StObject.set(x, "forwardText", js.undefined)
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setItemRangeText(value: (/* min */ Double, /* max */ Double, /* total */ Double) => String): Self = StObject.set(x, "itemRangeText", js.Any.fromFunction3(value))
      
      inline def setItemRangeTextUndefined: Self = StObject.set(x, "itemRangeText", js.undefined)
      
      inline def setItemText(value: (/* min */ Double, /* max */ Double) => String): Self = StObject.set(x, "itemText", js.Any.fromFunction2(value))
      
      inline def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
      
      inline def setItemsPerPageText(value: String): Self = StObject.set(x, "itemsPerPageText", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageTextUndefined: Self = StObject.set(x, "itemsPerPageText", js.undefined)
      
      inline def setPageRangeText(value: (/* current */ Double | String, /* total */ Double) => String): Self = StObject.set(x, "pageRangeText", js.Any.fromFunction2(value))
      
      inline def setPageRangeTextUndefined: Self = StObject.set(x, "pageRangeText", js.undefined)
      
      inline def setPageSizes(value: js.Array[Double]): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
      
      inline def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
      
      inline def setPageSizesVarargs(value: Double*): Self = StObject.set(x, "pageSizes", js.Array(value*))
      
      inline def setPageText(value: /* currentPage */ Double => String): Self = StObject.set(x, "pageText", js.Any.fromFunction1(value))
      
      inline def setPageTextUndefined: Self = StObject.set(x, "pageText", js.undefined)
      
      inline def setPagesUnknown(value: Boolean): Self = StObject.set(x, "pagesUnknown", value.asInstanceOf[js.Any])
      
      inline def setPagesUnknownUndefined: Self = StObject.set(x, "pagesUnknown", js.undefined)
      
      inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
      
      inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    }
  }
  
  type _To = FC[ExperimentalPaginationProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsPaginationExperimentalPaginationMod.foo` */
  override def _to: FC[ExperimentalPaginationProps] = default
}
