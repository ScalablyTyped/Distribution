package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectResult extends js.Object {
  /**
    *  Detailed information about the updated AWS Mobile Hub project. 
    */
  var details: js.UndefOr[ProjectDetails] = js.native
}

object UpdateProjectResult {
  @scala.inline
  def apply(details: ProjectDetails = null): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectResult]
  }
}

