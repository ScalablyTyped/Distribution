package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftRetryOptions extends js.Object {
  /**
    * The length of time during which Kinesis Data Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Kinesis Data Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var DurationInSeconds: js.UndefOr[RedshiftRetryDurationInSeconds] = js.native
}

object RedshiftRetryOptions {
  @scala.inline
  def apply(): RedshiftRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedshiftRetryOptions]
  }
  @scala.inline
  implicit class RedshiftRetryOptionsOps[Self <: RedshiftRetryOptions] (val x: Self) extends AnyVal {
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
    def setDurationInSeconds(value: RedshiftRetryDurationInSeconds): Self = this.set("DurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInSeconds: Self = this.set("DurationInSeconds", js.undefined)
  }
  
}

