package typings.d3kit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartOptions extends js.Object {
  
  var initialHeight: js.UndefOr[Double] = js.native
  
  var initialWidth: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[ChartMargin] = js.native
  
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var pixelRatio: js.UndefOr[Double] = js.native
}
object ChartOptions {
  
  @scala.inline
  def apply(): ChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartOptions]
  }
  
  @scala.inline
  implicit class ChartOptionsOps[Self <: ChartOptions] (val x: Self) extends AnyVal {
    
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
    def setInitialHeight(value: Double): Self = this.set("initialHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialHeight: Self = this.set("initialHeight", js.undefined)
    
    @scala.inline
    def setInitialWidth(value: Double): Self = this.set("initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialWidth: Self = this.set("initialWidth", js.undefined)
    
    @scala.inline
    def setMargin(value: ChartMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Tuple2[Double, Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
  }
}
