package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowFilter extends js.Object {
  
  /**
    * The name of the filter.
    */
  var Key: js.UndefOr[MaintenanceWindowFilterKey] = js.native
  
  /**
    * The filter values.
    */
  var Values: js.UndefOr[MaintenanceWindowFilterValues] = js.native
}
object MaintenanceWindowFilter {
  
  @scala.inline
  def apply(): MaintenanceWindowFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowFilter]
  }
  
  @scala.inline
  implicit class MaintenanceWindowFilterOps[Self <: MaintenanceWindowFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: MaintenanceWindowFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: MaintenanceWindowFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: MaintenanceWindowFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
