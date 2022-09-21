package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyCorsConfig extends StObject {
  
  /**
    * A Boolean that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP response header. For more information about the Access-Control-Allow-Credentials HTTP response header, see Access-Control-Allow-Credentials in the MDN Web Docs.
    */
  var AccessControlAllowCredentials: Boolean
  
  /**
    * A list of HTTP header names that CloudFront includes as values for the Access-Control-Allow-Headers HTTP response header. For more information about the Access-Control-Allow-Headers HTTP response header, see Access-Control-Allow-Headers in the MDN Web Docs.
    */
  var AccessControlAllowHeaders: ResponseHeadersPolicyAccessControlAllowHeaders
  
  /**
    * A list of HTTP methods that CloudFront includes as values for the Access-Control-Allow-Methods HTTP response header. For more information about the Access-Control-Allow-Methods HTTP response header, see Access-Control-Allow-Methods in the MDN Web Docs.
    */
  var AccessControlAllowMethods: ResponseHeadersPolicyAccessControlAllowMethods
  
  /**
    * A list of origins (domain names) that CloudFront can use as the value for the Access-Control-Allow-Origin HTTP response header. For more information about the Access-Control-Allow-Origin HTTP response header, see Access-Control-Allow-Origin in the MDN Web Docs.
    */
  var AccessControlAllowOrigins: ResponseHeadersPolicyAccessControlAllowOrigins
  
  /**
    * A list of HTTP headers that CloudFront includes as values for the Access-Control-Expose-Headers HTTP response header. For more information about the Access-Control-Expose-Headers HTTP response header, see Access-Control-Expose-Headers in the MDN Web Docs.
    */
  var AccessControlExposeHeaders: js.UndefOr[ResponseHeadersPolicyAccessControlExposeHeaders] = js.undefined
  
  /**
    * A number that CloudFront uses as the value for the Access-Control-Max-Age HTTP response header. For more information about the Access-Control-Max-Age HTTP response header, see Access-Control-Max-Age in the MDN Web Docs.
    */
  var AccessControlMaxAgeSec: js.UndefOr[integer] = js.undefined
  
  /**
    * A Boolean that determines whether CloudFront overrides HTTP response headers received from the origin with the ones specified in this response headers policy.
    */
  var OriginOverride: Boolean
}
object ResponseHeadersPolicyCorsConfig {
  
  inline def apply(
    AccessControlAllowCredentials: Boolean,
    AccessControlAllowHeaders: ResponseHeadersPolicyAccessControlAllowHeaders,
    AccessControlAllowMethods: ResponseHeadersPolicyAccessControlAllowMethods,
    AccessControlAllowOrigins: ResponseHeadersPolicyAccessControlAllowOrigins,
    OriginOverride: Boolean
  ): ResponseHeadersPolicyCorsConfig = {
    val __obj = js.Dynamic.literal(AccessControlAllowCredentials = AccessControlAllowCredentials.asInstanceOf[js.Any], AccessControlAllowHeaders = AccessControlAllowHeaders.asInstanceOf[js.Any], AccessControlAllowMethods = AccessControlAllowMethods.asInstanceOf[js.Any], AccessControlAllowOrigins = AccessControlAllowOrigins.asInstanceOf[js.Any], OriginOverride = OriginOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyCorsConfig]
  }
  
  extension [Self <: ResponseHeadersPolicyCorsConfig](x: Self) {
    
    inline def setAccessControlAllowCredentials(value: Boolean): Self = StObject.set(x, "AccessControlAllowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAccessControlAllowHeaders(value: ResponseHeadersPolicyAccessControlAllowHeaders): Self = StObject.set(x, "AccessControlAllowHeaders", value.asInstanceOf[js.Any])
    
    inline def setAccessControlAllowMethods(value: ResponseHeadersPolicyAccessControlAllowMethods): Self = StObject.set(x, "AccessControlAllowMethods", value.asInstanceOf[js.Any])
    
    inline def setAccessControlAllowOrigins(value: ResponseHeadersPolicyAccessControlAllowOrigins): Self = StObject.set(x, "AccessControlAllowOrigins", value.asInstanceOf[js.Any])
    
    inline def setAccessControlExposeHeaders(value: ResponseHeadersPolicyAccessControlExposeHeaders): Self = StObject.set(x, "AccessControlExposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setAccessControlExposeHeadersUndefined: Self = StObject.set(x, "AccessControlExposeHeaders", js.undefined)
    
    inline def setAccessControlMaxAgeSec(value: integer): Self = StObject.set(x, "AccessControlMaxAgeSec", value.asInstanceOf[js.Any])
    
    inline def setAccessControlMaxAgeSecUndefined: Self = StObject.set(x, "AccessControlMaxAgeSec", js.undefined)
    
    inline def setOriginOverride(value: Boolean): Self = StObject.set(x, "OriginOverride", value.asInstanceOf[js.Any])
  }
}
