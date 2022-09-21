package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorConfigRequest extends StObject {
  
  /**
    * The cloud provider for the target cluster to connect.
    */
  var provider: ConnectorConfigProvider
  
  /**
    * The Amazon Resource Name (ARN) of the role that is authorized to request the connector configuration.
    */
  var roleArn: String
}
object ConnectorConfigRequest {
  
  inline def apply(provider: ConnectorConfigProvider, roleArn: String): ConnectorConfigRequest = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorConfigRequest]
  }
  
  extension [Self <: ConnectorConfigRequest](x: Self) {
    
    inline def setProvider(value: ConnectorConfigProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
