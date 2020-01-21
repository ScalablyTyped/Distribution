package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableAddOnResult extends js.Object {
  /**
    * An array of objects that describe the result of your request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object DisableAddOnResult {
  @scala.inline
  def apply(operations: OperationList = null): DisableAddOnResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAddOnResult]
  }
}

