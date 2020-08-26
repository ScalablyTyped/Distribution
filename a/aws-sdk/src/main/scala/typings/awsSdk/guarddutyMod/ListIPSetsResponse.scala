package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIPSetsResponse extends js.Object {
  /**
    * The IDs of the IPSet resources.
    */
  var IpSetIds: typings.awsSdk.guarddutyMod.IpSetIds = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIPSetsResponse {
  @scala.inline
  def apply(IpSetIds: IpSetIds): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal(IpSetIds = IpSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  @scala.inline
  implicit class ListIPSetsResponseOps[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
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
    def setIpSetIdsVarargs(value: String*): Self = this.set("IpSetIds", js.Array(value :_*))
    @scala.inline
    def setIpSetIds(value: IpSetIds): Self = this.set("IpSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

