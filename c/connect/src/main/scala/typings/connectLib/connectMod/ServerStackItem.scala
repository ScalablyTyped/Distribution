package typings
package connectLib.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStackItem extends js.Object {
  var handle: ServerHandle
  var route: java.lang.String
}

object ServerStackItem {
  @scala.inline
  def apply(handle: ServerHandle, route: java.lang.String): ServerStackItem = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], route = route)
  
    __obj.asInstanceOf[ServerStackItem]
  }
}

