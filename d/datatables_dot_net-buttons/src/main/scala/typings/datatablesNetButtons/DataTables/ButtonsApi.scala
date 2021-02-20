package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
