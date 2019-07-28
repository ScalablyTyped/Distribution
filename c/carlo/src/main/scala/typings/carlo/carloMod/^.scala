package typings.carlo.carloMod

import typings.carlo.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carlo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def enterTestMode(): Unit = js.native
  def fileInfo(file: js.Any): js.Promise[Anon_Path] = js.native
  def launch(): js.Promise[App] = js.native
  def launch(options: LaunchOptions): js.Promise[App] = js.native
  def loadParams(): js.Promise[js.Array[_]] = js.native
}

