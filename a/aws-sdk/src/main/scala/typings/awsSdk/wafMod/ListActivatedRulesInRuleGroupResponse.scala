package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActivatedRulesInRuleGroupResponse extends js.Object {
  /**
    * An array of ActivatedRules objects.
    */
  var ActivatedRules: js.UndefOr[typings.awsSdk.wafMod.ActivatedRules] = js.native
  /**
    * If you have more ActivatedRules than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ActivatedRules, submit another ListActivatedRulesInRuleGroup request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
}

object ListActivatedRulesInRuleGroupResponse {
  @scala.inline
  def apply(): ListActivatedRulesInRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActivatedRulesInRuleGroupResponse]
  }
  @scala.inline
  implicit class ListActivatedRulesInRuleGroupResponseOps[Self <: ListActivatedRulesInRuleGroupResponse] (val x: Self) extends AnyVal {
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
    def setActivatedRulesVarargs(value: ActivatedRule*): Self = this.set("ActivatedRules", js.Array(value :_*))
    @scala.inline
    def setActivatedRules(value: ActivatedRules): Self = this.set("ActivatedRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivatedRules: Self = this.set("ActivatedRules", js.undefined)
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

