package typings.breeze.breezeNs

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
    val __obj = js.Dynamic.literal(XHR = XHR, entities = entities, keyMappings = keyMappings)
  
    __obj.asInstanceOf[SaveResult]
  }
}

