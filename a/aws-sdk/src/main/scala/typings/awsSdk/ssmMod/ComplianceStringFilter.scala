package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceStringFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[ComplianceStringFilterKey] = js.native
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or GreaterThan.
    */
  var Type: js.UndefOr[ComplianceQueryOperatorType] = js.native
  /**
    * The value for which to search.
    */
  var Values: js.UndefOr[ComplianceStringFilterValueList] = js.native
}

object ComplianceStringFilter {
  @scala.inline
  def apply(
    Key: ComplianceStringFilterKey = null,
    Type: ComplianceQueryOperatorType = null,
    Values: ComplianceStringFilterValueList = null
  ): ComplianceStringFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceStringFilter]
  }
}

