package typings.bizcharts.mod.Guide

import typings.bizcharts.bizchartsStrings.downward
import typings.bizcharts.bizchartsStrings.upward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRegionProps extends js.Object {
  
  var content: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[upward | downward] = js.native
  
  var display: js.UndefOr[js.Object] = js.native
  
  var end: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  var lineLength: js.UndefOr[Double] = js.native
  
  var regionStyle: js.UndefOr[js.Object] = js.native
  
  var start: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var top: js.UndefOr[Boolean] = js.native
}
object DataRegionProps {
  
  @scala.inline
  def apply(): DataRegionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRegionProps]
  }
  
  @scala.inline
  implicit class DataRegionPropsOps[Self <: DataRegionProps] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDirection(value: upward | downward): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: js.Object): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = this.set("end", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndVarargs(value: js.Any*): Self = this.set("end", js.Array(value :_*))
    
    @scala.inline
    def setEnd(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setLineLength(value: Double): Self = this.set("lineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineLength: Self = this.set("lineLength", js.undefined)
    
    @scala.inline
    def setRegionStyle(value: js.Object): Self = this.set("regionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionStyle: Self = this.set("regionStyle", js.undefined)
    
    @scala.inline
    def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartVarargs(value: js.Any*): Self = this.set("start", js.Array(value :_*))
    
    @scala.inline
    def setStart(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
