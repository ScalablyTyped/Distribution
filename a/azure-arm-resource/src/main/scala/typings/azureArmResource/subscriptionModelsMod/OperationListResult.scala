package typings.azureArmResource.subscriptionModelsMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationListResult extends Array[Operation] {
  
  /**
    * URL to get the next set of operation list results if there are any.
    */
  var nextLink: js.UndefOr[String] = js.native
}
