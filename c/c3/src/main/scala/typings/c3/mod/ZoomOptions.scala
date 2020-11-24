package typings.c3.mod

import typings.c3.anon.Min
import typings.c3.c3Strings.drag
import typings.c3.c3Strings.scroll
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomOptions extends js.Object {
  
  /**
    * Disable the default animation of zoom. This option is useful when you want to get the zoomed domain by `onzoom` or `onzoomend` handlers and override the default animation behavior.
    * @see https://github.com/c3js/c3/pull/2439 for details.
    */
  var disableDefaultBehavior: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable zooming.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Change zoom extent.
    * **Experimental.**
    */
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  /**
    * Set the initial minimum and maximum x-axis zoom values.
    */
  var initialRange: js.UndefOr[Domain] = js.native
  
  /**
    * Set callback that is called when the chart is zooming. Specified function receives the zoomed domain.
    */
  var onzoom: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  
  /**
    * Set callback that is called when zooming ends. Specified function receives the zoomed domain.
    */
  var onzoomend: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  
  /**
    * Set callback that is called when zooming starts. Specified function receives the zoom event.
    */
  var onzoomstart: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* event */ Event, Unit]] = js.native
  
  var priveleged: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable to rescale after zooming. If true set, y domain will be updated according to the zoomed region.
    */
  var rescale: js.UndefOr[Boolean] = js.native
  
  /**
    * Set interaction type for zooming
    */
  var `type`: js.UndefOr[scroll | drag] = js.native
  
  var x: js.UndefOr[Min] = js.native
}
object ZoomOptions {
  
  @scala.inline
  def apply(): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomOptions]
  }
  
  @scala.inline
  implicit class ZoomOptionsOps[Self <: ZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableDefaultBehavior(value: Boolean): Self = this.set("disableDefaultBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDefaultBehavior: Self = this.set("disableDefaultBehavior", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExtent(value: js.Tuple2[Double, Double]): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setInitialRange(value: Domain): Self = this.set("initialRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRange: Self = this.set("initialRange", js.undefined)
    
    @scala.inline
    def setOnzoom(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = this.set("onzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnzoom: Self = this.set("onzoom", js.undefined)
    
    @scala.inline
    def setOnzoomend(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = this.set("onzoomend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnzoomend: Self = this.set("onzoomend", js.undefined)
    
    @scala.inline
    def setOnzoomstart(value: js.ThisFunction1[/* this */ ChartAPI, /* event */ Event, Unit]): Self = this.set("onzoomstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnzoomstart: Self = this.set("onzoomstart", js.undefined)
    
    @scala.inline
    def setPriveleged(value: Boolean): Self = this.set("priveleged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriveleged: Self = this.set("priveleged", js.undefined)
    
    @scala.inline
    def setRescale(value: Boolean): Self = this.set("rescale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRescale: Self = this.set("rescale", js.undefined)
    
    @scala.inline
    def setType(value: scroll | drag): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setX(value: Min): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
}
