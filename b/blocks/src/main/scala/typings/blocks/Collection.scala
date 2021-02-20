package typings.blocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// App.Collection
/////////////////////////////////////////
@js.native
trait Collection extends Extendable[Collection] {
  
  def apply(): Collection = js.native
  def apply(props: js.Array[js.Object]): Collection = js.native
  
  /**
    * Clear all changes made to the collection
    */
  def clearChanges(): Collection = js.native
  
  /**
    * Fires a request to the server to populate the Model based on the read URL specified
    */
  def read(): Collection = js.native
  /**
    * @param params The parameters Object that will be used to populate the Collection from the specified options.read URL. If the URL does not contain parameters
    */
  def read(params: js.Object): Collection = js.native
  
  /**
    * Performs an ajax request for all create, update and delete operations in order to sync them with a database.
    */
  def sync(): Collection = js.native
  
  def update(id: Double, newValues: js.Object): Collection = js.native
}
