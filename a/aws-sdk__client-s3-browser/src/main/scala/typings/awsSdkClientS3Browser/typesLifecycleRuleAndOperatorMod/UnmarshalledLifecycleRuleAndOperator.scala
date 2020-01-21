package typings.awsSdkClientS3Browser.typesLifecycleRuleAndOperatorMod

import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledLifecycleRuleAndOperator extends LifecycleRuleAndOperator {
  /**
    * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
    */
  @JSName("Tags")
  var Tags_UnmarshalledLifecycleRuleAndOperator: js.UndefOr[js.Array[UnmarshalledTag]] = js.undefined
}

object UnmarshalledLifecycleRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[UnmarshalledTag] = null): UnmarshalledLifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledLifecycleRuleAndOperator]
  }
}

