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
  def apply(): SequenceNumberRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceNumberRange]
  }
  @scala.inline
  implicit class SequenceNumberRangeOps[Self <: SequenceNumberRange] (val x: Self) extends AnyVal {
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
    def setEndingSequenceNumber(value: SequenceNumber): Self = this.set("EndingSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndingSequenceNumber: Self = this.set("EndingSequenceNumber", js.undefined)
    @scala.inline
    def setStartingSequenceNumber(value: SequenceNumber): Self = this.set("StartingSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingSequenceNumber: Self = this.set("StartingSequenceNumber", js.undefined)
  }
  
}

