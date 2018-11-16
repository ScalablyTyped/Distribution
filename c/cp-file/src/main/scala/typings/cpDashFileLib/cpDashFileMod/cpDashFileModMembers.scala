package typings
package cpDashFileLib.cpDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cp-file", JSImport.Namespace)
@js.native
object cpDashFileModMembers extends js.Object {
  def apply(source: java.lang.String, destination: java.lang.String): stdLib.Promise[scala.Unit] with cpDashFileLib.cpDashFileMod.cpFileNs.ProgressEmitter = js.native
  def apply(
    source: java.lang.String,
    destination: java.lang.String,
    options: cpDashFileLib.cpDashFileMod.cpFileNs.Options
  ): stdLib.Promise[scala.Unit] with cpDashFileLib.cpDashFileMod.cpFileNs.ProgressEmitter = js.native
  def sync(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def sync(
    source: java.lang.String,
    destination: java.lang.String,
    options: cpDashFileLib.cpDashFileMod.cpFileNs.Options
  ): scala.Unit = js.native
}

