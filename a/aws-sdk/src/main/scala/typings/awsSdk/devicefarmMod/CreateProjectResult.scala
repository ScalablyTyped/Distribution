package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResult extends js.Object {
  /**
    * The newly created project.
    */
  var project: js.UndefOr[Project] = js.native
}

object CreateProjectResult {
  @scala.inline
  def apply(project: Project = null): CreateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResult]
  }
}

