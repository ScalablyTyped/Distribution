package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicySummary extends StObject {
  
  /**
    * The response headers policy.
    */
  var ResponseHeadersPolicy: typings.awsSdk.cloudfrontMod.ResponseHeadersPolicy
  
  /**
    * The type of response headers policy, either managed (created by Amazon Web Services) or custom (created in this Amazon Web Services account).
    */
  var Type: ResponseHeadersPolicyType
}
object ResponseHeadersPolicySummary {
  
  inline def apply(ResponseHeadersPolicy: ResponseHeadersPolicy, Type: ResponseHeadersPolicyType): ResponseHeadersPolicySummary = {
    val __obj = js.Dynamic.literal(ResponseHeadersPolicy = ResponseHeadersPolicy.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicySummary]
  }
  
  extension [Self <: ResponseHeadersPolicySummary](x: Self) {
    
    inline def setResponseHeadersPolicy(value: ResponseHeadersPolicy): Self = StObject.set(x, "ResponseHeadersPolicy", value.asInstanceOf[js.Any])
    
    inline def setType(value: ResponseHeadersPolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
