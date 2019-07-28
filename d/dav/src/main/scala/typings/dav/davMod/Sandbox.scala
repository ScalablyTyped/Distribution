package typings.dav.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "Sandbox")
@js.native
class Sandbox () extends js.Object {
  var requestList: js.Array[_] = js.native
  /**
    * abort sandboxed requests as a group.
    */
  def abort(): Unit = js.native
  def add(request: js.Any): Unit = js.native
}

