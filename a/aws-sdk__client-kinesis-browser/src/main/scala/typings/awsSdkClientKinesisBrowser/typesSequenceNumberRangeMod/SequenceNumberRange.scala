package typings.awsSdkClientKinesisBrowser.typesSequenceNumberRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceNumberRange extends js.Object {
  /**
    * <p>The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of <code>null</code>.</p>
    */
  var EndingSequenceNumber: js.UndefOr[String] = js.undefined
  /**
    * <p>The starting sequence number for the range.</p>
    */
  var StartingSequenceNumber: String
}

object SequenceNumberRange {
  @scala.inline
  def apply(StartingSequenceNumber: String, EndingSequenceNumber: String = null): SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any])
    if (EndingSequenceNumber != null) __obj.updateDynamic("EndingSequenceNumber")(EndingSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceNumberRange]
  }
}

