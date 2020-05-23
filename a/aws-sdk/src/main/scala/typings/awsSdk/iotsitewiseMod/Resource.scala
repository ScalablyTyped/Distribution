package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * A portal resource.
    */
  var portal: js.UndefOr[PortalResource] = js.native
  /**
    * A project resource.
    */
  var project: js.UndefOr[ProjectResource] = js.native
}

object Resource {
  @scala.inline
  def apply(portal: PortalResource = null, project: ProjectResource = null): Resource = {
    val __obj = js.Dynamic.literal()
    if (portal != null) __obj.updateDynamic("portal")(portal.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

