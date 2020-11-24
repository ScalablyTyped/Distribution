package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThemeRequest extends js.Object {
  
  /**
    * The ID of the AWS account that contains the theme that you're updating.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially inherit from a default QuickSight theme.
    */
  var BaseThemeId: RestrictiveResourceId = js.native
  
  /**
    * The theme configuration, which contains the theme display properties.
    */
  var Configuration: js.UndefOr[ThemeConfiguration] = js.native
  
  /**
    * The name for the theme.
    */
  var Name: js.UndefOr[ThemeName] = js.native
  
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId = js.native
  
  /**
    * A description of the theme version that you're updating Every time that you call UpdateTheme, you create a new version of the theme. Each version of the theme maintains a description of the version in VersionDescription.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.quicksightMod.VersionDescription] = js.native
}
object UpdateThemeRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, BaseThemeId: RestrictiveResourceId, ThemeId: RestrictiveResourceId): UpdateThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], BaseThemeId = BaseThemeId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemeRequest]
  }
  
  @scala.inline
  implicit class UpdateThemeRequestOps[Self <: UpdateThemeRequest] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseThemeId(value: RestrictiveResourceId): Self = this.set("BaseThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: ThemeConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    
    @scala.inline
    def setName(value: ThemeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = this.set("VersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionDescription: Self = this.set("VersionDescription", js.undefined)
  }
}
