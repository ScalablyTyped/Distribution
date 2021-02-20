package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeConstraintSetUpdate extends StObject {
  
  /**
    * Specify INSERT to add a SizeConstraintSetUpdate to a SizeConstraintSet. Use DELETE to remove a SizeConstraintSetUpdate from a SizeConstraintSet.
    */
  var Action: ChangeAction = js.native
  
  /**
    * Specifies a constraint on the size of a part of the web request. AWS WAF uses the Size, ComparisonOperator, and FieldToMatch to build an expression in the form of "Size ComparisonOperator size in bytes of FieldToMatch". If that expression is true, the SizeConstraint is considered to match.
    */
  var SizeConstraint: typings.awsSdk.wafMod.SizeConstraint = js.native
}
object SizeConstraintSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, SizeConstraint: SizeConstraint): SizeConstraintSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], SizeConstraint = SizeConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSetUpdate]
  }
  
  @scala.inline
  implicit class SizeConstraintSetUpdateMutableBuilder[Self <: SizeConstraintSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraint(value: SizeConstraint): Self = StObject.set(x, "SizeConstraint", value.asInstanceOf[js.Any])
  }
}
