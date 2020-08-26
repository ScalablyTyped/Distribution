package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionSummary extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: string = js.native
  /**
    * The date and time this resource was created.
    */
  var CreationTime: string = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: string = js.native
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
}

object VersionSummary {
  @scala.inline
  def apply(ApplicationId: string, CreationTime: string, SemanticVersion: string): VersionSummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionSummary]
  }
  @scala.inline
  implicit class VersionSummaryOps[Self <: VersionSummary] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: string): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemanticVersion(value: string): Self = this.set("SemanticVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCodeUrl(value: string): Self = this.set("SourceCodeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCodeUrl: Self = this.set("SourceCodeUrl", js.undefined)
  }
  
}

