package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterCondition extends js.Object {
  
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
  implicit class FilterConditionOps[Self <: FilterCondition] (val x: Self) extends AnyVal {
    
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
    def setComparisonOperator(value: ComparisonOperator): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonOperator: Self = this.set("ComparisonOperator", js.undefined)
    
    @scala.inline
    def setField(value: FieldNameString): Self = this.set("Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("Field", js.undefined)
    
    @scala.inline
    def setStringValueListVarargs(value: StringValue*): Self = this.set("StringValueList", js.Array(value :_*))
    
    @scala.inline
    def setStringValueList(value: StringValueList): Self = this.set("StringValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValueList: Self = this.set("StringValueList", js.undefined)
  }
}
