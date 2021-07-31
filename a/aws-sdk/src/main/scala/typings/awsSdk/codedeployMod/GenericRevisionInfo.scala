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
  
  @scala.inline
  def apply(): GenericRevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericRevisionInfo]
  }
  
  @scala.inline
  implicit class GenericRevisionInfoMutableBuilder[Self <: GenericRevisionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentGroups(value: DeploymentGroupsList): Self = StObject.set(x, "deploymentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupsUndefined: Self = StObject.set(x, "deploymentGroups", js.undefined)
    
    @scala.inline
    def setDeploymentGroupsVarargs(value: DeploymentGroupName*): Self = StObject.set(x, "deploymentGroups", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFirstUsedTime(value: Timestamp): Self = StObject.set(x, "firstUsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUsedTimeUndefined: Self = StObject.set(x, "firstUsedTime", js.undefined)
    
    @scala.inline
    def setLastUsedTime(value: Timestamp): Self = StObject.set(x, "lastUsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedTimeUndefined: Self = StObject.set(x, "lastUsedTime", js.undefined)
    
    @scala.inline
    def setRegisterTime(value: Timestamp): Self = StObject.set(x, "registerTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterTimeUndefined: Self = StObject.set(x, "registerTime", js.undefined)
  }
}
