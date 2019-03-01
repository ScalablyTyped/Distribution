package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResult extends js.Object {
  var XHR: stdLib.XMLHttpRequest
  var entities: js.Array[Entity]
  var keyMappings: js.Array[KeyMapping]
}

object SaveResult {
  @scala.inline
  def apply(XHR: stdLib.XMLHttpRequest, entities: js.Array[Entity], keyMappings: js.Array[KeyMapping]): SaveResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("XHR")(XHR)
    __obj.updateDynamic("entities")(entities)
    __obj.updateDynamic("keyMappings")(keyMappings)
    __obj.asInstanceOf[SaveResult]
  }
}

