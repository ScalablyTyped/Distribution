package typings.builderUtilRuntime.bintrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  @JSName("package")
  val _package: String
  val name: String
}

object Version {
  @scala.inline
  def apply(_package: String, name: String): Version = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

