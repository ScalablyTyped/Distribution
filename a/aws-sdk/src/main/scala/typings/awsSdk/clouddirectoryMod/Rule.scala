package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * The minimum and maximum parameters that are associated with the rule.
    */
  var Parameters: js.UndefOr[RuleParameterMap] = js.native
  /**
    * The type of attribute validation rule.
    */
  var Type: js.UndefOr[RuleType] = js.native
}

object Rule {
  @scala.inline
  def apply(Parameters: RuleParameterMap = null, Type: RuleType = null): Rule = {
    val __obj = js.Dynamic.literal()
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
}

