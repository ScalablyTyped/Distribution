package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterCondition extends StObject {
  
  /**
    * The comparison operator used in the filter condition.
    */
  var ComparisonOperator: js.UndefOr[typings.awsSdk.lakeformationMod.ComparisonOperator] = js.native
  
  /**
    * The field to filter in the filter condition.
    */
  var Field: js.UndefOr[FieldNameString] = js.native
  
  /**
    * A string with values used in evaluating the filter condition.
    */
  var StringValueList: js.UndefOr[typings.awsSdk.lakeformationMod.StringValueList] = js.native
}
object FilterCondition {
  
  @scala.inline
  def apply(): FilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCondition]
  }
  
  @scala.inline
  implicit class FilterConditionMutableBuilder[Self <: FilterCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    @scala.inline
    def setField(value: FieldNameString): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    @scala.inline
    def setStringValueList(value: StringValueList): Self = StObject.set(x, "StringValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueListUndefined: Self = StObject.set(x, "StringValueList", js.undefined)
    
    @scala.inline
    def setStringValueListVarargs(value: StringValue*): Self = StObject.set(x, "StringValueList", js.Array(value :_*))
  }
}
