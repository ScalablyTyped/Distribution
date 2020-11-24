package typings.chartJs.mod

import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.xy
import typings.chartJs.chartJsStrings.y
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartHoverOptions extends js.Object {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var axis: js.UndefOr[x | y | xy] = js.native
  
  var intersect: js.UndefOr[Boolean] = js.native
  
  var mode: js.UndefOr[InteractionMode] = js.native
  
  var onHover: js.UndefOr[
    js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
  ] = js.native
}
object ChartHoverOptions {
  
  @scala.inline
  def apply(): ChartHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartHoverOptions]
  }
  
  @scala.inline
  implicit class ChartHoverOptionsOps[Self <: ChartHoverOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAxis(value: typings.chartJs.chartJsStrings.x | y | xy): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setIntersect(value: Boolean): Self = this.set("intersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersect: Self = this.set("intersect", js.undefined)
    
    @scala.inline
    def setMode(value: InteractionMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnHover(
      value: js.ThisFunction2[/* this */ Chart, /* event */ MouseEvent, /* activeElements */ js.Array[js.Object], _]
    ): Self = this.set("onHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
  }
}
