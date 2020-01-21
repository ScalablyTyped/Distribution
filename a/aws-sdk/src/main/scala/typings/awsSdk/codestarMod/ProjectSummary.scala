package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.native
  /**
    * The ID of the project.
    */
  var projectId: js.UndefOr[ProjectId] = js.native
}

object ProjectSummary {
  @scala.inline
  def apply(projectArn: ProjectArn = null, projectId: ProjectId = null): ProjectSummary = {
    val __obj = js.Dynamic.literal()
    if (projectArn != null) __obj.updateDynamic("projectArn")(projectArn.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSummary]
  }
}

