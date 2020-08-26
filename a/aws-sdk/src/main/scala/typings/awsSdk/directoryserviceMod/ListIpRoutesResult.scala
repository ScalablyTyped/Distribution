package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIpRoutesResult extends js.Object {
  /**
    * A list of IpRoutes.
    */
  var IpRoutesInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.IpRoutesInfo] = js.native
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}

object ListIpRoutesResult {
  @scala.inline
  def apply(): ListIpRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIpRoutesResult]
  }
  @scala.inline
  implicit class ListIpRoutesResultOps[Self <: ListIpRoutesResult] (val x: Self) extends AnyVal {
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
    def setIpRoutesInfoVarargs(value: IpRouteInfo*): Self = this.set("IpRoutesInfo", js.Array(value :_*))
    @scala.inline
    def setIpRoutesInfo(value: IpRoutesInfo): Self = this.set("IpRoutesInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpRoutesInfo: Self = this.set("IpRoutesInfo", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

