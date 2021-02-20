package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfigurationParameter extends StObject {
  
  /**
    * The name of the group configuration parameter. You can specify the following string values:   For configuration item type AWS::ResourceGroups::Generic:    allowed-resource-types  Specifies the types of resources that you can add to this group by using the GroupResources operation.     For configuration item type AWS::EC2::CapacityReservationPool:   None - This configuration item type doesn't support any parameters.   For more information about EC2 capacity reservation groups, see Working with capacity reservation groups in the EC2 Users Guide.  
    */
  var Name: GroupConfigurationParameterName = js.native
  
  /**
    * The values of for this parameter. You can specify the following string value:   For item type allowed-resource-types: the only supported parameter value is AWS::EC2::CapacityReservation.  
    */
  var Values: js.UndefOr[GroupConfigurationParameterValueList] = js.native
}
object GroupConfigurationParameter {
  
  @scala.inline
  def apply(Name: GroupConfigurationParameterName): GroupConfigurationParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConfigurationParameter]
  }
  
  @scala.inline
  implicit class GroupConfigurationParameterMutableBuilder[Self <: GroupConfigurationParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: GroupConfigurationParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: GroupConfigurationParameterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: GroupConfigurationParameterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
