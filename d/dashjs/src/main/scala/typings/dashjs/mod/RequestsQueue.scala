package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "RequestsQueue")
@js.native
open class RequestsQueue () extends StObject {
  
  /**
    * Array of the the requests that have completed
    */
  var executedRequests: js.Array[Any] = js.native
  
  /**
    * Array of all of the requests that have begun to load.
    * This request may not make it into the executed queue if it is abandon due to ABR rules for example.
    */
  var loadingRequests: js.Array[Any] = js.native
}
