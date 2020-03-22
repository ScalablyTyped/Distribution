package typings.cfenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cfenv", "getAppEnv")
@js.native
object getAppEnv extends js.Object {
  def apply(): AppEnv = js.native
  def apply(options: GetAppEnvOptions): AppEnv = js.native
}

