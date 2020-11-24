package typings.datatablesNetScroller.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollerSettings extends js.Object {
  
  /*
    * Scroller uses the boundary scaling factor to decide when to redraw the table - which it
    * typically does before you reach the end of the currently loaded data set (in order to
    * allow the data to look continuous to a user scrolling through the data).
    */
  var boundaryScale: js.UndefOr[Double] = js.native
  
  /*
    * The display buffer is what Scroller uses to calculate how many rows it should pre-fetch
    * for scrolling.
    */
  var displayBuffer: js.UndefOr[Double] = js.native
  
  /*
    * Show (or not) the loading element in the background of the table. Note that you should
    * include the dataTables.scroller.css file for this to be displayed correctly.
    */
  var loadingIndicator: js.UndefOr[Boolean] = js.native
  
  /*
    * Scroller will attempt to automatically calculate the height of rows for it's internal
    * calculations. However the height that is used can be overridden using this parameter.
    */
  var rowHeight: js.UndefOr[Double | String] = js.native
  
  /*
    * When using server-side processing, Scroller will wait a small amount of time to allow
    * the scrolling to finish before requesting more data from the server.
    */
  var serverWait: js.UndefOr[Double] = js.native
  
  /*
    * Indicate if Scroller show show trace information on the console or not.
    */
  var trace: js.UndefOr[Boolean] = js.native
}
object ScrollerSettings {
  
  @scala.inline
  def apply(): ScrollerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerSettings]
  }
  
  @scala.inline
  implicit class ScrollerSettingsOps[Self <: ScrollerSettings] (val x: Self) extends AnyVal {
    
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
    def setBoundaryScale(value: Double): Self = this.set("boundaryScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryScale: Self = this.set("boundaryScale", js.undefined)
    
    @scala.inline
    def setDisplayBuffer(value: Double): Self = this.set("displayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayBuffer: Self = this.set("displayBuffer", js.undefined)
    
    @scala.inline
    def setLoadingIndicator(value: Boolean): Self = this.set("loadingIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingIndicator: Self = this.set("loadingIndicator", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double | String): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setServerWait(value: Double): Self = this.set("serverWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerWait: Self = this.set("serverWait", js.undefined)
    
    @scala.inline
    def setTrace(value: Boolean): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
  }
}
