package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifiersRequest extends js.Object {
  /**
    * The size of the list to return (optional).
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * An optional continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetClassifiersRequest {
  @scala.inline
  def apply(): GetClassifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifiersRequest]
  }
  @scala.inline
  implicit class GetClassifiersRequestOps[Self <: GetClassifiersRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

