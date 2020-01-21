package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHsmsResponse extends js.Object {
  /**
    * The list of ARNs that identify the HSMs.
    */
  var HsmList: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmList] = js.native
  /**
    * If not null, more results are available. Pass this value to ListHsms to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListHsmsResponse {
  @scala.inline
  def apply(HsmList: HsmList = null, NextToken: PaginationToken = null): ListHsmsResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmList != null) __obj.updateDynamic("HsmList")(HsmList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHsmsResponse]
  }
}

