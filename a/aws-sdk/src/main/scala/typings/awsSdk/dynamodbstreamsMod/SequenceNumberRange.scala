package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceNumberRange extends js.Object {
  /**
    * The last sequence number.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
  /**
    * The first sequence number.
    */
  var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
}

object SequenceNumberRange {
  @scala.inline
  def apply(EndingSequenceNumber: SequenceNumber = null, StartingSequenceNumber: SequenceNumber = null): SequenceNumberRange = {
    val __obj = js.Dynamic.literal()
    if (EndingSequenceNumber != null) __obj.updateDynamic("EndingSequenceNumber")(EndingSequenceNumber.asInstanceOf[js.Any])
    if (StartingSequenceNumber != null) __obj.updateDynamic("StartingSequenceNumber")(StartingSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceNumberRange]
  }
}

