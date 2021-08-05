package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenericRevisionInfo extends StObject {
  
  /**
    * The deployment groups for which this is the current target revision.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined
  
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * When the revision was first used by AWS CodeDeploy.
    */
  var firstUsedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * When the revision was last used by AWS CodeDeploy.
    */
  var lastUsedTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * When the revision was registered with AWS CodeDeploy.
    */
  var registerTime: js.UndefOr[Timestamp] = js.undefined
}
object GenericRevisionInfo {
  
  inline def apply(): GenericRevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericRevisionInfo]
  }
  
  extension [Self <: GenericRevisionInfo](x: Self) {
    
    inline def setDeploymentGroups(value: DeploymentGroupsList): Self = StObject.set(x, "deploymentGroups", value.asInstanceOf[js.Any])
    
    inline def setDeploymentGroupsUndefined: Self = StObject.set(x, "deploymentGroups", js.undefined)
    
    inline def setDeploymentGroupsVarargs(value: DeploymentGroupName*): Self = StObject.set(x, "deploymentGroups", js.Array(value :_*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFirstUsedTime(value: Timestamp): Self = StObject.set(x, "firstUsedTime", value.asInstanceOf[js.Any])
    
    inline def setFirstUsedTimeUndefined: Self = StObject.set(x, "firstUsedTime", js.undefined)
    
    inline def setLastUsedTime(value: Timestamp): Self = StObject.set(x, "lastUsedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUsedTimeUndefined: Self = StObject.set(x, "lastUsedTime", js.undefined)
    
    inline def setRegisterTime(value: Timestamp): Self = StObject.set(x, "registerTime", value.asInstanceOf[js.Any])
    
    inline def setRegisterTimeUndefined: Self = StObject.set(x, "registerTime", js.undefined)
  }
}
