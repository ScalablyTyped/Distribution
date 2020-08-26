package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHapgsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListHapgs. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListHapgsRequest {
  @scala.inline
  def apply(): ListHapgsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHapgsRequest]
  }
  @scala.inline
  implicit class ListHapgsRequestOps[Self <: ListHapgsRequest] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

