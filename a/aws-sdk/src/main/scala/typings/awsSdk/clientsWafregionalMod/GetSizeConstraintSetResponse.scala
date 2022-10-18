package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSizeConstraintSetResponse extends StObject {
  
  /**
    * Information about the SizeConstraintSet that you specified in the GetSizeConstraintSet request. For more information, see the following topics:    SizeConstraintSet: Contains SizeConstraintSetId, SizeConstraints, and Name     SizeConstraints: Contains an array of SizeConstraint objects. Each SizeConstraint object contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var SizeConstraintSet: js.UndefOr[typings.awsSdk.clientsWafregionalMod.SizeConstraintSet] = js.undefined
}
object GetSizeConstraintSetResponse {
  
  inline def apply(): GetSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSizeConstraintSetResponse]
  }
  
  extension [Self <: GetSizeConstraintSetResponse](x: Self) {
    
    inline def setSizeConstraintSet(value: SizeConstraintSet): Self = StObject.set(x, "SizeConstraintSet", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintSetUndefined: Self = StObject.set(x, "SizeConstraintSet", js.undefined)
  }
}
