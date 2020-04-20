package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryRule extends js.Object {
  /**
    * An Expression object used to categorize costs. This supports dimensions, Tags, and nested expressions. Currently the only dimensions supported is LINKED_ACCOUNT. Root level OR is not supported. We recommend you create a separate rule instead.
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

