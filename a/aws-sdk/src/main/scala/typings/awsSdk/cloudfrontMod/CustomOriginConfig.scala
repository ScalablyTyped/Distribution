package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOriginConfig extends StObject {
  
  /**
    * The HTTP port that CloudFront uses to connect to the origin. Specify the HTTP port that the origin listens on.
    */
  var HTTPPort: integer
  
  /**
    * The HTTPS port that CloudFront uses to connect to the origin. Specify the HTTPS port that the origin listens on.
    */
  var HTTPSPort: integer
  
  /**
    * Specifies how long, in seconds, CloudFront persists its connection to the origin. The minimum timeout is 1 second, the maximum is 60 seconds, and the default (if you don’t specify otherwise) is 5 seconds. For more information, see Origin Keep-alive Timeout in the Amazon CloudFront Developer Guide.
    */
  var OriginKeepaliveTimeout: js.UndefOr[integer] = js.undefined
  
  /**
    * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin. Valid values are:    http-only – CloudFront always uses HTTP to connect to the origin.    match-viewer – CloudFront connects to the origin using the same protocol that the viewer used to connect to CloudFront.    https-only – CloudFront always uses HTTPS to connect to the origin.  
    */
  var OriginProtocolPolicy: typings.awsSdk.cloudfrontMod.OriginProtocolPolicy
  
  /**
    * Specifies how long, in seconds, CloudFront waits for a response from the origin. This is also known as the origin response timeout. The minimum timeout is 1 second, the maximum is 60 seconds, and the default (if you don’t specify otherwise) is 30 seconds. For more information, see Origin Response Timeout in the Amazon CloudFront Developer Guide.
    */
  var OriginReadTimeout: js.UndefOr[integer] = js.undefined
  
  /**
    * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS. Valid values include SSLv3, TLSv1, TLSv1.1, and TLSv1.2. For more information, see Minimum Origin SSL Protocol in the Amazon CloudFront Developer Guide.
    */
  var OriginSslProtocols: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginSslProtocols] = js.undefined
}
object CustomOriginConfig {
  
  inline def apply(HTTPPort: integer, HTTPSPort: integer, OriginProtocolPolicy: OriginProtocolPolicy): CustomOriginConfig = {
    val __obj = js.Dynamic.literal(HTTPPort = HTTPPort.asInstanceOf[js.Any], HTTPSPort = HTTPSPort.asInstanceOf[js.Any], OriginProtocolPolicy = OriginProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOriginConfig]
  }
  
  extension [Self <: CustomOriginConfig](x: Self) {
    
    inline def setHTTPPort(value: integer): Self = StObject.set(x, "HTTPPort", value.asInstanceOf[js.Any])
    
    inline def setHTTPSPort(value: integer): Self = StObject.set(x, "HTTPSPort", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeout(value: integer): Self = StObject.set(x, "OriginKeepaliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeoutUndefined: Self = StObject.set(x, "OriginKeepaliveTimeout", js.undefined)
    
    inline def setOriginProtocolPolicy(value: OriginProtocolPolicy): Self = StObject.set(x, "OriginProtocolPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeout(value: integer): Self = StObject.set(x, "OriginReadTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeoutUndefined: Self = StObject.set(x, "OriginReadTimeout", js.undefined)
    
    inline def setOriginSslProtocols(value: OriginSslProtocols): Self = StObject.set(x, "OriginSslProtocols", value.asInstanceOf[js.Any])
    
    inline def setOriginSslProtocolsUndefined: Self = StObject.set(x, "OriginSslProtocols", js.undefined)
  }
}
