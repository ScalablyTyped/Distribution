package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResponseHeadersPolicyRequest extends StObject {
  
  /**
    * The identifier for the response headers policy that you are updating.
    */
  var Id: String
  
  /**
    * The version of the response headers policy that you are updating. The version is returned in the cache policy’s ETag field in the response to GetResponseHeadersPolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * A response headers policy configuration.
    */
  var ResponseHeadersPolicyConfig: typings.awsSdk.cloudfrontMod.ResponseHeadersPolicyConfig
}
object UpdateResponseHeadersPolicyRequest {
  
  inline def apply(Id: String, ResponseHeadersPolicyConfig: ResponseHeadersPolicyConfig): UpdateResponseHeadersPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ResponseHeadersPolicyConfig = ResponseHeadersPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResponseHeadersPolicyRequest]
  }
  
  extension [Self <: UpdateResponseHeadersPolicyRequest](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setResponseHeadersPolicyConfig(value: ResponseHeadersPolicyConfig): Self = StObject.set(x, "ResponseHeadersPolicyConfig", value.asInstanceOf[js.Any])
  }
}
