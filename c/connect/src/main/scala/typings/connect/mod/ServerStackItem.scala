package typings.connect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerStackItem extends js.Object {
  var handle: ServerHandle
  var route: String
}

object ServerStackItem {
  @scala.inline
  def apply(handle: ServerHandle, route: String): ServerStackItem = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServerStackItem]
  }
}

