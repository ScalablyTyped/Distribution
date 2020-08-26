package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRigidVehicleOptions extends js.Object {
  var chassisBody: Body = js.native
}

object IRigidVehicleOptions {
  @scala.inline
  def apply(chassisBody: Body): IRigidVehicleOptions = {
    val __obj = js.Dynamic.literal(chassisBody = chassisBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRigidVehicleOptions]
  }
  @scala.inline
  implicit class IRigidVehicleOptionsOps[Self <: IRigidVehicleOptions] (val x: Self) extends AnyVal {
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
  }
  
}

