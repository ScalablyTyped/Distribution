package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Naclarch extends js.Object {
  var nacl_arch: js.UndefOr[java.lang.String] = js.undefined
  var sub_package_path: java.lang.String
}

object Anon_Naclarch {
  @scala.inline
  def apply(sub_package_path: java.lang.String, nacl_arch: java.lang.String = null): Anon_Naclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path)
    if (nacl_arch != null) __obj.updateDynamic("nacl_arch")(nacl_arch)
    __obj.asInstanceOf[Anon_Naclarch]
  }
}

