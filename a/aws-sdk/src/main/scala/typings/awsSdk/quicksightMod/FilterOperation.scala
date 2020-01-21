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
}

