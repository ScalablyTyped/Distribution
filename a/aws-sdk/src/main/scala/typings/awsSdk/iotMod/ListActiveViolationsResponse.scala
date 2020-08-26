package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActiveViolationsResponse extends js.Object {
  /**
    * The list of active violations.
    */
  var activeViolations: js.UndefOr[ActiveViolations] = js.native
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActiveViolationsResponse {
  @scala.inline
  def apply(): ListActiveViolationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveViolationsResponse]
  }
  @scala.inline
  implicit class ListActiveViolationsResponseOps[Self <: ListActiveViolationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveViolationsVarargs(value: ActiveViolation*): Self = this.set("activeViolations", js.Array(value :_*))
    @scala.inline
    def setActiveViolations(value: ActiveViolations): Self = this.set("activeViolations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveViolations: Self = this.set("activeViolations", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

