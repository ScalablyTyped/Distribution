package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutGroupConfigurationInput extends StObject {
  
  /**
    * The new configuration to associate with the specified group. A configuration associates the resource group with an AWS service and specifies how the service can interact with the resources in the group. A configuration is an array of GroupConfigurationItem elements. For information about the syntax of a service configuration, see Service configurations for resource groups.  A resource group can contain either a Configuration or a ResourceQuery, but not both. 
    */
  var Configuration: js.UndefOr[GroupConfigurationList] = js.undefined
  
  /**
    * The name or ARN of the resource group with the configuration that you want to update.
    */
  var Group: js.UndefOr[GroupString] = js.undefined
}
object PutGroupConfigurationInput {
  
  inline def apply(): PutGroupConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutGroupConfigurationInput]
  }
  
  extension [Self <: PutGroupConfigurationInput](x: Self) {
    
    inline def setConfiguration(value: GroupConfigurationList): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setConfigurationVarargs(value: GroupConfigurationItem*): Self = StObject.set(x, "Configuration", js.Array(value*))
    
    inline def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
