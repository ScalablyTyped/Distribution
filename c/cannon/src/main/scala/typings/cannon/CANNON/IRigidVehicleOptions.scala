package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRigidVehicleOptions extends js.Object {
  var chassisBody: Body
}

object IRigidVehicleOptions {
  @scala.inline
  def apply(chassisBody: Body): IRigidVehicleOptions = {
    val __obj = js.Dynamic.literal(chassisBody = chassisBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRigidVehicleOptions]
  }
}

