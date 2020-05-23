package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Naclarch extends js.Object {
  var nacl_arch: js.UndefOr[String] = js.undefined
  var sub_package_path: String
}

object Naclarch {
  @scala.inline
  def apply(sub_package_path: String, nacl_arch: String = null): Naclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path.asInstanceOf[js.Any])
    if (nacl_arch != null) __obj.updateDynamic("nacl_arch")(nacl_arch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Naclarch]
  }
}

