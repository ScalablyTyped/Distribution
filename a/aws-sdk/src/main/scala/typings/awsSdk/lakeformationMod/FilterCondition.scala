package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCondition extends StObject {
  
  /**
    * The comparison operator used in the filter condition.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.lakeformationMod.ComparisonOperator] = js.undefined
  
  /**
    * The field to filter in the filter condition.
    */
  var Field: js.UndefOr[FieldNameString] = js.undefined
  
  /**
    * A string with values used in evaluating the filter condition.
    */
  var StringValueList: js.UndefOr[typings.awsSdk.lakeformationMod.StringValueList] = js.undefined
}
object FilterCondition {
  
  inline def apply(): FilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCondition]
  }
  
  extension [Self <: FilterCondition](x: Self) {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setField(value: FieldNameString): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    inline def setStringValueList(value: StringValueList): Self = StObject.set(x, "StringValueList", value.asInstanceOf[js.Any])
    
    inline def setStringValueListUndefined: Self = StObject.set(x, "StringValueList", js.undefined)
    
    inline def setStringValueListVarargs(value: StringValue*): Self = StObject.set(x, "StringValueList", js.Array(value*))
  }
}
