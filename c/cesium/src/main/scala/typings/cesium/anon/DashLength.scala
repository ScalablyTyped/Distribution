package typings.cesium.anon

import typings.cesium.mod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashLength extends js.Object {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var dashLength: js.UndefOr[Property] = js.native
  
  var dashPattern: js.UndefOr[Property] = js.native
  
  var gapColor: js.UndefOr[typings.cesium.mod.Color] = js.native
}
object DashLength {
  
  @scala.inline
  def apply(): DashLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashLength]
  }
  
  @scala.inline
  implicit class DashLengthOps[Self <: DashLength] (val x: Self) extends AnyVal {
    
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
    def setDashLength(value: Property): Self = this.set("dashLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashLength: Self = this.set("dashLength", js.undefined)
    
    @scala.inline
    def setDashPattern(value: Property): Self = this.set("dashPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashPattern: Self = this.set("dashPattern", js.undefined)
    
    @scala.inline
    def setGapColor(value: typings.cesium.mod.Color): Self = this.set("gapColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapColor: Self = this.set("gapColor", js.undefined)
  }
}
