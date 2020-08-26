package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferingHints extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300. This parameter is optional but if you specify a value for it, you must also specify a value for SizeInMBs, and vice versa.
    */
  var IntervalInSeconds: js.UndefOr[typings.awsSdk.firehoseMod.IntervalInSeconds] = js.native
  /**
    * Buffer incoming data to the specified size, in MiBs, before delivering it to the destination. The default value is 5. This parameter is optional but if you specify a value for it, you must also specify a value for IntervalInSeconds, and vice versa. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MiB/sec, the value should be 10 MiB or higher.
    */
  var SizeInMBs: js.UndefOr[typings.awsSdk.firehoseMod.SizeInMBs] = js.native
}

object BufferingHints {
  @scala.inline
  def apply(): BufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferingHints]
  }
  @scala.inline
  implicit class BufferingHintsOps[Self <: BufferingHints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIntervalInSeconds(value: IntervalInSeconds): Self = this.set("IntervalInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalInSeconds: Self = this.set("IntervalInSeconds", js.undefined)
    @scala.inline
    def setSizeInMBs(value: SizeInMBs): Self = this.set("SizeInMBs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInMBs: Self = this.set("SizeInMBs", js.undefined)
  }
  
}

