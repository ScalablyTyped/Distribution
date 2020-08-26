package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubResourceSummary extends js.Object {
  /**
    * The list of attack types and associated counters.
    */
  var AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.native
  /**
    * The counters that describe the details of the attack.
    */
  var Counters: js.UndefOr[SummarizedCounterList] = js.native
  /**
    * The unique identifier (ID) of the SubResource.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The SubResource type.
    */
  var Type: js.UndefOr[SubResourceType] = js.native
}

object SubResourceSummary {
  @scala.inline
  def apply(): SubResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubResourceSummary]
  }
  @scala.inline
  implicit class SubResourceSummaryOps[Self <: SubResourceSummary] (val x: Self) extends AnyVal {
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
    def setAttackVectorsVarargs(value: SummarizedAttackVector*): Self = this.set("AttackVectors", js.Array(value :_*))
    @scala.inline
    def setAttackVectors(value: SummarizedAttackVectorList): Self = this.set("AttackVectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttackVectors: Self = this.set("AttackVectors", js.undefined)
    @scala.inline
    def setCountersVarargs(value: SummarizedCounter*): Self = this.set("Counters", js.Array(value :_*))
    @scala.inline
    def setCounters(value: SummarizedCounterList): Self = this.set("Counters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounters: Self = this.set("Counters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setType(value: SubResourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

