package typings.bootstrapPaginator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginatorOptions extends StObject {
  
  var alignment: js.UndefOr[String] = js.native
  
  var bootstrapMajorVersion: js.UndefOr[Double] = js.native
  
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.native
  
  var currentPage: js.UndefOr[Double] = js.native
  
  var itemContainerClass: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  
  var itemTexts: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  
  var numberOfPages: js.UndefOr[Double] = js.native
  
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.native
  
  var pageUrl: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  
  var shouldShowPage: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var tooltipTitles: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.native
  
  var totalPages: js.UndefOr[Double] = js.native
  
  var useBootstrapTooltip: js.UndefOr[Boolean] = js.native
}
object PaginatorOptions {
  
  @scala.inline
  def apply(): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorOptions]
  }
  
  @scala.inline
  implicit class PaginatorOptionsMutableBuilder[Self <: PaginatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setBootstrapMajorVersion(value: Double): Self = StObject.set(x, "bootstrapMajorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapMajorVersionUndefined: Self = StObject.set(x, "bootstrapMajorVersion", js.undefined)
    
    @scala.inline
    def setBootstrapTooltipOptions(value: js.Object): Self = StObject.set(x, "bootstrapTooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapTooltipOptionsUndefined: Self = StObject.set(x, "bootstrapTooltipOptions", js.undefined)
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    @scala.inline
    def setItemContainerClass(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "itemContainerClass", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemContainerClassUndefined: Self = StObject.set(x, "itemContainerClass", js.undefined)
    
    @scala.inline
    def setItemTexts(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "itemTexts", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemTextsUndefined: Self = StObject.set(x, "itemTexts", js.undefined)
    
    @scala.inline
    def setNumberOfPages(value: Double): Self = StObject.set(x, "numberOfPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfPagesUndefined: Self = StObject.set(x, "numberOfPages", js.undefined)
    
    @scala.inline
    def setOnPageChanged(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = StObject.set(x, "onPageChanged", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnPageChangedUndefined: Self = StObject.set(x, "onPageChanged", js.undefined)
    
    @scala.inline
    def setOnPageClicked(
      value: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Unit
    ): Self = StObject.set(x, "onPageClicked", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnPageClickedUndefined: Self = StObject.set(x, "onPageClicked", js.undefined)
    
    @scala.inline
    def setPageUrl(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "pageUrl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    @scala.inline
    def setShouldShowPage(value: Boolean): Self = StObject.set(x, "shouldShowPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldShowPageUndefined: Self = StObject.set(x, "shouldShowPage", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTooltipTitles(value: (/* type */ String, /* page */ Double, /* current */ Double) => String): Self = StObject.set(x, "tooltipTitles", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTooltipTitlesUndefined: Self = StObject.set(x, "tooltipTitles", js.undefined)
    
    @scala.inline
    def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPagesUndefined: Self = StObject.set(x, "totalPages", js.undefined)
    
    @scala.inline
    def setUseBootstrapTooltip(value: Boolean): Self = StObject.set(x, "useBootstrapTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBootstrapTooltipUndefined: Self = StObject.set(x, "useBootstrapTooltip", js.undefined)
  }
}
