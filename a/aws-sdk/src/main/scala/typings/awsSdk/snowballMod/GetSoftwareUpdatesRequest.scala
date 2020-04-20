package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSoftwareUpdatesRequest extends js.Object {
  /**
    * The ID for a job that you want to get the software update file for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId = js.native
}

object GetSoftwareUpdatesRequest {
  @scala.inline
  def apply(JobId: JobId): GetSoftwareUpdatesRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSoftwareUpdatesRequest]
  }
}

