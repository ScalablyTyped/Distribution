package typings.datatablesNetKeytable

import typings.datatablesNetKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api
}

object AnonDisable {
  @scala.inline
  def apply(disable: () => Api, enable: () => Api): AnonDisable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[AnonDisable]
  }
}

