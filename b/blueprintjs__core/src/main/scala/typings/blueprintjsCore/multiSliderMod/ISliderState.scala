package typings.blueprintjsCore.multiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISliderState extends js.Object {
  
  var labelPrecision: Double = js.native
  
  /** the client size, in pixels, of one tick */
  var tickSize: Double = js.native
  
  /** the size of one tick as a ratio of the component's client size */
  var tickSizeRatio: Double = js.native
}
object ISliderState {
  
  @scala.inline
  def apply(labelPrecision: Double, tickSize: Double, tickSizeRatio: Double): ISliderState = {
    val __obj = js.Dynamic.literal(labelPrecision = labelPrecision.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderState]
  }
  
  @scala.inline
  implicit class ISliderStateOps[Self <: ISliderState] (val x: Self) extends AnyVal {
    
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
    def setLabelPrecision(value: Double): Self = this.set("labelPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeRatio(value: Double): Self = this.set("tickSizeRatio", value.asInstanceOf[js.Any])
  }
}
