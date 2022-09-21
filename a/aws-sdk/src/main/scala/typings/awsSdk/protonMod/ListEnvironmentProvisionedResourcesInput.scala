package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentProvisionedResourcesInput extends StObject {
  
  /**
    * The environment name.
    */
  var environmentName: ResourceName
  
  /**
    * A token that indicates the location of the next environment provisioned resource in the array of environment provisioned resources, after the list of environment provisioned resources that was previously requested.
    */
  var nextToken: js.UndefOr[EmptyNextToken] = js.undefined
}
object ListEnvironmentProvisionedResourcesInput {
  
  inline def apply(environmentName: ResourceName): ListEnvironmentProvisionedResourcesInput = {
    val __obj = js.Dynamic.literal(environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentProvisionedResourcesInput]
  }
  
  extension [Self <: ListEnvironmentProvisionedResourcesInput](x: Self) {
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: EmptyNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
