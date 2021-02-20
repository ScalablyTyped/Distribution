package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploySystemInstanceResponse extends StObject {
  
  /**
    * The ID of the Greengrass deployment used to deploy the system instance.
    */
  var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.native
  
  /**
    * An object that contains summary information about a system instance that was deployed. 
    */
  var summary: SystemInstanceSummary = js.native
}
object DeploySystemInstanceResponse {
  
  @scala.inline
  def apply(summary: SystemInstanceSummary): DeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploySystemInstanceResponse]
  }
  
  @scala.inline
  implicit class DeploySystemInstanceResponseMutableBuilder[Self <: DeploySystemInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGreengrassDeploymentId(value: GreengrassDeploymentId): Self = StObject.set(x, "greengrassDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassDeploymentIdUndefined: Self = StObject.set(x, "greengrassDeploymentId", js.undefined)
    
    @scala.inline
    def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
