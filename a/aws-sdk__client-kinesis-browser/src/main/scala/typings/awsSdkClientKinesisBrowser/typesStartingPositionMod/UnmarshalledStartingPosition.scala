package typings.awsSdkClientKinesisBrowser.typesStartingPositionMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledStartingPosition extends StartingPosition {
  /**
    * _Timestamp shape
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledStartingPosition: js.UndefOr[Date] = js.undefined
}

object UnmarshalledStartingPosition {
  @scala.inline
  def apply(
    Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
    SequenceNumber: String = null,
    Timestamp: Date = null
  ): UnmarshalledStartingPosition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStartingPosition]
  }
}

