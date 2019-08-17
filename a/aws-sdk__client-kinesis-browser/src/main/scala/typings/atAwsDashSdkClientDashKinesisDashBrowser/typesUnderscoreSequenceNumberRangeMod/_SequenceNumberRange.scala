package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreSequenceNumberRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SequenceNumberRange extends js.Object {
  /**
    * <p>The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of <code>null</code>.</p>
    */
  var EndingSequenceNumber: js.UndefOr[String] = js.undefined
  /**
    * <p>The starting sequence number for the range.</p>
    */
  var StartingSequenceNumber: String
}

object _SequenceNumberRange {
  @scala.inline
  def apply(StartingSequenceNumber: String, EndingSequenceNumber: String = null): _SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber)
    if (EndingSequenceNumber != null) __obj.updateDynamic("EndingSequenceNumber")(EndingSequenceNumber)
    __obj.asInstanceOf[_SequenceNumberRange]
  }
}

