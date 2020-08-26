package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.worklinkMod.NextToken] = js.native
  /**
    * Information about the certificates.
    */
  var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.native
}

object ListWebsiteCertificateAuthoritiesResponse {
  @scala.inline
  def apply(): ListWebsiteCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
  }
  @scala.inline
  implicit class ListWebsiteCertificateAuthoritiesResponseOps[Self <: ListWebsiteCertificateAuthoritiesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setWebsiteCertificateAuthoritiesVarargs(value: WebsiteCaSummary*): Self = this.set("WebsiteCertificateAuthorities", js.Array(value :_*))
    @scala.inline
    def setWebsiteCertificateAuthorities(value: WebsiteCaSummaryList): Self = this.set("WebsiteCertificateAuthorities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteCertificateAuthorities: Self = this.set("WebsiteCertificateAuthorities", js.undefined)
  }
  
}

