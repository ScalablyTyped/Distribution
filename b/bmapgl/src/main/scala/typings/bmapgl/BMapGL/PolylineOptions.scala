package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineOptions extends js.Object {
  
  var enableClicking: js.UndefOr[Boolean] = js.native
  
  var enableEditing: js.UndefOr[Boolean] = js.native
  
  var enableMassClear: js.UndefOr[Boolean] = js.native
  
  var strokeColor: js.UndefOr[String] = js.native
  
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  var strokeStyle: js.UndefOr[String] = js.native
  
  var strokeWeight: js.UndefOr[Double] = js.native
}
object PolylineOptions {
  
  @scala.inline
  def apply(): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineOptions]
  }
  
  @scala.inline
  implicit class PolylineOptionsOps[Self <: PolylineOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableClicking(value: Boolean): Self = this.set("enableClicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClicking: Self = this.set("enableClicking", js.undefined)
    
    @scala.inline
    def setEnableEditing(value: Boolean): Self = this.set("enableEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEditing: Self = this.set("enableEditing", js.undefined)
    
    @scala.inline
    def setEnableMassClear(value: Boolean): Self = this.set("enableMassClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMassClear: Self = this.set("enableMassClear", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeStyle(value: String): Self = this.set("strokeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeStyle: Self = this.set("strokeStyle", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
  }
}
