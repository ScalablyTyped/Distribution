package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOperation extends js.Object {
  /**
    * An expression that must evaluate to a Boolean value. Rows for which the expression evaluates to true are kept in the dataset.
    */
  var ConditionExpression: Expression = js.native
}

object FilterOperation {
  @scala.inline
  def apply(ConditionExpression: Expression): FilterOperation = {
    val __obj = js.Dynamic.literal(ConditionExpression = ConditionExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperation]
  }
  @scala.inline
  implicit class FilterOperationOps[Self <: FilterOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConditionExpression(value: Expression): Self = this.set("ConditionExpression", value.asInstanceOf[js.Any])
  }
  
}

