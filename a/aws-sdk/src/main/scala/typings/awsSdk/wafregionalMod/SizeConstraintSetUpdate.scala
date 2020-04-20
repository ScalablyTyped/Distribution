package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintSetUpdate extends js.Object {
  /**
    * Specify INSERT to add a SizeConstraintSetUpdate to a SizeConstraintSet. Use DELETE to remove a SizeConstraintSetUpdate from a SizeConstraintSet.
    */
  var Action: ChangeAction = js.native
  /**
    * Specifies a constraint on the size of a part of the web request. AWS WAF uses the Size, ComparisonOperator, and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match.
    */
  var SizeConstraint: typings.awsSdk.wafregionalMod.SizeConstraint = js.native
}

object SizeConstraintSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, SizeConstraint: SizeConstraint): SizeConstraintSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], SizeConstraint = SizeConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetUpdate]
  }
}

