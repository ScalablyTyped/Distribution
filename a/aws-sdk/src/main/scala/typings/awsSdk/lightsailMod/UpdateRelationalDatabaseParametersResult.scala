package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRelationalDatabaseParametersResult extends js.Object {
  /**
    * An object describing the result of your update relational database parameters request.
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

