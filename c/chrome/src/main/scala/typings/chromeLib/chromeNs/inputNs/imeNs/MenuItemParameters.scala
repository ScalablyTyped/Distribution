package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemParameters extends js.Object {
  var engineId: java.lang.String
  var items: js.Array[js.Object]
}

object MenuItemParameters {
  @scala.inline
  def apply(engineId: java.lang.String, items: js.Array[js.Object]): MenuItemParameters = {
    val __obj = js.Dynamic.literal(engineId = engineId, items = items)
  
    __obj.asInstanceOf[MenuItemParameters]
  }
}

