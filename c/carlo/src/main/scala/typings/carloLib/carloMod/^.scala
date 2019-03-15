package typings
package carloLib.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carlo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def enterTestMode(): scala.Unit = js.native
  def fileInfo(file: js.Any): js.Promise[carloLib.Anon_Path] = js.native
  def launch(): js.Promise[App] = js.native
  def launch(options: LaunchOptions): js.Promise[App] = js.native
  def loadParams(): js.Promise[js.Array[_]] = js.native
}

