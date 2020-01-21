package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedOperation extends js.Object {
  /**
    * A list of the supported operations.
    */
  var OperationName: js.UndefOr[String] = js.native
}

object SupportedOperation {
  @scala.inline
  def apply(OperationName: String = null): SupportedOperation = {
    val __obj = js.Dynamic.literal()
    if (OperationName != null) __obj.updateDynamic("OperationName")(OperationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedOperation]
  }
}

