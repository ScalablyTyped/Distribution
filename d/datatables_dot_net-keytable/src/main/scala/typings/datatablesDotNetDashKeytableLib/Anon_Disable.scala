package typings
package datatablesDotNetDashKeytableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disable extends js.Object {
  /*
    * Disable KeyTable's interactions (mouse and keyboard)
    */
  def disable(): datatablesDotNetDashKeytableLib.DataTablesNs.Api
  /*
    * Enable or disable KeyTable's interactions (mouse and keyboard)
    */
  def enable(): datatablesDotNetDashKeytableLib.DataTablesNs.Api
}

object Anon_Disable {
  @scala.inline
  def apply(
    disable: () => datatablesDotNetDashKeytableLib.DataTablesNs.Api,
    enable: () => datatablesDotNetDashKeytableLib.DataTablesNs.Api
  ): Anon_Disable = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
  
    __obj.asInstanceOf[Anon_Disable]
  }
}

