package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfigurationOptionsFilter extends js.Object {
  
  /**
    * The name of the element to filter.
    */
  var Name: js.UndefOr[NodeConfigurationOptionsFilterName] = js.native
  
  /**
    * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of values for 'in'.
    */
  var Operator: js.UndefOr[OperatorType] = js.native
  
  /**
    * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}
object NodeConfigurationOptionsFilter {
  
  @scala.inline
  def apply(): NodeConfigurationOptionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigurationOptionsFilter]
  }
  
  @scala.inline
  implicit class NodeConfigurationOptionsFilterOps[Self <: NodeConfigurationOptionsFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: NodeConfigurationOptionsFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOperator(value: OperatorType): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("Operator", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ValueStringList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
