package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class SizeConstraintSetUpdateOps[Self <: SizeConstraintSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraint(value: SizeConstraint): Self = this.set("SizeConstraint", value.asInstanceOf[js.Any])
  }
}
