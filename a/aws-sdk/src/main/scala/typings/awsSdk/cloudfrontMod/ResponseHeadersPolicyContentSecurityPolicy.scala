package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyContentSecurityPolicy extends StObject {
  
  /**
    * The policy directives and their values that CloudFront includes as values for the Content-Security-Policy HTTP response header.
    */
  var ContentSecurityPolicy: String
  
  /**
    * A Boolean that determines whether CloudFront overrides the Content-Security-Policy HTTP response header received from the origin with the one specified in this response headers policy.
    */
  var Override: Boolean
}
object ResponseHeadersPolicyContentSecurityPolicy {
  
  inline def apply(ContentSecurityPolicy: String, Override: Boolean): ResponseHeadersPolicyContentSecurityPolicy = {
    val __obj = js.Dynamic.literal(ContentSecurityPolicy = ContentSecurityPolicy.asInstanceOf[js.Any], Override = Override.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyContentSecurityPolicy]
  }
  
  extension [Self <: ResponseHeadersPolicyContentSecurityPolicy](x: Self) {
    
    inline def setContentSecurityPolicy(value: String): Self = StObject.set(x, "ContentSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
  }
}
