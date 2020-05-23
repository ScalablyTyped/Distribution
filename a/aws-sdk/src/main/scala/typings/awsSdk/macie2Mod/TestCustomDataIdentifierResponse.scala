package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCustomDataIdentifierResponse extends js.Object {
  /**
    * The number of instances of sample text that matched the detection criteria specified in the custom data identifier.
    */
  var matchCount: js.UndefOr[integer] = js.native
}

object TestCustomDataIdentifierResponse {
  @scala.inline
  def apply(matchCount: js.UndefOr[integer] = js.undefined): TestCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchCount)) __obj.updateDynamic("matchCount")(matchCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCustomDataIdentifierResponse]
  }
}

