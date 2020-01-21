package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginCustomHeader extends js.Object {
  /**
    * The name of a header that you want CloudFront to forward to your origin. For more information, see Forwarding Custom Headers to Your Origin (Web Distributions Only) in the  Amazon CloudFront Developer Guide.
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
}

