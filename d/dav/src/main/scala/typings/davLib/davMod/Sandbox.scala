package typings
package davLib.davMod

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
  def abort(): scala.Unit = js.native
  def add(request: js.Any): scala.Unit = js.native
}

