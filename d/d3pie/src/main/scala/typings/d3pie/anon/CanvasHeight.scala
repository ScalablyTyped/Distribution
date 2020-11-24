package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasHeight extends js.Object {
  
  var canvasHeight: js.UndefOr[Double] = js.native
  
  var canvasWidth: js.UndefOr[Double] = js.native
  
  var pieInnerRadius: js.UndefOr[String | Double] = js.native
  
  var pieOuterRadius: js.UndefOr[String | Double] = js.native
}
object CanvasHeight {
  
  @scala.inline
  def apply(): CanvasHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHeight]
  }
  
  @scala.inline
  implicit class CanvasHeightOps[Self <: CanvasHeight] (val x: Self) extends AnyVal {
    
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
    def setCanvasHeight(value: Double): Self = this.set("canvasHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasHeight: Self = this.set("canvasHeight", js.undefined)
    
    @scala.inline
    def setCanvasWidth(value: Double): Self = this.set("canvasWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasWidth: Self = this.set("canvasWidth", js.undefined)
    
    @scala.inline
    def setPieInnerRadius(value: String | Double): Self = this.set("pieInnerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieInnerRadius: Self = this.set("pieInnerRadius", js.undefined)
    
    @scala.inline
    def setPieOuterRadius(value: String | Double): Self = this.set("pieOuterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieOuterRadius: Self = this.set("pieOuterRadius", js.undefined)
  }
}
