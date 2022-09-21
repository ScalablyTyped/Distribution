package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsInput extends StObject {
  
  /**
    * The name of an environment for result list filtering. Proton returns components associated with the environment or attached to service instances running in it.
    */
  var environmentName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The maximum number of components to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next component in the array of components, after the list of components that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of a service instance for result list filtering. Proton returns the component attached to the service instance, if any.
    */
  var serviceInstanceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The name of a service for result list filtering. Proton returns components attached to service instances of the service.
    */
  var serviceName: js.UndefOr[ResourceName] = js.undefined
}
object ListComponentsInput {
  
  inline def apply(): ListComponentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsInput]
  }
  
  extension [Self <: ListComponentsInput](x: Self) {
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "environmentName", js.undefined)
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceInstanceName(value: ResourceName): Self = StObject.set(x, "serviceInstanceName", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceNameUndefined: Self = StObject.set(x, "serviceInstanceName", js.undefined)
    
    inline def setServiceName(value: ResourceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
