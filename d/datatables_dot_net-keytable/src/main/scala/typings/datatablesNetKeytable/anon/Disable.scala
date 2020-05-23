package typings.datatablesNetKeytable.anon

import typings.datatablesNetKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api
}

object Disable {
  @scala.inline
  def apply(disable: () => Api, enable: () => Api): Disable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[Disable]
  }
}

