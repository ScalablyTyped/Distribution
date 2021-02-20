package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancePatchStateFilter extends StObject {
  
  /**
    * The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.
    */
  var Key: InstancePatchStateFilterKey = js.native
  
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.
    */
  var Type: InstancePatchStateOperatorType = js.native
  
  /**
    * The value for the filter, must be an integer greater than or equal to 0.
    */
  var Values: InstancePatchStateFilterValues = js.native
}
object InstancePatchStateFilter {
  
  @scala.inline
  def apply(
    Key: InstancePatchStateFilterKey,
    Type: InstancePatchStateOperatorType,
    Values: InstancePatchStateFilterValues
  ): InstancePatchStateFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancePatchStateFilter]
  }
  
  @scala.inline
  implicit class InstancePatchStateFilterMutableBuilder[Self <: InstancePatchStateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: InstancePatchStateFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InstancePatchStateOperatorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: InstancePatchStateFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: InstancePatchStateFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
