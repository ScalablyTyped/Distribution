package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpEndpointBufferingHints extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300 (5 minutes). 
    */
  var IntervalInSeconds: js.UndefOr[HttpEndpointBufferingIntervalInSeconds] = js.native
  /**
    * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.  We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec, the value should be 10 MB or higher. 
    */
  var SizeInMBs: js.UndefOr[HttpEndpointBufferingSizeInMBs] = js.native
}

object HttpEndpointBufferingHints {
  @scala.inline
  def apply(): HttpEndpointBufferingHints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointBufferingHints]
  }
  @scala.inline
  implicit class HttpEndpointBufferingHintsOps[Self <: HttpEndpointBufferingHints] (val x: Self) extends AnyVal {
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
    def setIntervalInSeconds(value: HttpEndpointBufferingIntervalInSeconds): Self = this.set("IntervalInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervalInSeconds: Self = this.set("IntervalInSeconds", js.undefined)
    @scala.inline
    def setSizeInMBs(value: HttpEndpointBufferingSizeInMBs): Self = this.set("SizeInMBs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInMBs: Self = this.set("SizeInMBs", js.undefined)
  }
  
}

