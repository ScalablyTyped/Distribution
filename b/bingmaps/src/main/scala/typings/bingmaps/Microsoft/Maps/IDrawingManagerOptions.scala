package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDrawingManagerOptions extends IDrawingToolOptions {
  
  /** The fill color used for pushpins and polygons. */
  var fillColor: js.UndefOr[String | Color] = js.native
  
  /** The stroke color used for polylines and polygons. */
  var strokeColor: js.UndefOr[String | Color] = js.native
}
object IDrawingManagerOptions {
  
  @scala.inline
  def apply(): IDrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawingManagerOptions]
  }
  
  @scala.inline
  implicit class IDrawingManagerOptionsOps[Self <: IDrawingManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setFillColor(value: String | Color): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String | Color): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
  }
}
