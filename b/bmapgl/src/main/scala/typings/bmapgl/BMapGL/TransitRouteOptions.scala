package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitRouteOptions extends StObject {
  
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  
  var onMarkersSet: js.UndefOr[
    js.Function2[/* pois */ js.Array[LocalResultPoi], /* transfers */ js.Array[LocalResultPoi], Unit]
  ] = js.undefined
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* lines */ js.Array[Line], Unit]] = js.undefined
  
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ TransitRouteResult, Unit]] = js.undefined
  
  var pageCapacity: js.UndefOr[Double] = js.undefined
  
  var policy: js.UndefOr[TransitPolicy] = js.undefined
  
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}
object TransitRouteOptions {
  
  @scala.inline
  def apply(): TransitRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitRouteOptions]
  }
  
  @scala.inline
  implicit class TransitRouteOptionsMutableBuilder[Self <: TransitRouteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit): Self = StObject.set(x, "onInfoHtmlSet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInfoHtmlSetUndefined: Self = StObject.set(x, "onInfoHtmlSet", js.undefined)
    
    @scala.inline
    def setOnMarkersSet(value: (/* pois */ js.Array[LocalResultPoi], /* transfers */ js.Array[LocalResultPoi]) => Unit): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    @scala.inline
    def setOnPolylinesSet(value: /* lines */ js.Array[Line] => Unit): Self = StObject.set(x, "onPolylinesSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPolylinesSetUndefined: Self = StObject.set(x, "onPolylinesSet", js.undefined)
    
    @scala.inline
    def setOnResultsHtmlSet(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "onResultsHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResultsHtmlSetUndefined: Self = StObject.set(x, "onResultsHtmlSet", js.undefined)
    
    @scala.inline
    def setOnSearchComplete(value: /* result */ TransitRouteResult => Unit): Self = StObject.set(x, "onSearchComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchCompleteUndefined: Self = StObject.set(x, "onSearchComplete", js.undefined)
    
    @scala.inline
    def setPageCapacity(value: Double): Self = StObject.set(x, "pageCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCapacityUndefined: Self = StObject.set(x, "pageCapacity", js.undefined)
    
    @scala.inline
    def setPolicy(value: TransitPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
