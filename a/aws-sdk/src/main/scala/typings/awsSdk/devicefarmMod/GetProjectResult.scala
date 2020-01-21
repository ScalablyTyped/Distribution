package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProjectResult extends js.Object {
  /**
    * The project to get information about.
    */
  var project: js.UndefOr[Project] = js.native
}

object GetProjectResult {
  @scala.inline
  def apply(project: Project = null): GetProjectResult = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectResult]
  }
}

