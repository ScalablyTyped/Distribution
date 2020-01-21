package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainEntryResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the operation.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object CreateDomainEntryResult {
  @scala.inline
  def apply(operation: Operation = null): CreateDomainEntryResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainEntryResult]
  }
}

