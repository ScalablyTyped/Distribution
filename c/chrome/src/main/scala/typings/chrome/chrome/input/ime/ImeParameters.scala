package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImeParameters extends js.Object {
  /** ID of the engine to use */
  var engineID: String
  /** MenuItems to use. */
  var items: js.Array[MenuItem]
}

object ImeParameters {
  @scala.inline
  def apply(engineID: String, items: js.Array[MenuItem]): ImeParameters = {
    val __obj = js.Dynamic.literal(engineID = engineID, items = items)
  
    __obj.asInstanceOf[ImeParameters]
  }
}

