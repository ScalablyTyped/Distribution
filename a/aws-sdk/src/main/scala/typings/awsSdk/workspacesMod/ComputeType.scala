package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeType extends js.Object {
  /**
    * The compute type.
    */
  var Name: js.UndefOr[Compute] = js.native
}

object ComputeType {
  @scala.inline
  def apply(Name: Compute = null): ComputeType = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeType]
  }
}

