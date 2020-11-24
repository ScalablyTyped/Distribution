package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBorderedMapElementStyle extends IMapElementStyle {
  
  /**
    * Secondary/casing line hex color of the border of a filled polygon.
    */
  var borderOutlineColor: js.UndefOr[String] = js.native
  
  /**
    * Primary line hex color of the border of a filled polygon.
    */
  var borderStrokeColor: js.UndefOr[String] = js.native
  
  /**
    * Specifies if a border is visible or not.
    */
  var borderVisible: js.UndefOr[Boolean] = js.native
}
object IBorderedMapElementStyle {
  
  @scala.inline
  def apply(): IBorderedMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorderedMapElementStyle]
  }
  
  @scala.inline
  implicit class IBorderedMapElementStyleOps[Self <: IBorderedMapElementStyle] (val x: Self) extends AnyVal {
    
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
    def setBorderOutlineColor(value: String): Self = this.set("borderOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderOutlineColor: Self = this.set("borderOutlineColor", js.undefined)
    
    @scala.inline
    def setBorderStrokeColor(value: String): Self = this.set("borderStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStrokeColor: Self = this.set("borderStrokeColor", js.undefined)
    
    @scala.inline
    def setBorderVisible(value: Boolean): Self = this.set("borderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderVisible: Self = this.set("borderVisible", js.undefined)
  }
}
