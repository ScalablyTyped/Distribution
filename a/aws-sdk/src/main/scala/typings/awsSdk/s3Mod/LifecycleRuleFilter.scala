package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRuleFilter extends js.Object {
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.native
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsSdk.s3Mod.Prefix] = js.native
  /**
    * This tag must exist in the object's tag set in order for the rule to apply.
    */
  var Tag: js.UndefOr[typings.awsSdk.s3Mod.Tag] = js.native
}

object LifecycleRuleFilter {
  @scala.inline
  def apply(): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
  @scala.inline
  implicit class LifecycleRuleFilterOps[Self <: LifecycleRuleFilter] (val x: Self) extends AnyVal {
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
    def setAnd(value: LifecycleRuleAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    @scala.inline
    def setPrefix(value: Prefix): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setTag(value: Tag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

