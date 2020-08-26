package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPeriod extends js.Object {
  /**
    * The number of days that message data is kept. The "unlimited" parameter must be false.
    */
  var numberOfDays: js.UndefOr[RetentionPeriodInDays] = js.native
  /**
    * If true, message data is kept indefinitely.
    */
  var unlimited: js.UndefOr[UnlimitedRetentionPeriod] = js.native
}

object RetentionPeriod {
  @scala.inline
  def apply(): RetentionPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPeriod]
  }
  @scala.inline
  implicit class RetentionPeriodOps[Self <: RetentionPeriod] (val x: Self) extends AnyVal {
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
    def setNumberOfDays(value: RetentionPeriodInDays): Self = this.set("numberOfDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfDays: Self = this.set("numberOfDays", js.undefined)
    @scala.inline
    def setUnlimited(value: UnlimitedRetentionPeriod): Self = this.set("unlimited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlimited: Self = this.set("unlimited", js.undefined)
  }
  
}

