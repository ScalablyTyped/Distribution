package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object ReleaseStaticIpResult {
  @scala.inline
  def apply(operations: OperationList = null): ReleaseStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseStaticIpResult]
  }
}

