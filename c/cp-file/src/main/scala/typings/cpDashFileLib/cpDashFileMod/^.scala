package typings
package cpDashFileLib.cpDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cp-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(source: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] with ProgressEmitter = js.native
  def default(source: java.lang.String, destination: java.lang.String, options: Options): js.Promise[scala.Unit] with ProgressEmitter = js.native
  def sync(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def sync(source: java.lang.String, destination: java.lang.String, options: Options): scala.Unit = js.native
}

