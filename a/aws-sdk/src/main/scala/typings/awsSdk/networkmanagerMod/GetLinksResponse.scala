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
  def apply(Links: LinkList = null, NextToken: String = null): GetLinksResponse = {
    val __obj = js.Dynamic.literal()
    if (Links != null) __obj.updateDynamic("Links")(Links.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinksResponse]
  }
}

