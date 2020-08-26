package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSitesResponse extends js.Object {
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The sites.
    */
  var Sites: js.UndefOr[SiteList] = js.native
}

object GetSitesResponse {
  @scala.inline
  def apply(): GetSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSitesResponse]
  }
  @scala.inline
  implicit class GetSitesResponseOps[Self <: GetSitesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSitesVarargs(value: Site*): Self = this.set("Sites", js.Array(value :_*))
    @scala.inline
    def setSites(value: SiteList): Self = this.set("Sites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSites: Self = this.set("Sites", js.undefined)
  }
  
}

