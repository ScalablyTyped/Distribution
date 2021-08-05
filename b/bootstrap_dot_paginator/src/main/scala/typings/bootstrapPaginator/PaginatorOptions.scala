package typings.bootstrapPaginator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorOptions extends StObject {
  
  var alignment: js.UndefOr[String] = js.undefined
  
  var bootstrapMajorVersion: js.UndefOr[Double] = js.undefined
  
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.undefined
  
  var currentPage: js.UndefOr[Double] = js.undefined
  
  var itemContainerClass: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  
  var itemTexts: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  
  var numberOfPages: js.UndefOr[Double] = js.undefined
  
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var pageUrl: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  
  var shouldShowPage: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var tooltipTitles: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  
  var totalPages: js.UndefOr[Double] = js.undefined
  
  var useBootstrapTooltip: js.UndefOr[Boolean] = js.undefined
}
object PaginatorOptions {
  
  inline def apply(): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorOptions]
  }
  
  extension [Self <: PaginatorOptions](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBootstrapMajorVersion(value: Double): Self = StObject.set(x, "bootstrapMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setBootstrapMajorVersionUndefined: Self = StObject.set(x, "bootstrapMajorVersion", js.undefined)
    
    inline def setBootstrapTooltipOptions(value: js.Object): Self = StObject.set(x, "bootstrapTooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setBootstrapTooltipOptionsUndefined: Self = StObject.set(x, "bootstrapTooltipOptions", js.undefined)
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setItemContainerClass(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "itemContainerClass", js.Any.fromFunction3(value))
    
    inline def setItemContainerClassUndefined: Self = StObject.set(x, "itemContainerClass", js.undefined)
    
    inline def setItemTexts(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "itemTexts", js.Any.fromFunction3(value))
    
    inline def setItemTextsUndefined: Self = StObject.set(x, "itemTexts", js.undefined)
    
    inline def setNumberOfPages(value: Double): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPagesUndefined: Self = StObject.set(x, "numberOfPages", js.undefined)
    
    inline def setOnPageChanged(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = StObject.set(x, "onPageChanged", js.Any.fromFunction4(value))
    
    inline def setOnPageChangedUndefined: Self = StObject.set(x, "onPageChanged", js.undefined)
    
    inline def setOnPageClicked(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = StObject.set(x, "onPageClicked", js.Any.fromFunction4(value))
    
    inline def setOnPageClickedUndefined: Self = StObject.set(x, "onPageClicked", js.undefined)
    
    inline def setPageUrl(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction3(value))
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setShouldShowPage(value: Boolean): Self = StObject.set(x, "shouldShowPage", value.asInstanceOf[js.Any])
    
    inline def setShouldShowPageUndefined: Self = StObject.set(x, "shouldShowPage", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTooltipTitles(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "tooltipTitles", js.Any.fromFunction3(value))
    
    inline def setTooltipTitlesUndefined: Self = StObject.set(x, "tooltipTitles", js.undefined)
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    inline def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    
    inline def setUseBootstrapTooltip(value: Boolean): Self = StObject.set(x, "useBootstrapTooltip", value.asInstanceOf[js.Any])
    
    inline def setUseBootstrapTooltipUndefined: Self = StObject.set(x, "useBootstrapTooltip", js.undefined)
  }
}
