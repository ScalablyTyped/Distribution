package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusLineSearchOptions extends js.Object {
  
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
  implicit class BusLineSearchOptionsOps[Self <: BusLineSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnBusLineHtmlSet(value: /* container */ HTMLElement => Unit): Self = this.set("onBusLineHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBusLineHtmlSet: Self = this.set("onBusLineHtmlSet", js.undefined)
    
    @scala.inline
    def setOnBusListHtmlSet(value: /* container */ HTMLElement => Unit): Self = this.set("onBusListHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBusListHtmlSet: Self = this.set("onBusListHtmlSet", js.undefined)
    
    @scala.inline
    def setOnGetBusLineComplete(value: /* rs */ BusLine => Unit): Self = this.set("onGetBusLineComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetBusLineComplete: Self = this.set("onGetBusLineComplete", js.undefined)
    
    @scala.inline
    def setOnGetBusListComplete(value: /* rs */ BusListResult => Unit): Self = this.set("onGetBusListComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetBusListComplete: Self = this.set("onGetBusListComplete", js.undefined)
    
    @scala.inline
    def setOnMarkersSet(value: /* sts */ js.Array[Marker] => Unit): Self = this.set("onMarkersSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkersSet: Self = this.set("onMarkersSet", js.undefined)
    
    @scala.inline
    def setOnPolylinesSet(value: /* ply */ Polyline => Unit): Self = this.set("onPolylinesSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPolylinesSet: Self = this.set("onPolylinesSet", js.undefined)
    
    @scala.inline
    def setRenderOptions(value: RenderOptions): Self = this.set("renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderOptions: Self = this.set("renderOptions", js.undefined)
  }
}
