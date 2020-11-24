package typings.bmapgl.MapVGL

import typings.bmapgl.bmapglStrings.blank
import typings.bmapgl.bmapglStrings.bmap
import typings.bmapgl.bmapglStrings.cesium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions extends js.Object {
  
  var effects: js.UndefOr[js.Array[Effects]] = js.native
  
  var map: js.UndefOr[js.Object] = js.native
  
  var mapType: js.UndefOr[bmap | blank | cesium] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
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
    def setEffectsVarargs(value: Effects*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[Effects]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setMap(value: js.Object): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMapType(value: bmap | blank | cesium): Self = this.set("mapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapType: Self = this.set("mapType", js.undefined)
  }
}
