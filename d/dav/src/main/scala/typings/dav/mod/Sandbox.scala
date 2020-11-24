package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Sandbox")
@js.native
class Sandbox () extends js.Object {
  
  /**
    * abort sandboxed requests as a group.
    */
  def abort(): Unit = js.native
  
  def add(request: js.Any): Unit = js.native
  
  var requestList: js.Array[_] = js.native
}
