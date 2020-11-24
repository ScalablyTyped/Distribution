package typings.dashjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "RequestsQueue")
@js.native
class RequestsQueue () extends js.Object {
  
  /**
    * Array of the the requests that have completed
    */
  var executedRequests: js.Array[_] = js.native
  
  /**
    * Array of all of the requests that have begun to load.
    * This request may not make it into the executed queue if it is abandon due to ABR rules for example.
    */
  var loadingRequests: js.Array[_] = js.native
}
