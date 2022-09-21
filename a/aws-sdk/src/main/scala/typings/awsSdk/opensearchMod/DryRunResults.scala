package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRunResults extends StObject {
  
  /**
    *  Specifies the way in which Amazon OpenSearch Service applies the update. Possible responses are Blue/Green (the update requires a blue/green deployment), DynamicUpdate (no blue/green required), Undetermined (the domain is undergoing an update and can't predict the deployment type; try again after the update is complete), and None (the request doesn't include any configuration changes). 
    */
  var DeploymentType: js.UndefOr[typings.awsSdk.opensearchMod.DeploymentType] = js.undefined
  
  /**
    * Contains an optional message associated with the DryRunResults.
    */
  var Message: js.UndefOr[typings.awsSdk.opensearchMod.Message] = js.undefined
}
object DryRunResults {
  
  inline def apply(): DryRunResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DryRunResults]
  }
  
  extension [Self <: DryRunResults](x: Self) {
    
    inline def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
