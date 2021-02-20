package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowFilter extends StObject {
  
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
  implicit class MaintenanceWindowFilterMutableBuilder[Self <: MaintenanceWindowFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: MaintenanceWindowFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValues(value: MaintenanceWindowFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: MaintenanceWindowFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
