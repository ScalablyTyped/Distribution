package typings.chromeLauncher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chrome-launcher/dist/chrome-finder", JSImport.Namespace)
@js.native
object chromeFinderMod extends js.Object {
  def darwin(): js.Array[String] = js.native
  def darwinFast(): js.UndefOr[String] = js.native
  def linux(): js.Array[String] = js.native
  def win32(): js.Array[String] = js.native
  def wsl(): js.Array[String] = js.native
}

