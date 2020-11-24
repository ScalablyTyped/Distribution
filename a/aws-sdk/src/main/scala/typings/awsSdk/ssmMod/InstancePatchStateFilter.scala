package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancePatchStateFilter extends js.Object {
  
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
  implicit class InstancePatchStateFilterOps[Self <: InstancePatchStateFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: InstancePatchStateFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InstancePatchStateOperatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: InstancePatchStateFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: InstancePatchStateFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
  }
}
