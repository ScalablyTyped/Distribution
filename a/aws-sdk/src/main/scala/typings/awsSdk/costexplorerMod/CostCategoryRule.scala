package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryRule extends js.Object {
  /**
    * An Expression object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only dimensions supported are LINKED_ACCOUNT, SERVICE_CODE, RECORD_TYPE, and LINKED_ACCOUNT_NAME. Root level OR is not supported. We recommend that you create a separate rule instead.  RECORD_TYPE is a dimension used for Cost Explorer APIs, and is also supported for Cost Category expressions. This dimension uses different terms, depending on whether you're using the console or API/JSON editor. For a detailed comparison, see Term Comparisons in the AWS Billing and Cost Management User Guide.
    */
  var Rule: Expression = js.native
  var Value: CostCategoryValue = js.native
}

object CostCategoryRule {
  @scala.inline
  def apply(Rule: Expression, Value: CostCategoryValue): CostCategoryRule = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategoryRule]
  }
}

