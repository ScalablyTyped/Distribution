package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeVersion extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit from a default QuickSight theme.
    */
  var BaseThemeId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The theme configuration, which contains all the theme display properties.
    */
  var Configuration: js.UndefOr[ThemeConfiguration] = js.native
  /**
    * The date and time that this theme version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The description of the theme.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  /**
    * Errors associated with the theme.
    */
  var Errors: js.UndefOr[ThemeErrorList] = js.native
  /**
    * The status of the theme version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * The version number of the theme.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object ThemeVersion {
  @scala.inline
  def apply(): ThemeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeVersion]
  }
  @scala.inline
  implicit class ThemeVersionOps[Self <: ThemeVersion] (val x: Self) extends AnyVal {
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
    def setBaseThemeId(value: RestrictiveResourceId): Self = this.set("BaseThemeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseThemeId: Self = this.set("BaseThemeId", js.undefined)
    @scala.inline
    def setConfiguration(value: ThemeConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setDescription(value: VersionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: ThemeError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: ThemeErrorList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
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

