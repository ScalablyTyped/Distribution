package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginCustomHeader extends StObject {
  
  /**
    * The name of a header that you want CloudFront to send to your origin. For more information, see Adding Custom Headers to Origin Requests in the  Amazon CloudFront Developer Guide.
    */
  var HeaderName: String
  
  /**
    * The value for the header that you specified in the HeaderName field.
    */
  var HeaderValue: sensitiveStringType
}
object OriginCustomHeader {
  
  inline def apply(HeaderName: String, HeaderValue: sensitiveStringType): OriginCustomHeader = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName.asInstanceOf[js.Any], HeaderValue = HeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginCustomHeader]
  }
  
  extension [Self <: OriginCustomHeader](x: Self) {
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "HeaderName", value.asInstanceOf[js.Any])
    
    inline def setHeaderValue(value: sensitiveStringType): Self = StObject.set(x, "HeaderValue", value.asInstanceOf[js.Any])
  }
}
