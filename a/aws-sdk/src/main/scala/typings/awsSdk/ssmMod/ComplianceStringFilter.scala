package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceStringFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[ComplianceStringFilterKey] = js.undefined
  
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or GreaterThan.
    */
  var Type: js.UndefOr[ComplianceQueryOperatorType] = js.undefined
  
  /**
    * The value for which to search.
    */
  var Values: js.UndefOr[ComplianceStringFilterValueList] = js.undefined
}
object ComplianceStringFilter {
  
  @scala.inline
  def apply(): ComplianceStringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceStringFilter]
  }
  
  @scala.inline
  implicit class ComplianceStringFilterMutableBuilder[Self <: ComplianceStringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ComplianceStringFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setType(value: ComplianceQueryOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValues(value: ComplianceStringFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: ComplianceFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
