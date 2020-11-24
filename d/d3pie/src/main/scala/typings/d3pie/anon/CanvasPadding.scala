package typings.d3pie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPadding extends js.Object {
  
  var canvasPadding: js.UndefOr[Bottom] = js.native
  
  var colors: js.UndefOr[Background] = js.native
  
  var cssPrefix: js.UndefOr[String] = js.native
  
  var gradient: js.UndefOr[ColorEnabled] = js.native
  
  var pieCenterOffset: js.UndefOr[X] = js.native
}
object CanvasPadding {
  
  @scala.inline
  def apply(): CanvasPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasPadding]
  }
  
  @scala.inline
  implicit class CanvasPaddingOps[Self <: CanvasPadding] (val x: Self) extends AnyVal {
    
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
    def setCanvasPadding(value: Bottom): Self = this.set("canvasPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasPadding: Self = this.set("canvasPadding", js.undefined)
    
    @scala.inline
    def setColors(value: Background): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setCssPrefix(value: String): Self = this.set("cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssPrefix: Self = this.set("cssPrefix", js.undefined)
    
    @scala.inline
    def setGradient(value: ColorEnabled): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setPieCenterOffset(value: X): Self = this.set("pieCenterOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieCenterOffset: Self = this.set("pieCenterOffset", js.undefined)
  }
}
