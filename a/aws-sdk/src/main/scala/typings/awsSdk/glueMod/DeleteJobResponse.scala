package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobResponse extends js.Object {
  /**
    * The name of the job definition that was deleted.
    */
  var JobName: js.UndefOr[NameString] = js.native
}

object DeleteJobResponse {
  @scala.inline
  def apply(JobName: NameString = null): DeleteJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobName != null) __obj.updateDynamic("JobName")(JobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobResponse]
  }
}

