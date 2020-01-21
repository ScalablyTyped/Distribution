package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSpecification extends js.Object {
  /**
    * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
    */
  var StreamEnabled: typings.awsSdk.dynamodbMod.StreamEnabled = js.native
  /**
    *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk.dynamodbMod.StreamViewType] = js.native
}

object StreamSpecification {
  @scala.inline
  def apply(StreamEnabled: StreamEnabled, StreamViewType: StreamViewType = null): StreamSpecification = {
    val __obj = js.Dynamic.literal(StreamEnabled = StreamEnabled.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpecification]
  }
}

