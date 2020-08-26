package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The date and time that this theme was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The last date and time that this theme was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The latest version number for the theme. 
    */
  var LatestVersionNumber: js.UndefOr[VersionNumber] = js.native
  /**
    * the display name for the theme.
    */
  var Name: js.UndefOr[ThemeName] = js.native
  /**
    * The ID of the theme. This ID is unique per AWS Region for each AWS account.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.native
}

object ThemeSummary {
  @scala.inline
  def apply(): ThemeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeSummary]
  }
  @scala.inline
  implicit class ThemeSummaryOps[Self <: ThemeSummary] (val x: Self) extends AnyVal {
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
    def setLastUpdatedTime(value: Timestamp_): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setLatestVersionNumber(value: VersionNumber): Self = this.set("LatestVersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestVersionNumber: Self = this.set("LatestVersionNumber", js.undefined)
    @scala.inline
    def setName(value: ThemeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeId: Self = this.set("ThemeId", js.undefined)
  }
  
}

