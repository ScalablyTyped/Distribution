package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsRequest extends js.Object {
  /**
    * Maximum number of streams to return.
    */
  var maxResults: js.UndefOr[MaxStreamResults] = js.native
  /**
    * The first stream to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListStreamsRequest {
  @scala.inline
  def apply(): ListStreamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsRequest]
  }
  @scala.inline
  implicit class ListStreamsRequestOps[Self <: ListStreamsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxStreamResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

