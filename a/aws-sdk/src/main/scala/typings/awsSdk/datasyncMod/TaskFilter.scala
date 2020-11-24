package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskFilter extends js.Object {
  
  /**
    * The name of the filter being used. Each API call supports a list of filters that are available for it. For example, LocationId for ListTasks.
    */
  var Name: TaskFilterName = js.native
  
  /**
    * The operator that is used to compare filter values (for example, Equals or Contains). For more about API filtering operators, see query-resources.
    */
  var Operator: typings.awsSdk.datasyncMod.Operator = js.native
  
  /**
    * The values that you want to filter for. For example, you might want to display only tasks for a specific destination location.
    */
  var Values: FilterValues = js.native
}
object TaskFilter {
  
  @scala.inline
  def apply(Name: TaskFilterName, Operator: Operator, Values: FilterValues): TaskFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskFilter]
  }
  
  @scala.inline
  implicit class TaskFilterOps[Self <: TaskFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: TaskFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Operator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterAttributeValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: FilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
