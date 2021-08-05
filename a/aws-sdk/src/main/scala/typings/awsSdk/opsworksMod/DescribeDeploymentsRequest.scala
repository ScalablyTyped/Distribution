package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeploymentsRequest extends StObject {
  
  /**
    * The app ID. If you include this parameter, the command returns a description of the commands associated with the specified app.
    */
  var AppId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of deployment IDs to be described. If you include this parameter, the command returns a description of the specified deployments. Otherwise, it returns a description of every deployment.
    */
  var DeploymentIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The stack ID. If you include this parameter, the command returns a description of the commands associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeDeploymentsRequest {
  
  inline def apply(): DescribeDeploymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsRequest]
  }
  
  extension [Self <: DescribeDeploymentsRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setDeploymentIds(value: Strings): Self = StObject.set(x, "DeploymentIds", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdsUndefined: Self = StObject.set(x, "DeploymentIds", js.undefined)
    
    inline def setDeploymentIdsVarargs(value: String*): Self = StObject.set(x, "DeploymentIds", js.Array(value :_*))
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
