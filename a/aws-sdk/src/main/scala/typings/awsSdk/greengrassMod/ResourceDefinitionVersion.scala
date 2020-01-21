package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDefinitionVersion extends js.Object {
  /**
    * A list of resources.
    */
  var Resources: js.UndefOr[listOfResource] = js.native
}

object ResourceDefinitionVersion {
  @scala.inline
  def apply(Resources: listOfResource = null): ResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDefinitionVersion]
  }
}

