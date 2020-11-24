package typings.c3.mod

import typings.c3.anon.HeightNumber
import typings.c3.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubchartOptions extends js.Object {
  
  var axis: js.UndefOr[`2`] = js.native
  
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.native
  
  /**
    * Show sub chart on the bottom of the chart.
    * Defaults to `false`.
    */
  var show: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[HeightNumber] = js.native
}
object SubchartOptions {
  
  @scala.inline
  def apply(): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubchartOptions]
  }
  
  @scala.inline
  implicit class SubchartOptionsOps[Self <: SubchartOptions] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: `2`): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setOnbrush(value: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]): Self = this.set("onbrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbrush: Self = this.set("onbrush", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSize(value: HeightNumber): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
