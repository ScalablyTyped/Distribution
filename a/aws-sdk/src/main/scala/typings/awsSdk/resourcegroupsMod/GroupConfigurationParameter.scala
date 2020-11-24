package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfigurationParameter extends js.Object {
  
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
  implicit class GroupConfigurationParameterOps[Self <: GroupConfigurationParameter] (val x: Self) extends AnyVal {
    
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
    def setName(value: GroupConfigurationParameterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: GroupConfigurationParameterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: GroupConfigurationParameterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
