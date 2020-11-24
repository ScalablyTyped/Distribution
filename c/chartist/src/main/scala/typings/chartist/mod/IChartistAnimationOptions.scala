package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistAnimationOptions extends js.Object {
  
  var begin: js.UndefOr[String] = js.native
  
  var dur: String | Double = js.native
  
  var easing: js.UndefOr[IChartistEasingDefinition | String] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var from: String | Double = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var to: String | Double = js.native
}
object IChartistAnimationOptions {
  
  @scala.inline
  def apply(dur: String | Double, from: String | Double, to: String | Double): IChartistAnimationOptions = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistAnimationOptions]
  }
  
  @scala.inline
  implicit class IChartistAnimationOptionsOps[Self <: IChartistAnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setDur(value: String | Double): Self = this.set("dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String | Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String | Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegin(value: String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setEasing(value: IChartistEasingDefinition | String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
