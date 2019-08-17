package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreWriteRequestMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreDeleteRequestMod._UnmarshalledDeleteRequest
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscorePutRequestMod._UnmarshalledPutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledWriteRequest extends _WriteRequest {
  /**
    * <p>A request to perform a <code>DeleteItem</code> operation.</p>
    */
  @JSName("DeleteRequest")
  var DeleteRequest__UnmarshalledWriteRequest: js.UndefOr[_UnmarshalledDeleteRequest] = js.undefined
  /**
    * <p>A request to perform a <code>PutItem</code> operation.</p>
    */
  @JSName("PutRequest")
  var PutRequest__UnmarshalledWriteRequest: js.UndefOr[_UnmarshalledPutRequest] = js.undefined
}

object _UnmarshalledWriteRequest {
  @scala.inline
  def apply(DeleteRequest: _UnmarshalledDeleteRequest = null, PutRequest: _UnmarshalledPutRequest = null): _UnmarshalledWriteRequest = {
    val __obj = js.Dynamic.literal()
    if (DeleteRequest != null) __obj.updateDynamic("DeleteRequest")(DeleteRequest)
    if (PutRequest != null) __obj.updateDynamic("PutRequest")(PutRequest)
    __obj.asInstanceOf[_UnmarshalledWriteRequest]
  }
}

