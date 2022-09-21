package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthenticationConfiguration extends StObject {
  
  /**
    * Your secret ARN, which you can create in Secrets Manager  You use a secret if basic authentication credentials are required to connect to a website. The secret stores your credentials of user name and password.
    */
  var Credentials: SecretArn
  
  /**
    * The name of the website host you want to connect to using authentication credentials. For example, the host name of https://a.example.com/page1.html is "a.example.com".
    */
  var Host: typings.awsSdk.kendraMod.Host
  
  /**
    * The port number of the website host you want to connect to using authentication credentials. For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
    */
  var Port: typings.awsSdk.kendraMod.Port
}
object BasicAuthenticationConfiguration {
  
  inline def apply(Credentials: SecretArn, Host: Host, Port: Port): BasicAuthenticationConfiguration = {
    val __obj = js.Dynamic.literal(Credentials = Credentials.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthenticationConfiguration]
  }
  
  extension [Self <: BasicAuthenticationConfiguration](x: Self) {
    
    inline def setCredentials(value: SecretArn): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
