package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain resource you created.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object CreateDomainResult {
  @scala.inline
  def apply(operation: Operation = null): CreateDomainResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainResult]
  }
}

