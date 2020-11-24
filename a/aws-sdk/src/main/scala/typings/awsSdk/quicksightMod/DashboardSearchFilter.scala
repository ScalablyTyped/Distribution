package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardSearchFilter extends js.Object {
  
  /**
    * The name of the value that you want to use as a filter, for example, "Name": "QUICKSIGHT_USER". 
    */
  var Name: js.UndefOr[DashboardFilterAttribute] = js.native
  
  /**
    * The comparison operator that you want to use as a filter, for example, "Operator": "StringEquals".
    */
  var Operator: FilterOperator = js.native
  
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter, for example, "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1". 
    */
  var Value: js.UndefOr[String] = js.native
}
object DashboardSearchFilter {
  
  @scala.inline
  def apply(Operator: FilterOperator): DashboardSearchFilter = {
    val __obj = js.Dynamic.literal(Operator = Operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSearchFilter]
  }
  
  @scala.inline
  implicit class DashboardSearchFilterOps[Self <: DashboardSearchFilter] (val x: Self) extends AnyVal {
    
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
    def setOperator(value: FilterOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DashboardFilterAttribute): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
