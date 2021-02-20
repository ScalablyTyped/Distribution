package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginCustomHeader extends StObject {
  
  /**
    * The name of a header that you want CloudFront to send to your origin. For more information, see Adding Custom Headers to Origin Requests in the  Amazon CloudFront Developer Guide.
    */
  var HeaderName: String = js.native
  
  /**
    * The value for the header that you specified in the HeaderName field.
    */
  var HeaderValue: String = js.native
}
object OriginCustomHeader {
  
  @scala.inline
  def apply(HeaderName: String, HeaderValue: String): OriginCustomHeader = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName.asInstanceOf[js.Any], HeaderValue = HeaderValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginCustomHeader]
  }
  
  @scala.inline
  implicit class OriginCustomHeaderMutableBuilder[Self <: OriginCustomHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderName(value: String): Self = StObject.set(x, "HeaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValue(value: String): Self = StObject.set(x, "HeaderValue", value.asInstanceOf[js.Any])
  }
}
