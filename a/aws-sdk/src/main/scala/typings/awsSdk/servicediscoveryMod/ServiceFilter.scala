package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceFilter extends js.Object {
  
  /**
    * The operator that you want to use to determine whether a service is returned by ListServices. Valid values for Condition include the following:    EQ: When you specify EQ, specify one namespace ID for Values. EQ is the default condition and can be omitted.    IN: When you specify IN, specify a list of the IDs for the namespaces that you want ListServices to return a list of services for.    BETWEEN: Not applicable.  
    */
  var Condition: js.UndefOr[FilterCondition] = js.native
  
  /**
    * Specify NAMESPACE_ID.
    */
  var Name: ServiceFilterName = js.native
  
  /**
    * The values that are applicable to the value that you specify for Condition to filter the list of services.
    */
  var Values: FilterValues = js.native
}
object ServiceFilter {
  
  @scala.inline
  def apply(Name: ServiceFilterName, Values: FilterValues): ServiceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFilter]
  }
  
  @scala.inline
  implicit class ServiceFilterOps[Self <: ServiceFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: ServiceFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: FilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: FilterCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
  }
}
