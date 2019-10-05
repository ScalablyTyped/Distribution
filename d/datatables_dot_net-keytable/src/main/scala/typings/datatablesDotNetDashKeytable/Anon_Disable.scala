package typings.datatablesDotNetDashKeytable

import typings.datatablesDotNetDashKeytable.DataTables.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): Api
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): Api
}

object Anon_Disable {
  @scala.inline
  def apply(disable: () => Api, enable: () => Api): Anon_Disable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
  
    __obj.asInstanceOf[Anon_Disable]
  }
}

