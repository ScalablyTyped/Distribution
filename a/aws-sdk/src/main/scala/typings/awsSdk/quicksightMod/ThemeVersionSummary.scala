package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeVersionSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the theme version.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The date and time that this theme version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The description of the theme version.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  /**
    * The status of the theme version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * The version number of the theme version.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object ThemeVersionSummary {
  @scala.inline
  def apply(): ThemeVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeVersionSummary]
  }
  @scala.inline
  implicit class ThemeVersionSummaryOps[Self <: ThemeVersionSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDescription(value: VersionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setStatus(value: ResourceStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
  
}

