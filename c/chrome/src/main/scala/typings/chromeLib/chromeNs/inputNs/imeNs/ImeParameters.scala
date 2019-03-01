package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImeParameters extends js.Object {
  /** ID of the engine to use */
  var engineID: java.lang.String
  /** MenuItems to use. */
  var items: js.Array[MenuItem]
}

object ImeParameters {
  @scala.inline
  def apply(engineID: java.lang.String, items: js.Array[MenuItem]): ImeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("engineID")(engineID)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ImeParameters]
  }
}

