package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComplianceStringFilter extends js.Object {
  
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[ComplianceStringFilterKey] = js.native
  
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or GreaterThan.
    */
  var Type: js.UndefOr[ComplianceQueryOperatorType] = js.native
  
  /**
    * The value for which to search.
    */
  var Values: js.UndefOr[ComplianceStringFilterValueList] = js.native
}
object ComplianceStringFilter {
  
  @scala.inline
  def apply(): ComplianceStringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceStringFilter]
  }
  
  @scala.inline
  implicit class ComplianceStringFilterOps[Self <: ComplianceStringFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: ComplianceStringFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setType(value: ComplianceQueryOperatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ComplianceFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ComplianceStringFilterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
