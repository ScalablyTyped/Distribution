package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrivingRouteOptions extends StObject {
  
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.undefined
  
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ DrivingRouteResult, Unit]] = js.undefined
  
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object DrivingRouteOptions {
  
  inline def apply(): DrivingRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrivingRouteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrivingRouteOptions] (val x: Self) extends AnyVal {
    
    inline def setOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit): Self = StObject.set(x, "onInfoHtmlSet", js.Any.fromFunction2(value))
    
    inline def setOnInfoHtmlSetUndefined: Self = StObject.set(x, "onInfoHtmlSet", js.undefined)
    
    inline def setOnMarkersSet(value: /* pois */ js.Array[LocalResultPoi] => Unit): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction1(value))
    
    inline def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    inline def setOnPolylinesSet(value: /* routes */ js.Array[Route] => Unit): Self = StObject.set(x, "onPolylinesSet", js.Any.fromFunction1(value))
    
    inline def setOnPolylinesSetUndefined: Self = StObject.set(x, "onPolylinesSet", js.undefined)
    
    inline def setOnResultsHtmlSet(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "onResultsHtmlSet", js.Any.fromFunction1(value))
    
    inline def setOnResultsHtmlSetUndefined: Self = StObject.set(x, "onResultsHtmlSet", js.undefined)
    
    inline def setOnSearchComplete(value: /* results */ DrivingRouteResult => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1(value))
    
    inline def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    inline def setPolicy(value: DrivingPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    inline def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
