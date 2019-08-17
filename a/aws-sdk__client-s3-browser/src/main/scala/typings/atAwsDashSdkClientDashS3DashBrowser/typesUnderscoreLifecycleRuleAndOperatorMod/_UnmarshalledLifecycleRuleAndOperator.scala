package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreLifecycleRuleAndOperatorMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreTagMod._UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledLifecycleRuleAndOperator extends _LifecycleRuleAndOperator {
  /**
    * <p>All of these tags must exist in the object's tag set in order for the rule to apply.</p>
    */
  @JSName("Tags")
  var Tags__UnmarshalledLifecycleRuleAndOperator: js.UndefOr[js.Array[_UnmarshalledTag]] = js.undefined
}

object _UnmarshalledLifecycleRuleAndOperator {
  @scala.inline
  def apply(Prefix: String = null, Tags: js.Array[_UnmarshalledTag] = null): _UnmarshalledLifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[_UnmarshalledLifecycleRuleAndOperator]
  }
}

