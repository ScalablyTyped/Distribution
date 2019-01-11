package typings
package cpDashFileLib.cpDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cp-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(source: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with cpDashFileLib.cpDashFileMod.cpFileNs.ProgressEmitter = js.native
  def apply(
    source: java.lang.String,
    destination: java.lang.String,
    options: cpDashFileLib.cpDashFileMod.cpFileNs.Options
  ): js.Promise[scala.Unit] with cpDashFileLib.cpDashFileMod.cpFileNs.ProgressEmitter = js.native
  def sync(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def sync(
    source: java.lang.String,
    destination: java.lang.String,
    options: cpDashFileLib.cpDashFileMod.cpFileNs.Options
  ): scala.Unit = js.native
}

