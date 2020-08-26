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
  def apply(HapgList: HapgList): ListHapgsResponse = {
    val __obj = js.Dynamic.literal(HapgList = HapgList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHapgsResponse]
  }
  @scala.inline
  implicit class ListHapgsResponseOps[Self <: ListHapgsResponse] (val x: Self) extends AnyVal {
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
    def setHapgListVarargs(value: HapgArn*): Self = this.set("HapgList", js.Array(value :_*))
    @scala.inline
    def setHapgList(value: HapgList): Self = this.set("HapgList", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

