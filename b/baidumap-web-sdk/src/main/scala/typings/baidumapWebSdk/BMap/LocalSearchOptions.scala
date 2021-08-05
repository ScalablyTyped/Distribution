package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSearchOptions extends StObject {
  
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ js.Array[LocalResult], Unit]] = js.undefined
  
  var pageCapacity: js.UndefOr[Double] = js.undefined
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object LocalSearchOptions {
  
  inline def apply(): LocalSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSearchOptions]
  }
  
  extension [Self <: LocalSearchOptions](x: Self) {
    
    inline def setOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit): Self = StObject.set(x, "onInfoHtmlSet", js.Any.fromFunction2(value))
    
    inline def setOnInfoHtmlSetUndefined: Self = StObject.set(x, "onInfoHtmlSet", js.undefined)
    
    inline def setOnMarkersSet(value: /* pois */ js.Array[LocalResultPoi] => Unit): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction1(value))
    
    inline def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    inline def setOnResultsHtmlSet(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "onResultsHtmlSet", js.Any.fromFunction1(value))
    
    inline def setOnResultsHtmlSetUndefined: Self = StObject.set(x, "onResultsHtmlSet", js.undefined)
    
    inline def setOnSearchComplete(value: /* results */ js.Array[LocalResult] => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1(value))
    
    inline def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    inline def setPageCapacity(value: Double): Self = StObject.set(x, "pageCapacity", value.asInstanceOf[js.Any])
    
    inline def setPageCapacityUndefined: Self = StObject.set(x, "pageCapacity", js.undefined)
    
    inline def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
