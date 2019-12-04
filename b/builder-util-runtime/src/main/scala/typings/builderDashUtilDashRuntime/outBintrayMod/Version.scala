package typings.builderDashUtilDashRuntime.outBintrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  val name: String
  val `package`: String
}

object Version {
  @scala.inline
  def apply(name: String, `package`: String): Version = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

