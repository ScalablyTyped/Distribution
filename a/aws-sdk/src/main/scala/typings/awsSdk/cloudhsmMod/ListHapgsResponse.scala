package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHapgsResponse extends js.Object {
  /**
    * The list of high-availability partition groups.
    */
  var HapgList: typings.awsSdk.cloudhsmMod.HapgList = js.native
  /**
    * If not null, more results are available. Pass this value to ListHapgs to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListHapgsResponse {
  @scala.inline
  def apply(HapgList: HapgList, NextToken: PaginationToken = null): ListHapgsResponse = {
    val __obj = js.Dynamic.literal(HapgList = HapgList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHapgsResponse]
  }
}

