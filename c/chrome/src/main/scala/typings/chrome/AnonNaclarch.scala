package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNaclarch extends js.Object {
  var nacl_arch: js.UndefOr[String] = js.undefined
  var sub_package_path: String
}

object AnonNaclarch {
  @scala.inline
  def apply(sub_package_path: String, nacl_arch: String = null): AnonNaclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path.asInstanceOf[js.Any])
    if (nacl_arch != null) __obj.updateDynamic("nacl_arch")(nacl_arch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNaclarch]
  }
}

