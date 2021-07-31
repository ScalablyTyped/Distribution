package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSizeConstraintSetResponse extends StObject {
  
  /**
    * Information about the SizeConstraintSet that you specified in the GetSizeConstraintSet request. For more information, see the following topics:    SizeConstraintSet: Contains SizeConstraintSetId, SizeConstraints, and Name     SizeConstraints: Contains an array of SizeConstraint objects. Each SizeConstraint object contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var SizeConstraintSet: js.UndefOr[typings.awsSdk.wafMod.SizeConstraintSet] = js.undefined
}
object GetSizeConstraintSetResponse {
  
  @scala.inline
  def apply(): GetSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSizeConstraintSetResponse]
  }
  
  @scala.inline
  implicit class GetSizeConstraintSetResponseMutableBuilder[Self <: GetSizeConstraintSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeConstraintSet(value: SizeConstraintSet): Self = StObject.set(x, "SizeConstraintSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeConstraintSetUndefined: Self = StObject.set(x, "SizeConstraintSet", js.undefined)
  }
}
