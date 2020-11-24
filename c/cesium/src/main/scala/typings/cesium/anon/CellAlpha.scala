package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellAlpha extends js.Object {
  
  var cellAlpha: js.UndefOr[Property] = js.native
  
  var color: js.UndefOr[Property] = js.native
  
  var lineCount: js.UndefOr[Property] = js.native
  
  var lineOffset: js.UndefOr[Property] = js.native
  
  var lineThickness: js.UndefOr[Property] = js.native
}
object CellAlpha {
  
  @scala.inline
  def apply(): CellAlpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellAlpha]
  }
  
  @scala.inline
  implicit class CellAlphaOps[Self <: CellAlpha] (val x: Self) extends AnyVal {
    
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
    def setCellAlpha(value: Property): Self = this.set("cellAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellAlpha: Self = this.set("cellAlpha", js.undefined)
    
    @scala.inline
    def setColor(value: Property): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLineCount(value: Property): Self = this.set("lineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineCount: Self = this.set("lineCount", js.undefined)
    
    @scala.inline
    def setLineOffset(value: Property): Self = this.set("lineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineOffset: Self = this.set("lineOffset", js.undefined)
    
    @scala.inline
    def setLineThickness(value: Property): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
  }
}
