package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyConfiguration extends StObject {
  
  /**
    * Your secret ARN, which you can create in Secrets Manager  The credentials are optional. You use a secret if web proxy credentials are required to connect to a website host. Amazon Kendra currently support basic authentication to connect to a web proxy server. The secret stores your credentials.
    */
  var Credentials: js.UndefOr[SecretArn] = js.undefined
  
  /**
    * The name of the website host you want to connect to via a web proxy server. For example, the host name of https://a.example.com/page1.html is "a.example.com".
    */
  var Host: typings.awsSdk.kendraMod.Host
  
  /**
    * The port number of the website host you want to connect to via a web proxy server.  For example, the port for https://a.example.com/page1.html is 443, the standard port for HTTPS.
    */
  var Port: typings.awsSdk.kendraMod.Port
}
object ProxyConfiguration {
  
  inline def apply(Host: Host, Port: Port): ProxyConfiguration = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfiguration]
  }
  
  extension [Self <: ProxyConfiguration](x: Self) {
    
    inline def setCredentials(value: SecretArn): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
