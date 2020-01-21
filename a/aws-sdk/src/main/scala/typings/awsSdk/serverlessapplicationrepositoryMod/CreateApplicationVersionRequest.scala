package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    ApplicationId: string,
    SemanticVersion: string,
    SourceCodeArchiveUrl: string = null,
    SourceCodeUrl: string = null,
    TemplateBody: string = null,
    TemplateUrl: string = null
  ): CreateApplicationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    if (SourceCodeArchiveUrl != null) __obj.updateDynamic("SourceCodeArchiveUrl")(SourceCodeArchiveUrl.asInstanceOf[js.Any])
    if (SourceCodeUrl != null) __obj.updateDynamic("SourceCodeUrl")(SourceCodeUrl.asInstanceOf[js.Any])
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody.asInstanceOf[js.Any])
    if (TemplateUrl != null) __obj.updateDynamic("TemplateUrl")(TemplateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionRequest]
  }
}

