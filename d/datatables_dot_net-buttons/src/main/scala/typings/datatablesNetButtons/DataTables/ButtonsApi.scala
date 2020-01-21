package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApi extends ButtonApi {
  /**
    * Get a jQuery instance that contains a reference to the button container instance.
    */
  def container(): JQuery = js.native
  def containers(): JQuery = js.native
  /**
    * Destroy the selected button instances, removing the container and all button elements from the document.
    */
  def destroy(): Api = js.native
}

