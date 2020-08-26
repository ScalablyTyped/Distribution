package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchRetryOptions extends js.Object {
  /**
    * After an initial failure to deliver to Amazon ES, the total amount of time during which Kinesis Data Firehose retries delivery (including the first attempt). After this time has elapsed, the failed documents are written to Amazon S3. Default value is 300 seconds (5 minutes). A value of 0 (zero) results in no retries.
    */
  var DurationInSeconds: js.UndefOr[ElasticsearchRetryDurationInSeconds] = js.native
}

object ElasticsearchRetryOptions {
  @scala.inline
  def apply(): ElasticsearchRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchRetryOptions]
  }
  @scala.inline
  implicit class ElasticsearchRetryOptionsOps[Self <: ElasticsearchRetryOptions] (val x: Self) extends AnyVal {
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
    def setDurationInSeconds(value: ElasticsearchRetryDurationInSeconds): Self = this.set("DurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationInSeconds: Self = this.set("DurationInSeconds", js.undefined)
  }
  
}

