package typings.carlo.carloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carlo", "launch")
@js.native
object launch extends js.Object {
  def apply(): js.Promise[App] = js.native
  def apply(options: LaunchOptions): js.Promise[App] = js.native
}

