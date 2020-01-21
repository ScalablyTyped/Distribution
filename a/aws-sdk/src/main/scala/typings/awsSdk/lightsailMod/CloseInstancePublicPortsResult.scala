package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseInstancePublicPortsResult extends js.Object {
  /**
    * An array of key-value pairs that contains information about the operation.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object CloseInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): CloseInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseInstancePublicPortsResult]
  }
}

