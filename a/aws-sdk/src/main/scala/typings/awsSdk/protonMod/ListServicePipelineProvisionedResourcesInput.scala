package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicePipelineProvisionedResourcesInput extends StObject {
  
  /**
    * A token that indicates the location of the next provisioned resource in the array of provisioned resources, after the list of provisioned resources that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * The name of the service whose pipeline's provisioned resources you want.
    */
  var serviceName: ResourceName
}
object ListServicePipelineProvisionedResourcesInput {
  
  inline def apply(serviceName: ResourceName): ListServicePipelineProvisionedResourcesInput = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicePipelineProvisionedResourcesInput]
  }
  
  extension [Self <: ListServicePipelineProvisionedResourcesInput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
