package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfigurationItem extends js.Object {
  
  /**
    * A collection of parameters for this group configuration item.
    */
  var Parameters: js.UndefOr[GroupParameterList] = js.native
  
  /**
    * Specifies the type of group configuration item. Each item must have a unique value for type. You can specify the following string values:    AWS::EC2::CapacityReservationPool  For more information about EC2 capacity reservation groups, see Working with capacity reservation groups in the EC2 Users Guide.    AWS::ResourceGroups::Generic - Supports parameters that configure the behavior of resource groups of any type.  
    */
  var Type: GroupConfigurationType = js.native
}
object GroupConfigurationItem {
  
  @scala.inline
  def apply(Type: GroupConfigurationType): GroupConfigurationItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConfigurationItem]
  }
  
  @scala.inline
  implicit class GroupConfigurationItemOps[Self <: GroupConfigurationItem] (val x: Self) extends AnyVal {
    
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
    def setType(value: GroupConfigurationType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: GroupConfigurationParameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: GroupParameterList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
