package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackDetail extends js.Object {
  /**
    * List of counters that describe the attack for the specified time period.
    */
  var AttackCounters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[typings.awsSdk.shieldMod.AttackId] = js.native
  /**
    * The array of AttackProperty objects.
    */
  var AttackProperties: js.UndefOr[typings.awsSdk.shieldMod.AttackProperties] = js.native
  /**
    * The time the attack ended, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.native
  /**
    * List of mitigation actions taken for the attack.
    */
  var Mitigations: js.UndefOr[MitigationList] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.native
  /**
    * The time the attack started, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.native
  /**
    * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
    */
  var SubResources: js.UndefOr[SubResourceSummaryList] = js.native
}

object AttackDetail {
  @scala.inline
  def apply(): AttackDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackDetail]
  }
  @scala.inline
  implicit class AttackDetailOps[Self <: AttackDetail] (val x: Self) extends AnyVal {
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
    def setAttackCountersVarargs(value: SummarizedCounter*): Self = this.set("AttackCounters", js.Array(value :_*))
    @scala.inline
    def setAttackCounters(value: SummarizedCounterList): Self = this.set("AttackCounters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttackCounters: Self = this.set("AttackCounters", js.undefined)
    @scala.inline
    def setAttackId(value: AttackId): Self = this.set("AttackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttackId: Self = this.set("AttackId", js.undefined)
    @scala.inline
    def setAttackPropertiesVarargs(value: AttackProperty*): Self = this.set("AttackProperties", js.Array(value :_*))
    @scala.inline
    def setAttackProperties(value: AttackProperties): Self = this.set("AttackProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttackProperties: Self = this.set("AttackProperties", js.undefined)
    @scala.inline
    def setEndTime(value: AttackTimestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setMitigationsVarargs(value: Mitigation*): Self = this.set("Mitigations", js.Array(value :_*))
    @scala.inline
    def setMitigations(value: MitigationList): Self = this.set("Mitigations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMitigations: Self = this.set("Mitigations", js.undefined)
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setStartTime(value: AttackTimestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setSubResourcesVarargs(value: SubResourceSummary*): Self = this.set("SubResources", js.Array(value :_*))
    @scala.inline
    def setSubResources(value: SubResourceSummaryList): Self = this.set("SubResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubResources: Self = this.set("SubResources", js.undefined)
  }
  
}

