package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePath extends js.Object {
  /**
    * The components of the resource path.
    */
  var Components: js.UndefOr[ResourcePathComponentList] = js.native
}

object ResourcePath {
  @scala.inline
  def apply(Components: ResourcePathComponentList = null): ResourcePath = {
    val __obj = js.Dynamic.literal()
    if (Components != null) __obj.updateDynamic("Components")(Components.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePath]
  }
}

