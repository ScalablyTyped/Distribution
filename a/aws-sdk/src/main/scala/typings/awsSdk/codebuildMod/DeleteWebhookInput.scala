package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWebhookInput extends js.Object {
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName = js.native
}

object DeleteWebhookInput {
  @scala.inline
  def apply(projectName: ProjectName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebhookInput]
  }
}

