package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpsRequest extends js.Object {
  /**
    * A token returned from a previous call to GetDedicatedIps to indicate the position of the dedicated IP pool in the list of IP pools.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to GetDedicatedIpsRequest. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The name of the IP pool that the dedicated IP address is associated with.
    */
  var PoolName: js.UndefOr[typings.awsSdk.sesv2Mod.PoolName] = js.native
}

object GetDedicatedIpsRequest {
  @scala.inline
  def apply(): GetDedicatedIpsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpsRequest]
  }
  @scala.inline
  implicit class GetDedicatedIpsRequestOps[Self <: GetDedicatedIpsRequest] (val x: Self) extends AnyVal {
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
    def setPageSize(value: MaxItems): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    @scala.inline
    def setPoolName(value: PoolName): Self = this.set("PoolName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolName: Self = this.set("PoolName", js.undefined)
  }
  
}

