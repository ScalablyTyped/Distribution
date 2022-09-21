package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceInstanceProvisionedResourcesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next provisioned resource in the array of provisioned resources, after the current requested list of provisioned resources.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
  
  /**
    * An array of provisioned resources for a service instance.
    */
  var provisionedResources: ProvisionedResourceList
}
object ListServiceInstanceProvisionedResourcesOutput {
  
  inline def apply(provisionedResources: ProvisionedResourceList): ListServiceInstanceProvisionedResourcesOutput = {
    val __obj = js.Dynamic.literal(provisionedResources = provisionedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceInstanceProvisionedResourcesOutput]
  }
  
  extension [Self <: ListServiceInstanceProvisionedResourcesOutput](x: Self) {
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProvisionedResources(value: ProvisionedResourceList): Self = StObject.set(x, "provisionedResources", value.asInstanceOf[js.Any])
    
    inline def setProvisionedResourcesVarargs(value: ProvisionedResource*): Self = StObject.set(x, "provisionedResources", js.Array(value*))
  }
}
