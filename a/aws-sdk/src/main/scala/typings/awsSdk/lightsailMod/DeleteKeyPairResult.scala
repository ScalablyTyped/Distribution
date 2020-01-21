package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your delete key pair request.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object DeleteKeyPairResult {
  @scala.inline
  def apply(operation: Operation = null): DeleteKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyPairResult]
  }
}

