package typings.awsSdkClientDynamodbBrowser.typesWriteRequestMod

import typings.awsSdkClientDynamodbBrowser.typesDeleteRequestMod.UnmarshalledDeleteRequest
import typings.awsSdkClientDynamodbBrowser.typesPutRequestMod.UnmarshalledPutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledWriteRequest extends WriteRequest {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  @JSName("DeleteRequest")
  var DeleteRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledDeleteRequest] = js.undefined
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  @JSName("PutRequest")
  var PutRequest_UnmarshalledWriteRequest: js.UndefOr[UnmarshalledPutRequest] = js.undefined
}

object UnmarshalledWriteRequest {
  @scala.inline
  def apply(DeleteRequest: UnmarshalledDeleteRequest = null, PutRequest: UnmarshalledPutRequest = null): UnmarshalledWriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest.asInstanceOf[js.Any])
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledWriteRequest]
  }
}

