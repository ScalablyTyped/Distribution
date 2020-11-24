package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////////////////
// App.Model
/////////////////////////////////////////
@js.native
trait Model extends js.Object {
  
  def apply(): Model = js.native
  def apply(props: js.Object): Model = js.native
  
  /**
    * Fires a request to the server to populate the Model based on the read URL specified
    */
  def read(): Model = js.native
  /**
    * @param params The parameters Object that will be used to populate the Model from the specified options.read URL. If the URL does not contain parameters
    */
  def read(params: js.Object): Model = js.native
  
  /**
    * Synchronizes the changes with the server by sending requests to the provided URL's
    */
  def sync(): Model = js.native
}
