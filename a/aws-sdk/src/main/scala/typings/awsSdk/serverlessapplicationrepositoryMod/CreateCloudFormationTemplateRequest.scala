package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCloudFormationTemplateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
}

object CreateCloudFormationTemplateRequest {
  @scala.inline
  def apply(ApplicationId: string, SemanticVersion: string = null): CreateCloudFormationTemplateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationTemplateRequest]
  }
}

