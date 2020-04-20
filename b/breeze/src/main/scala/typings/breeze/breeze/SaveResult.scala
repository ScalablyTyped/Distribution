package typings.breeze.breeze

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResult extends js.Object {
  var XHR: XMLHttpRequest
  var entities: js.Array[Entity]
  var keyMappings: js.Array[KeyMapping]
}

object SaveResult {
  @scala.inline
  def apply(XHR: XMLHttpRequest, entities: js.Array[Entity], keyMappings: js.Array[KeyMapping]): SaveResult = {
    val __obj = js.Dynamic.literal(XHR = XHR.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], keyMappings = keyMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
}

