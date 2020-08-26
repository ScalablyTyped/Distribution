package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsRequest extends js.Object {
  /**
    * Set to true to return the list of streams in ascending order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * The maximum number of results to return at a time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
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
    def setAscendingOrder(value: AscendingOrder): Self = this.set("ascendingOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscendingOrder: Self = this.set("ascendingOrder", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

