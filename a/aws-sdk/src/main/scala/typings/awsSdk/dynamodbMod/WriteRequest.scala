package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteRequest extends js.Object {
  /**
    * A request to perform a DeleteItem operation.
    */
  var DeleteRequest: js.UndefOr[typings.awsSdk.dynamodbMod.DeleteRequest] = js.native
  /**
    * A request to perform a PutItem operation.
    */
  var PutRequest: js.UndefOr[typings.awsSdk.dynamodbMod.PutRequest] = js.native
}

object WriteRequest {
  @scala.inline
  def apply(): WriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteRequest]
  }
  @scala.inline
  implicit class WriteRequestOps[Self <: WriteRequest] (val x: Self) extends AnyVal {
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
    def setDeleteRequest(value: DeleteRequest): Self = this.set("DeleteRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteRequest: Self = this.set("DeleteRequest", js.undefined)
    @scala.inline
    def setPutRequest(value: PutRequest): Self = this.set("PutRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePutRequest: Self = this.set("PutRequest", js.undefined)
  }
  
}

