package typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod

import typings.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleRecord extends js.Object {
  /**
    * <p>When the rule was created.</p>
    */
  var CreatedAt: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>When the rule was last modified.</p>
    */
  var ModifiedAt: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>The sampling rule.</p>
    */
  var SamplingRule: js.UndefOr[typings.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule] = js.native
}

object SamplingRuleRecord {
  @scala.inline
  def apply(): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleRecord]
  }
  @scala.inline
  implicit class SamplingRuleRecordOps[Self <: SamplingRuleRecord] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Date | String | Double): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setModifiedAt(value: Date | String | Double): Self = this.set("ModifiedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedAt: Self = this.set("ModifiedAt", js.undefined)
    @scala.inline
    def setSamplingRule(value: SamplingRule): Self = this.set("SamplingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRule: Self = this.set("SamplingRule", js.undefined)
  }
  
}

