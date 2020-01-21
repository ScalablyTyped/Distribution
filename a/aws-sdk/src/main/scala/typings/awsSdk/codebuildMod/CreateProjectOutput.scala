package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectOutput extends js.Object {
  /**
    * Information about the build project that was created.
    */
  var project: js.UndefOr[Project] = js.native
}

object CreateProjectOutput {
  @scala.inline
  def apply(project: Project = null): CreateProjectOutput = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectOutput]
  }
}

