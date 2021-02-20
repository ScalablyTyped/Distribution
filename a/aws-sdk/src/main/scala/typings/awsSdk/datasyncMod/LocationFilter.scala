package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationFilter extends StObject {
  
  /**
    * The name of the filter being used. Each API call supports a list of filters that are available for it (for example, LocationType for ListLocations).
    */
  var Name: LocationFilterName = js.native
  
  /**
    * The operator that is used to compare filter values (for example, Equals or Contains). For more about API filtering operators, see query-resources.
    */
  var Operator: typings.awsSdk.datasyncMod.Operator = js.native
  
  /**
    * The values that you want to filter for. For example, you might want to display only Amazon S3 locations.
    */
  var Values: FilterValues = js.native
}
object LocationFilter {
  
  @scala.inline
  def apply(Name: LocationFilterName, Operator: Operator, Values: FilterValues): LocationFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFilter]
  }
  
  @scala.inline
  implicit class LocationFilterMutableBuilder[Self <: LocationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: LocationFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: FilterAttributeValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
