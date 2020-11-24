package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationVersionRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  
  /**
    * The semantic version of the new version.
    */
  var SemanticVersion: string = js.native
  
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.native
  
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
  
  /**
    * The raw packaged AWS SAM template of your application.
    */
  var TemplateBody: js.UndefOr[string] = js.native
  
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}
object CreateApplicationVersionRequest {
  
  @scala.inline
  def apply(ApplicationId: string, SemanticVersion: string): CreateApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionRequest]
  }
  
  @scala.inline
  implicit class CreateApplicationVersionRequestOps[Self <: CreateApplicationVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeArchiveUrl(value: string): Self = this.set("SourceCodeArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeArchiveUrl: Self = this.set("SourceCodeArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceCodeUrl(value: string): Self = this.set("SourceCodeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeUrl: Self = this.set("SourceCodeUrl", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: string): Self = this.set("TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateBody: Self = this.set("TemplateBody", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: string): Self = this.set("TemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("TemplateUrl", js.undefined)
  }
}
