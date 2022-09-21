package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorConfigResponse extends StObject {
  
  /**
    * A unique code associated with the cluster for registration purposes.
    */
  var activationCode: js.UndefOr[String] = js.undefined
  
  /**
    * The expiration time of the connected cluster. The cluster's YAML file must be applied through the native provider.
    */
  var activationExpiry: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique ID associated with the cluster for registration purposes.
    */
  var activationId: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster's cloud service provider.
    */
  var provider: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role to communicate with services from the connected Kubernetes cluster.
    */
  var roleArn: js.UndefOr[String] = js.undefined
}
object ConnectorConfigResponse {
  
  inline def apply(): ConnectorConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorConfigResponse]
  }
  
  extension [Self <: ConnectorConfigResponse](x: Self) {
    
    inline def setActivationCode(value: String): Self = StObject.set(x, "activationCode", value.asInstanceOf[js.Any])
    
    inline def setActivationCodeUndefined: Self = StObject.set(x, "activationCode", js.undefined)
    
    inline def setActivationExpiry(value: js.Date): Self = StObject.set(x, "activationExpiry", value.asInstanceOf[js.Any])
    
    inline def setActivationExpiryUndefined: Self = StObject.set(x, "activationExpiry", js.undefined)
    
    inline def setActivationId(value: String): Self = StObject.set(x, "activationId", value.asInstanceOf[js.Any])
    
    inline def setActivationIdUndefined: Self = StObject.set(x, "activationId", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
