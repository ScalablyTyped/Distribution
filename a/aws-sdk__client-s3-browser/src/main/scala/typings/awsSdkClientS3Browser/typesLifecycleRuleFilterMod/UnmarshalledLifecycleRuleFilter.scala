package typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod

import typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod.UnmarshalledLifecycleRuleAndOperator
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledLifecycleRuleFilter extends LifecycleRuleFilter {
  /**
    * <p>This is used in a Lifecycle Rule Filter to apply a logical AND to two or more predicates. The Lifecycle Rule will apply to any object matching all of the predicates configured inside the And operator.</p>
    */
  @JSName("And")
  var And_UnmarshalledLifecycleRuleFilter: js.UndefOr[UnmarshalledLifecycleRuleAndOperator] = js.native
  /**
    * <p>This tag must exist in the object's tag set in order for the rule to apply.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledLifecycleRuleFilter: js.UndefOr[UnmarshalledTag] = js.native
}

object UnmarshalledLifecycleRuleFilter {
  @scala.inline
  def apply(): UnmarshalledLifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledLifecycleRuleFilter]
  }
  @scala.inline
  implicit class UnmarshalledLifecycleRuleFilterOps[Self <: UnmarshalledLifecycleRuleFilter] (val x: Self) extends AnyVal {
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
    def setAnd(value: UnmarshalledLifecycleRuleAndOperator): Self = this.set("And", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnd: Self = this.set("And", js.undefined)
    @scala.inline
    def setTag(value: UnmarshalledTag): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

