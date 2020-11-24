package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRaycastVehicleOptions extends js.Object {
  
  var chassisBody: js.UndefOr[Body] = js.native
  
  var indexLeftAxis: js.UndefOr[Double] = js.native
  
  var indexRightAxis: js.UndefOr[Double] = js.native
  
  var indexUpAxis: js.UndefOr[Double] = js.native
}
object IRaycastVehicleOptions {
  
  @scala.inline
  def apply(): IRaycastVehicleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRaycastVehicleOptions]
  }
  
  @scala.inline
  implicit class IRaycastVehicleOptionsOps[Self <: IRaycastVehicleOptions] (val x: Self) extends AnyVal {
    
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
    def setChassisBody(value: Body): Self = this.set("chassisBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChassisBody: Self = this.set("chassisBody", js.undefined)
    
    @scala.inline
    def setIndexLeftAxis(value: Double): Self = this.set("indexLeftAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexLeftAxis: Self = this.set("indexLeftAxis", js.undefined)
    
    @scala.inline
    def setIndexRightAxis(value: Double): Self = this.set("indexRightAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexRightAxis: Self = this.set("indexRightAxis", js.undefined)
    
    @scala.inline
    def setIndexUpAxis(value: Double): Self = this.set("indexUpAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexUpAxis: Self = this.set("indexUpAxis", js.undefined)
  }
}
