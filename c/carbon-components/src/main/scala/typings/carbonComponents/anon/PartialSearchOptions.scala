package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/search/search.SearchOptions> */
trait PartialSearchOptions extends StObject {
  
  var classClearHidden: js.UndefOr[String] = js.undefined
  
  var classLayoutHidden: js.UndefOr[String] = js.undefined
  
  var selectorClearIcon: js.UndefOr[String] = js.undefined
  
  var selectorIconContainer: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
  
  var selectorSearchInput: js.UndefOr[String] = js.undefined
  
  var selectorSearchView: js.UndefOr[String] = js.undefined
}
object PartialSearchOptions {
  
  inline def apply(): PartialSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchOptions]
  }
  
  extension [Self <: PartialSearchOptions](x: Self) {
    
    inline def setClassClearHidden(value: String): Self = StObject.set(x, "classClearHidden", value.asInstanceOf[js.Any])
    
    inline def setClassClearHiddenUndefined: Self = StObject.set(x, "classClearHidden", js.undefined)
    
    inline def setClassLayoutHidden(value: String): Self = StObject.set(x, "classLayoutHidden", value.asInstanceOf[js.Any])
    
    inline def setClassLayoutHiddenUndefined: Self = StObject.set(x, "classLayoutHidden", js.undefined)
    
    inline def setSelectorClearIcon(value: String): Self = StObject.set(x, "selectorClearIcon", value.asInstanceOf[js.Any])
    
    inline def setSelectorClearIconUndefined: Self = StObject.set(x, "selectorClearIcon", js.undefined)
    
    inline def setSelectorIconContainer(value: String): Self = StObject.set(x, "selectorIconContainer", value.asInstanceOf[js.Any])
    
    inline def setSelectorIconContainerUndefined: Self = StObject.set(x, "selectorIconContainer", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
    
    inline def setSelectorSearchInput(value: String): Self = StObject.set(x, "selectorSearchInput", value.asInstanceOf[js.Any])
    
    inline def setSelectorSearchInputUndefined: Self = StObject.set(x, "selectorSearchInput", js.undefined)
    
    inline def setSelectorSearchView(value: String): Self = StObject.set(x, "selectorSearchView", value.asInstanceOf[js.Any])
    
    inline def setSelectorSearchViewUndefined: Self = StObject.set(x, "selectorSearchView", js.undefined)
  }
}
