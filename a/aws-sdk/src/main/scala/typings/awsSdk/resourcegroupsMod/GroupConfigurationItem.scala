package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupConfigurationItem extends StObject {
  
  /**
    * A collection of parameters for this group configuration item.
    */
  var Parameters: js.UndefOr[GroupParameterList] = js.undefined
  
  /**
    * Specifies the type of group configuration item. Each item must have a unique value for type. You can specify the following string values:    AWS::EC2::CapacityReservationPool  For more information about EC2 capacity reservation groups, see Working with capacity reservation groups in the EC2 Users Guide.    AWS::ResourceGroups::Generic - Supports parameters that configure the behavior of resource groups of any type.  
    */
  var Type: GroupConfigurationType
}
object GroupConfigurationItem {
  
  inline def apply(Type: GroupConfigurationType): GroupConfigurationItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupConfigurationItem]
  }
  
  extension [Self <: GroupConfigurationItem](x: Self) {
    
    inline def setParameters(value: GroupParameterList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: GroupConfigurationParameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    inline def setType(value: GroupConfigurationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
