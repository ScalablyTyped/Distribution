package typings.deta.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deta", "Deta")
@js.native
object Deta extends js.Object {
  def apply(projectKey: String): DetaInstance = js.native
  def apply(projectKey: String, host: String): DetaInstance = js.native
}

