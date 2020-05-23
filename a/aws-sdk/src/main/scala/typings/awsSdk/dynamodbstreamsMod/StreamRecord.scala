package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamRecord extends js.Object {
  /**
    * The approximate date and time when the stream record was created, in UNIX epoch time format.
    */
  var ApproximateCreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The primary key attribute(s) for the DynamoDB item that was modified.
    */
  var Keys: js.UndefOr[AttributeMap] = js.native
  /**
    * The item in the DynamoDB table as it appeared after it was modified.
    */
  var NewImage: js.UndefOr[AttributeMap] = js.native
  /**
    * The item in the DynamoDB table as it appeared before it was modified.
    */
  var OldImage: js.UndefOr[AttributeMap] = js.native
  /**
    * The sequence number of the stream record.
    */
  var SequenceNumber: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.SequenceNumber] = js.native
  /**
    * The size of the stream record, in bytes.
    */
  var SizeBytes: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:    KEYS_ONLY - only the key attributes of the modified item.    NEW_IMAGE - the entire item, as it appeared after it was modified.    OLD_IMAGE - the entire item, as it appeared before it was modified.    NEW_AND_OLD_IMAGES - both the new and the old item images of the item.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamViewType] = js.native
}

object StreamRecord {
  @scala.inline
  def apply(
    ApproximateCreationDateTime: Date = null,
    Keys: AttributeMap = null,
    NewImage: AttributeMap = null,
    OldImage: AttributeMap = null,
    SequenceNumber: SequenceNumber = null,
    SizeBytes: js.UndefOr[PositiveLongObject] = js.undefined,
    StreamViewType: StreamViewType = null
  ): StreamRecord = {
    val __obj = js.Dynamic.literal()
    if (ApproximateCreationDateTime != null) __obj.updateDynamic("ApproximateCreationDateTime")(ApproximateCreationDateTime.asInstanceOf[js.Any])
    if (Keys != null) __obj.updateDynamic("Keys")(Keys.asInstanceOf[js.Any])
    if (NewImage != null) __obj.updateDynamic("NewImage")(NewImage.asInstanceOf[js.Any])
    if (OldImage != null) __obj.updateDynamic("OldImage")(OldImage.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeBytes)) __obj.updateDynamic("SizeBytes")(SizeBytes.get.asInstanceOf[js.Any])
    if (StreamViewType != null) __obj.updateDynamic("StreamViewType")(StreamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamRecord]
  }
}

