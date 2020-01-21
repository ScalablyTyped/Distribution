package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterCondition extends js.Object {
  /**
    * The comparison operator used in the filter condition.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.lakeformationMod.ComparisonOperator] = js.native
  /**
    * The field to filter in the filter condition.
    */
  var Field: js.UndefOr[FieldNameString] = js.native
  /**
    * A string with values used in evaluating the filter condition.
    */
  var StringValueList: js.UndefOr[typings.awsSdk.lakeformationMod.StringValueList] = js.native
}

object FilterCondition {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperator = null,
    Field: FieldNameString = null,
    StringValueList: StringValueList = null
  ): FilterCondition = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (Field != null) __obj.updateDynamic("Field")(Field.asInstanceOf[js.Any])
    if (StringValueList != null) __obj.updateDynamic("StringValueList")(StringValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCondition]
  }
}

