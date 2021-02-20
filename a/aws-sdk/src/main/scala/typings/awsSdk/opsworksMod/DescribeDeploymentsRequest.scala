package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeploymentsRequest extends StObject {
  
  /**
    * The app ID. If you include this parameter, the command returns a description of the commands associated with the specified app.
    */
  var AppId: js.UndefOr[String] = js.native
  
  /**
    * An array of deployment IDs to be described. If you include this parameter, the command returns a description of the specified deployments. Otherwise, it returns a description of every deployment.
    */
  var DeploymentIds: js.UndefOr[Strings] = js.native
  
  /**
    * The stack ID. If you include this parameter, the command returns a description of the commands associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}
object DescribeDeploymentsRequest {
  
  @scala.inline
  def apply(): DescribeDeploymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsRequest]
  }
  
  @scala.inline
  implicit class DescribeDeploymentsRequestMutableBuilder[Self <: DescribeDeploymentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    @scala.inline
    def setDeploymentIds(value: Strings): Self = StObject.set(x, "DeploymentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdsUndefined: Self = StObject.set(x, "DeploymentIds", js.undefined)
    
    @scala.inline
    def setDeploymentIdsVarargs(value: String*): Self = StObject.set(x, "DeploymentIds", js.Array(value :_*))
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
