package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInstancePublicPortsResult extends js.Object {
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the time stamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object PutInstancePublicPortsResult {
  @scala.inline
  def apply(operation: Operation = null): PutInstancePublicPortsResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInstancePublicPortsResult]
  }
}

