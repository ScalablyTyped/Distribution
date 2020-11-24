package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonsGlobalApi extends js.Object {
  
  def apply(): ButtonsApi = js.native
  def apply(groupSelector: js.UndefOr[scala.Nothing], buttonSelector: js.Any): ButtonsApi = js.native
  def apply(groupSelector: js.Any): ButtonsApi = js.native
  def apply(groupSelector: js.Any, buttonSelector: js.Any): ButtonsApi = js.native
  
  /**
    * Obtain data from a DataTable that is suitable for exporting by saving into a file or copying to clipboard.
    */
  def exportData(): ButtonsApiExportDataReturn = js.native
  def exportData(options: ButtonsApiExportDataParameter): ButtonsApiExportDataReturn = js.native
  
  /**
    * Get meta information that is common to many different button types.
    */
  def exportInfo(): ButtonsApiExportInfoReturn = js.native
  def exportInfo(options: ButtonsApiExportInfoParameter): ButtonsApiExportInfoReturn = js.native
  
  /**
    * Display / hide an information message to the end user to indicate that something has happened.
    */
  def info(title: String): Api = js.native
  def info(title: String, message: js.UndefOr[scala.Nothing], time: Double): Api = js.native
  def info(title: String, message: String): Api = js.native
  def info(title: String, message: String, time: Double): Api = js.native
  
  /**
    * Resize the Flash movie clips to take account of the current button dimensions.
    */
  def resize(): Api = js.native
}
