package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResponseHeadersPolicyResult extends StObject {
  
  /**
    * The version identifier for the current version of the response headers policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the response headers policy.
    */
  var Location: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a response headers policy.
    */
  var ResponseHeadersPolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.ResponseHeadersPolicy] = js.undefined
}
object CreateResponseHeadersPolicyResult {
  
  inline def apply(): CreateResponseHeadersPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResponseHeadersPolicyResult]
  }
  
  extension [Self <: CreateResponseHeadersPolicyResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setResponseHeadersPolicy(value: ResponseHeadersPolicy): Self = StObject.set(x, "ResponseHeadersPolicy", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersPolicyUndefined: Self = StObject.set(x, "ResponseHeadersPolicy", js.undefined)
  }
}
