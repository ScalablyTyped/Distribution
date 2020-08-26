package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var Days: js.UndefOr[typings.awsSdk.s3Mod.Days] = js.native
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
    */
  var Mode: js.UndefOr[ObjectLockRetentionMode] = js.native
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var Years: js.UndefOr[typings.awsSdk.s3Mod.Years] = js.native
}

object DefaultRetention {
  @scala.inline
  def apply(): DefaultRetention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRetention]
  }
  @scala.inline
  implicit class DefaultRetentionOps[Self <: DefaultRetention] (val x: Self) extends AnyVal {
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
    def setDays(value: Days): Self = this.set("Days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("Days", js.undefined)
    @scala.inline
    def setMode(value: ObjectLockRetentionMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    @scala.inline
    def setYears(value: Years): Self = this.set("Years", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYears: Self = this.set("Years", js.undefined)
  }
  
}

