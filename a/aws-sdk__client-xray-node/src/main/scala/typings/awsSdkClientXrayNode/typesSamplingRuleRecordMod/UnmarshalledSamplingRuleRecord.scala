package typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod

import typings.awsSdkClientXrayNode.typesSamplingRuleMod.UnmarshalledSamplingRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSamplingRuleRecord extends SamplingRuleRecord {
  /**
    * <p>When the rule was created.</p>
    */
  @JSName("CreatedAt")
  var CreatedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[Date] = js.native
  /**
    * <p>When the rule was last modified.</p>
    */
  @JSName("ModifiedAt")
  var ModifiedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[Date] = js.native
  /**
    * <p>The sampling rule.</p>
    */
  @JSName("SamplingRule")
  var SamplingRule_UnmarshalledSamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRule] = js.native
}

object UnmarshalledSamplingRuleRecord {
  @scala.inline
  def apply(): UnmarshalledSamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSamplingRuleRecord]
  }
  @scala.inline
  implicit class UnmarshalledSamplingRuleRecordOps[Self <: UnmarshalledSamplingRuleRecord] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Date): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setModifiedAt(value: Date): Self = this.set("ModifiedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedAt: Self = this.set("ModifiedAt", js.undefined)
    @scala.inline
    def setSamplingRule(value: UnmarshalledSamplingRule): Self = this.set("SamplingRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRule: Self = this.set("SamplingRule", js.undefined)
  }
  
}

