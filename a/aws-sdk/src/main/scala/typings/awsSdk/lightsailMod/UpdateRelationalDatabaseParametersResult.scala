package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRelationalDatabaseParametersResult extends js.Object {
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the time stamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object UpdateRelationalDatabaseParametersResult {
  @scala.inline
  def apply(operations: OperationList = null): UpdateRelationalDatabaseParametersResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelationalDatabaseParametersResult]
  }
}

