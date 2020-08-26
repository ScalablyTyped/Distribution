package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialMatch extends js.Object {
  /**
    * The reference rule from the master security group of the AWS Firewall Manager policy.
    */
  var Reference: js.UndefOr[ReferenceRule] = js.native
  /**
    * The violation reason.
    */
  var TargetViolationReasons: js.UndefOr[typings.awsSdk.fmsMod.TargetViolationReasons] = js.native
}

object PartialMatch {
  @scala.inline
  def apply(): PartialMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatch]
  }
  @scala.inline
  implicit class PartialMatchOps[Self <: PartialMatch] (val x: Self) extends AnyVal {
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
    def setReference(value: ReferenceRule): Self = this.set("Reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("Reference", js.undefined)
    @scala.inline
    def setTargetViolationReasonsVarargs(value: TargetViolationReason*): Self = this.set("TargetViolationReasons", js.Array(value :_*))
    @scala.inline
    def setTargetViolationReasons(value: TargetViolationReasons): Self = this.set("TargetViolationReasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetViolationReasons: Self = this.set("TargetViolationReasons", js.undefined)
  }
  
}

