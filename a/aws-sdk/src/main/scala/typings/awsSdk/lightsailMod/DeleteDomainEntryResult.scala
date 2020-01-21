package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainEntryResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your delete domain entry request.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object DeleteDomainEntryResult {
  @scala.inline
  def apply(operation: Operation = null): DeleteDomainEntryResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainEntryResult]
  }
}

