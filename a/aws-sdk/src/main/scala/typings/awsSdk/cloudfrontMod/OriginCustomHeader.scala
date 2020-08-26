package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginCustomHeader extends js.Object {
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
  implicit class OriginCustomHeaderOps[Self <: OriginCustomHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaderName(value: String): Self = this.set("HeaderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderValue(value: String): Self = this.set("HeaderValue", value.asInstanceOf[js.Any])
  }
  
}

