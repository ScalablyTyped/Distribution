package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDescription extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationArn] = js.native
  
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * The names of the configuration templates associated with this application.
    */
  var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.native
  
  /**
    * The date when the application was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  
  /**
    * The date when the application was last modified.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  
  /**
    * User-defined description of the application.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  
  /**
    * The lifecycle settings for the application.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
  
  /**
    * The names of the versions for this application.
    */
  var Versions: js.UndefOr[VersionLabelsList] = js.native
}
object ApplicationDescription {
  
  @scala.inline
  def apply(): ApplicationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescription]
  }
  
  @scala.inline
  implicit class ApplicationDescriptionOps[Self <: ApplicationDescription] (val x: Self) extends AnyVal {
    
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
    def setApplicationArn(value: ApplicationArn): Self = this.set("ApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationArn: Self = this.set("ApplicationArn", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    
    @scala.inline
    def setConfigurationTemplatesVarargs(value: ConfigurationTemplateName*): Self = this.set("ConfigurationTemplates", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationTemplates(value: ConfigurationTemplateNamesList): Self = this.set("ConfigurationTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationTemplates: Self = this.set("ConfigurationTemplates", js.undefined)
    
    @scala.inline
    def setDateCreated(value: CreationDate): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: UpdateDate): Self = this.set("DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateUpdated: Self = this.set("DateUpdated", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = this.set("ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLifecycleConfig: Self = this.set("ResourceLifecycleConfig", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: VersionLabel*): Self = this.set("Versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: VersionLabelsList): Self = this.set("Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
}
