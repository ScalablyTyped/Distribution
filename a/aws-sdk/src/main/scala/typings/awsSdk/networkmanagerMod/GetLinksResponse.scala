package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinksResponse extends js.Object {
  /**
    * The links.
    */
  var Links: js.UndefOr[LinkList] = js.native
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetLinksResponse {
  @scala.inline
  def apply(): GetLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinksResponse]
  }
  @scala.inline
  implicit class GetLinksResponseOps[Self <: GetLinksResponse] (val x: Self) extends AnyVal {
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
    def setLinksVarargs(value: Link*): Self = this.set("Links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: LinkList): Self = this.set("Links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("Links", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

