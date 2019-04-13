package typings
package chmodrLib.chmodrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chmodr", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    path: PathLike,
    mode: java.lang.String | scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def sync(path: PathLike, mode: java.lang.String): scala.Unit = js.native
  def sync(path: PathLike, mode: scala.Double): scala.Unit = js.native
}

