package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "ajax-methods"
@js.native
trait AjaxMethods
  extends StObject
     with Api {
  
  /**
    * Reload the table data from the Ajax data source.
    *
    * @param callback Function which is executed when the data as been reloaded and the table fully redrawn.
    * @param resetPaging Reset (default action or true) or hold the current paging position (false).
    */
  def load(): Api = js.native
  def load(callback: js.Function1[/* json */ Any, Unit]): Api = js.native
  def load(callback: js.Function1[/* json */ Any, Unit], resetPaging: Boolean): Api = js.native
  def load(callback: Unit, resetPaging: Boolean): Api = js.native
}
