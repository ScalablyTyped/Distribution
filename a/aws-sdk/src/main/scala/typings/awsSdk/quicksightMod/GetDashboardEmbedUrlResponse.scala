package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDashboardEmbedUrlResponse extends js.Object {
  /**
    * A single-use URL that you can put into your server-side webpage to embed your dashboard. This URL is valid for 5 minutes. The API provides the URL with an auth_code value that enables one (and only one) sign-on to a user session that is valid for 10 hours. 
    */
  var EmbedUrl: js.UndefOr[EmbeddingUrl] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object GetDashboardEmbedUrlResponse {
  @scala.inline
  def apply(): GetDashboardEmbedUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDashboardEmbedUrlResponse]
  }
  @scala.inline
  implicit class GetDashboardEmbedUrlResponseOps[Self <: GetDashboardEmbedUrlResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmbedUrl(value: EmbeddingUrl): Self = this.set("EmbedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedUrl: Self = this.set("EmbedUrl", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

