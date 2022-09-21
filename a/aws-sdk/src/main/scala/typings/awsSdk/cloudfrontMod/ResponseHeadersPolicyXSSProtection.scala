package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyXSSProtection extends StObject {
  
  /**
    * A Boolean that determines whether CloudFront includes the mode=block directive in the X-XSS-Protection header. For more information about this directive, see X-XSS-Protection in the MDN Web Docs.
    */
  var ModeBlock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
    */
  var Override: Boolean
  
  /**
    * A Boolean that determines the value of the X-XSS-Protection HTTP response header. When this setting is true, the value of the X-XSS-Protection header is 1. When this setting is false, the value of the X-XSS-Protection header is 0. For more information about these settings, see X-XSS-Protection in the MDN Web Docs.
    */
  var Protection: Boolean
  
  /**
    * A reporting URI, which CloudFront uses as the value of the report directive in the X-XSS-Protection header. You cannot specify a ReportUri when ModeBlock is true. For more information about using a reporting URL, see X-XSS-Protection in the MDN Web Docs.
    */
  var ReportUri: js.UndefOr[String] = js.undefined
}
object ResponseHeadersPolicyXSSProtection {
  
  inline def apply(Override: Boolean, Protection: Boolean): ResponseHeadersPolicyXSSProtection = {
    val __obj = js.Dynamic.literal(Override = Override.asInstanceOf[js.Any], Protection = Protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyXSSProtection]
  }
  
  extension [Self <: ResponseHeadersPolicyXSSProtection](x: Self) {
    
    inline def setModeBlock(value: Boolean): Self = StObject.set(x, "ModeBlock", value.asInstanceOf[js.Any])
    
    inline def setModeBlockUndefined: Self = StObject.set(x, "ModeBlock", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
    
    inline def setProtection(value: Boolean): Self = StObject.set(x, "Protection", value.asInstanceOf[js.Any])
    
    inline def setReportUri(value: String): Self = StObject.set(x, "ReportUri", value.asInstanceOf[js.Any])
    
    inline def setReportUriUndefined: Self = StObject.set(x, "ReportUri", js.undefined)
  }
}
