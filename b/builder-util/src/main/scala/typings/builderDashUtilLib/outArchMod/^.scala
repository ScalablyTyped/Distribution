package typings
package builderDashUtilLib.outArchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/arch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def archFromString(name: java.lang.String): Arch = js.native
  def getArchCliNames(): js.Array[java.lang.String] = js.native
  def getArchSuffix(arch: Arch): java.lang.String = js.native
  def toLinuxArchString(arch: Arch): java.lang.String = js.native
  def toLinuxArchString(arch: Arch, isSnap: scala.Boolean): java.lang.String = js.native
}

