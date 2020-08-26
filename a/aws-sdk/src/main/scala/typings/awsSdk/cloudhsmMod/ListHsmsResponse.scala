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
  def apply(): ListHsmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHsmsResponse]
  }
  @scala.inline
  implicit class ListHsmsResponseOps[Self <: ListHsmsResponse] (val x: Self) extends AnyVal {
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
    def setHsmListVarargs(value: HsmArn*): Self = this.set("HsmList", js.Array(value :_*))
    @scala.inline
    def setHsmList(value: HsmList): Self = this.set("HsmList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsmList: Self = this.set("HsmList", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

