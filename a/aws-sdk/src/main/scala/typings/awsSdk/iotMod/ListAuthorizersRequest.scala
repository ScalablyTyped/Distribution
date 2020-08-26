package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuthorizersRequest extends js.Object {
  /**
    * Return the list of authorizers in ascending alphabetical order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  /**
    * The status of the list authorizers request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
}

object ListAuthorizersRequest {
  @scala.inline
  def apply(): ListAuthorizersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuthorizersRequest]
  }
  @scala.inline
  implicit class ListAuthorizersRequestOps[Self <: ListAuthorizersRequest] (val x: Self) extends AnyVal {
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
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setStatus(value: AuthorizerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

