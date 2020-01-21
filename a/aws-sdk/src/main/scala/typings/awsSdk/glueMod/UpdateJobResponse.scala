package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobResponse extends js.Object {
  /**
    * Returns the name of the updated job definition.
    */
  var JobName: js.UndefOr[NameString] = js.native
}

object UpdateJobResponse {
  @scala.inline
  def apply(JobName: NameString = null): UpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobResponse]
  }
}

