package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationsForResourceResult extends js.Object {
  /**
    * (Deprecated) Returns the number of pages of results that remain.  In releases prior to June 12, 2017, this parameter returned null by the API. It is now deprecated, and the API returns the next page token parameter instead. 
    */
  var nextPageCount: js.UndefOr[String] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetOperationsForResource request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object GetOperationsForResourceResult {
  @scala.inline
  def apply(): GetOperationsForResourceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationsForResourceResult]
  }
  @scala.inline
  implicit class GetOperationsForResourceResultOps[Self <: GetOperationsForResourceResult] (val x: Self) extends AnyVal {
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
    def setNextPageCount(value: String): Self = this.set("nextPageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageCount: Self = this.set("nextPageCount", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: OperationList): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
  
}

