package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Naclarch extends js.Object {
  var nacl_arch: js.UndefOr[String] = js.undefined
  var sub_package_path: String
}

object Anon_Naclarch {
  @scala.inline
  def apply(sub_package_path: String, nacl_arch: String = null): Anon_Naclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path)
    if (nacl_arch != null) __obj.updateDynamic("nacl_arch")(nacl_arch)
    __obj.asInstanceOf[Anon_Naclarch]
  }
}

