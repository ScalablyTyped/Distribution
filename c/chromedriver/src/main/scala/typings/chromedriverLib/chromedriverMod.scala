package typings
package chromedriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chromedriver", JSImport.Namespace)
@js.native
object chromedriverMod extends js.Object {
  var defaultInstance: js.UndefOr[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
  val path: java.lang.String = js.native
  val version: java.lang.String = js.native
  def start(): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def start(args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def stop(): scala.Unit = js.native
}

