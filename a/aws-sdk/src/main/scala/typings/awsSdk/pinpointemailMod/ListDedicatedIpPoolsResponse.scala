package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDedicatedIpPoolsResponse extends js.Object {
  /**
    * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
    */
  var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.native
  /**
    * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another request to ListDedicatedIpPools, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
}

object ListDedicatedIpPoolsResponse {
  @scala.inline
  def apply(): ListDedicatedIpPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDedicatedIpPoolsResponse]
  }
  @scala.inline
  implicit class ListDedicatedIpPoolsResponseOps[Self <: ListDedicatedIpPoolsResponse] (val x: Self) extends AnyVal {
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
    def setDedicatedIpPoolsVarargs(value: PoolName*): Self = this.set("DedicatedIpPools", js.Array(value :_*))
    @scala.inline
    def setDedicatedIpPools(value: ListOfDedicatedIpPools): Self = this.set("DedicatedIpPools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedIpPools: Self = this.set("DedicatedIpPools", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

