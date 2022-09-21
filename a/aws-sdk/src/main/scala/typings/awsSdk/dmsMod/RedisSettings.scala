package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedisSettings extends StObject {
  
  /**
    * The password provided with the auth-role and auth-token options of the AuthType setting for a Redis target endpoint.
    */
  var AuthPassword: js.UndefOr[SecretString] = js.undefined
  
  /**
    * The type of authentication to perform when connecting to a Redis target. Options include none, auth-token, and auth-role. The auth-token option requires an AuthPassword value to be provided. The auth-role option requires AuthUserName and AuthPassword values to be provided.
    */
  var AuthType: js.UndefOr[RedisAuthTypeValue] = js.undefined
  
  /**
    * The user name provided with the auth-role option of the AuthType setting for a Redis target endpoint.
    */
  var AuthUserName: js.UndefOr[String] = js.undefined
  
  /**
    * Transmission Control Protocol (TCP) port for the endpoint.
    */
  var Port: Integer
  
  /**
    * Fully qualified domain name of the endpoint.
    */
  var ServerName: String
  
  /**
    * The Amazon Resource Name (ARN) for the certificate authority (CA) that DMS uses to connect to your Redis target endpoint.
    */
  var SslCaCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The connection to a Redis target endpoint using Transport Layer Security (TLS). Valid values include plaintext and ssl-encryption. The default is ssl-encryption. The ssl-encryption option makes an encrypted connection. Optionally, you can identify an Amazon Resource Name (ARN) for an SSL certificate authority (CA) using the SslCaCertificateArn setting. If an ARN isn't given for a CA, DMS uses the Amazon root CA. The plaintext option doesn't provide Transport Layer Security (TLS) encryption for traffic between endpoint and database.
    */
  var SslSecurityProtocol: js.UndefOr[SslSecurityProtocolValue] = js.undefined
}
object RedisSettings {
  
  inline def apply(Port: Integer, ServerName: String): RedisSettings = {
    val __obj = js.Dynamic.literal(Port = Port.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedisSettings]
  }
  
  extension [Self <: RedisSettings](x: Self) {
    
    inline def setAuthPassword(value: SecretString): Self = StObject.set(x, "AuthPassword", value.asInstanceOf[js.Any])
    
    inline def setAuthPasswordUndefined: Self = StObject.set(x, "AuthPassword", js.undefined)
    
    inline def setAuthType(value: RedisAuthTypeValue): Self = StObject.set(x, "AuthType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "AuthType", js.undefined)
    
    inline def setAuthUserName(value: String): Self = StObject.set(x, "AuthUserName", value.asInstanceOf[js.Any])
    
    inline def setAuthUserNameUndefined: Self = StObject.set(x, "AuthUserName", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setSslCaCertificateArn(value: String): Self = StObject.set(x, "SslCaCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setSslCaCertificateArnUndefined: Self = StObject.set(x, "SslCaCertificateArn", js.undefined)
    
    inline def setSslSecurityProtocol(value: SslSecurityProtocolValue): Self = StObject.set(x, "SslSecurityProtocol", value.asInstanceOf[js.Any])
    
    inline def setSslSecurityProtocolUndefined: Self = StObject.set(x, "SslSecurityProtocol", js.undefined)
  }
}
