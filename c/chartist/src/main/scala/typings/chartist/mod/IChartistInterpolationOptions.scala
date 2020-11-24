package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartistInterpolationOptions extends js.Object {
  
  var fillHoles: js.UndefOr[Boolean] = js.native
}
object IChartistInterpolationOptions {
  
  @scala.inline
  def apply(): IChartistInterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartistInterpolationOptions]
  }
  
  @scala.inline
  implicit class IChartistInterpolationOptionsOps[Self <: IChartistInterpolationOptions] (val x: Self) extends AnyVal {
    
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
    def setFillHoles(value: Boolean): Self = this.set("fillHoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillHoles: Self = this.set("fillHoles", js.undefined)
  }
}
