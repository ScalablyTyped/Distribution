package typings.debessmann.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("debessmann", "DM")
@js.native
class DM () extends js.Object {
  def init(endpoint: String, authkey: String): Unit = js.native
  def send(data: Event): Unit = js.native
}

