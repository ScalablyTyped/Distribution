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
  def apply(): TestCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCustomDataIdentifierResponse]
  }
  @scala.inline
  implicit class TestCustomDataIdentifierResponseOps[Self <: TestCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatchCount(value: integer): Self = this.set("matchCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCount: Self = this.set("matchCount", js.undefined)
  }
  
}

