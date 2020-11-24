package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThemeRequest extends js.Object {
  
  /**
    * The ID of the AWS account where you want to store the new theme. 
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting themes defined by Amazon QuickSight. For a list of the starting themes, use ListThemes or choose Themes from within a QuickSight analysis. 
    */
  var BaseThemeId: RestrictiveResourceId = js.native
  
  /**
    * The theme configuration, which contains the theme display properties.
    */
  var Configuration: ThemeConfiguration = js.native
  
  /**
    * A display name for the theme.
    */
  var Name: ThemeName = js.native
  
  /**
    * A valid grouping of resource permissions to apply to the new theme. 
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  
  /**
    * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
    */
  var ThemeId: RestrictiveResourceId = js.native
  
  /**
    * A description of the first version of the theme that you're creating. Every time UpdateTheme is called, a new version is created. Each version of the theme has a description of the version in the VersionDescription field.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.quicksightMod.VersionDescription] = js.native
}
object CreateThemeRequest {
  
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    BaseThemeId: RestrictiveResourceId,
    Configuration: ThemeConfiguration,
    Name: ThemeName,
    ThemeId: RestrictiveResourceId
  ): CreateThemeRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], BaseThemeId = BaseThemeId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThemeRequest]
  }
  
  @scala.inline
  implicit class CreateThemeRequestOps[Self <: CreateThemeRequest] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: ThemeConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ThemeName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = this.set("VersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionDescription: Self = this.set("VersionDescription", js.undefined)
  }
}
