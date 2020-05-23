package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomDataIdentifierResponse extends js.Object {
  /**
    * The unique identifier for the custom data identifier that was created.
    */
  var customDataIdentifierId: js.UndefOr[string] = js.native
}

object CreateCustomDataIdentifierResponse {
  @scala.inline
  def apply(customDataIdentifierId: string = null): CreateCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    if (customDataIdentifierId != null) __obj.updateDynamic("customDataIdentifierId")(customDataIdentifierId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomDataIdentifierResponse]
  }
}

