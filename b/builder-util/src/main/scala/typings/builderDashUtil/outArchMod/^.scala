package typings.builderDashUtil.outArchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/arch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def archFromString(name: String): Arch = js.native
  def getArchCliNames(): js.Array[String] = js.native
  def getArchSuffix(arch: Arch): String = js.native
  def toLinuxArchString(arch: Arch): String = js.native
  def toLinuxArchString(arch: Arch, isSnap: Boolean): String = js.native
}

