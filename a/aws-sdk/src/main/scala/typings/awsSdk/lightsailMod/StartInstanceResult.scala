package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstanceResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object StartInstanceResult {
  @scala.inline
  def apply(operations: OperationList = null): StartInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartInstanceResult]
  }
}

