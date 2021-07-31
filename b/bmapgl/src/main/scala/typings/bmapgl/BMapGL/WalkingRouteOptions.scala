package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalkingRouteOptions extends StObject {
  
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.undefined
  
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ WalkingRouteResult, Unit]] = js.undefined
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object WalkingRouteOptions {
  
  @scala.inline
  def apply(): WalkingRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkingRouteOptions]
  }
  
  @scala.inline
  implicit class WalkingRouteOptionsMutableBuilder[Self <: WalkingRouteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit): Self = StObject.set(x, "onInfoHtmlSet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInfoHtmlSetUndefined: Self = StObject.set(x, "onInfoHtmlSet", js.undefined)
    
    @scala.inline
    def setOnMarkersSet(value: /* pois */ js.Array[LocalResultPoi] => Unit): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    @scala.inline
    def setOnPolylinesSet(value: /* routes */ js.Array[Route] => Unit): Self = StObject.set(x, "onPolylinesSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPolylinesSetUndefined: Self = StObject.set(x, "onPolylinesSet", js.undefined)
    
    @scala.inline
    def setOnResultsHtmlSet(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "onResultsHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResultsHtmlSetUndefined: Self = StObject.set(x, "onResultsHtmlSet", js.undefined)
    
    @scala.inline
    def setOnSearchComplete(value: /* result */ WalkingRouteResult => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    @scala.inline
    def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
