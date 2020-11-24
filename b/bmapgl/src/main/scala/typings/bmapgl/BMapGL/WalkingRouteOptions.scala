package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkingRouteOptions extends js.Object {
  
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.native
  
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.native
  
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.native
  
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.native
  
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ WalkingRouteResult, Unit]] = js.native
  
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}
object WalkingRouteOptions {
  
  @scala.inline
  def apply(): WalkingRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkingRouteOptions]
  }
  
  @scala.inline
  implicit class WalkingRouteOptionsOps[Self <: WalkingRouteOptions] (val x: Self) extends AnyVal {
    
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
    def setOnInfoHtmlSet(value: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit): Self = this.set("onInfoHtmlSet", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnInfoHtmlSet: Self = this.set("onInfoHtmlSet", js.undefined)
    
    @scala.inline
    def setOnMarkersSet(value: /* pois */ js.Array[LocalResultPoi] => Unit): Self = this.set("onMarkersSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMarkersSet: Self = this.set("onMarkersSet", js.undefined)
    
    @scala.inline
    def setOnPolylinesSet(value: /* routes */ js.Array[Route] => Unit): Self = this.set("onPolylinesSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPolylinesSet: Self = this.set("onPolylinesSet", js.undefined)
    
    @scala.inline
    def setOnResultsHtmlSet(value: /* container */ HTMLElement => Unit): Self = this.set("onResultsHtmlSet", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResultsHtmlSet: Self = this.set("onResultsHtmlSet", js.undefined)
    
    @scala.inline
    def setOnSearchComplete(value: /* result */ WalkingRouteResult => Unit): Self = this.set("onSearchComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearchComplete: Self = this.set("onSearchComplete", js.undefined)
    
    @scala.inline
    def setRenderOptions(value: RenderOptions): Self = this.set("renderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderOptions: Self = this.set("renderOptions", js.undefined)
  }
}
