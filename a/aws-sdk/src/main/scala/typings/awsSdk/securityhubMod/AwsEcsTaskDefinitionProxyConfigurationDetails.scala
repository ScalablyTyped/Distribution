package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionProxyConfigurationDetails extends StObject {
  
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var ContainerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin, specified as key-value pairs.
    */
  var ProxyConfigurationProperties: js.UndefOr[AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesList] = js.undefined
  
  /**
    * The proxy type.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionProxyConfigurationDetails {
  
  inline def apply(): AwsEcsTaskDefinitionProxyConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionProxyConfigurationDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionProxyConfigurationDetails](x: Self) {
    
    inline def setContainerName(value: NonEmptyString): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameUndefined: Self = StObject.set(x, "ContainerName", js.undefined)
    
    inline def setProxyConfigurationProperties(value: AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesList): Self = StObject.set(x, "ProxyConfigurationProperties", value.asInstanceOf[js.Any])
    
    inline def setProxyConfigurationPropertiesUndefined: Self = StObject.set(x, "ProxyConfigurationProperties", js.undefined)
    
    inline def setProxyConfigurationPropertiesVarargs(value: AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails*): Self = StObject.set(x, "ProxyConfigurationProperties", js.Array(value*))
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
