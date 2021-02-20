package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusLineSearchOptions extends StObject {
  
  var onBusLineHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  
  var onBusListHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  
  var onGetBusLineComplete: js.UndefOr[js.Function1[/* rs */ BusLine, Unit]] = js.native
  
  var onGetBusListComplete: js.UndefOr[js.Function1[/* rs */ BusListResult, Unit]] = js.native
  
  var onMarkersSet: js.UndefOr[js.Function1[/* sts */ js.Array[Marker], Unit]] = js.native
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* ply */ Polyline, Unit]] = js.native
  
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}
object BusLineSearchOptions {
  
  @scala.inline
  def apply(): BusLineSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusLineSearchOptions]
  }
  
  @scala.inline
  implicit class BusLineSearchOptionsMutableBuilder[Self <: BusLineSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBusLineHtmlSet(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "onBusLineHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBusLineHtmlSetUndefined: Self = StObject.set(x, "onBusLineHtmlSet", js.undefined)
    
    @scala.inline
    def setOnBusListHtmlSet(value: /* container */ HTMLElement => Unit): Self = StObject.set(x, "onBusListHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBusListHtmlSetUndefined: Self = StObject.set(x, "onBusListHtmlSet", js.undefined)
    
    @scala.inline
    def setOnGetBusLineComplete(value: /* rs */ BusLine => Unit): Self = StObject.set(x, "onGetBusLineComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetBusLineCompleteUndefined: Self = StObject.set(x, "onGetBusLineComplete", js.undefined)
    
    @scala.inline
    def setOnGetBusListComplete(value: /* rs */ BusListResult => Unit): Self = StObject.set(x, "onGetBusListComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGetBusListCompleteUndefined: Self = StObject.set(x, "onGetBusListComplete", js.undefined)
    
    @scala.inline
    def setOnMarkersSet(value: /* sts */ js.Array[Marker] => Unit): Self = StObject.set(x, "onMarkersSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMarkersSetUndefined: Self = StObject.set(x, "onMarkersSet", js.undefined)
    
    @scala.inline
    def setOnPolylinesSet(value: /* ply */ Polyline => Unit): Self = StObject.set(x, "onPolylinesSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPolylinesSetUndefined: Self = StObject.set(x, "onPolylinesSet", js.undefined)
    
    @scala.inline
    def setRenderOptions(value: RenderOptions): Self = StObject.set(x, "renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOptionsUndefined: Self = StObject.set(x, "renderOptions", js.undefined)
  }
}
