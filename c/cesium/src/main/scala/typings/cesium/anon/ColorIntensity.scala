package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorIntensity extends js.Object {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var intensity: js.UndefOr[Double] = js.native
}
object ColorIntensity {
  
  @scala.inline
  def apply(): ColorIntensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorIntensity]
  }
  
  @scala.inline
  implicit class ColorIntensityOps[Self <: ColorIntensity] (val x: Self) extends AnyVal {
    
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
    def setColor(value: typings.cesium.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setIntensity(value: Double): Self = this.set("intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntensity: Self = this.set("intensity", js.undefined)
  }
}
