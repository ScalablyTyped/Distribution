package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "page-methods"
//#region "state-methods"
@js.native
trait StateMethods extends StObject {
  
  /**
    * Get the last saved state of the table
    */
  def apply(): StateReturnModel = js.native
  
  /**
    * Clear the saved state of the table.
    */
  def clear(): Api = js.native
  
  /**
    * Get the table state that was loaded during initialisation.
    */
  def loaded(): StateReturnModel = js.native
  
  /**
    * Trigger a state save.
    */
  def save(): Api = js.native
}
