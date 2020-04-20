package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationsRequest extends js.Object {
  /**
    * Configuration ID of an application to be deleted.
    */
  var configurationIds: ApplicationIdsList = js.native
}

object DeleteApplicationsRequest {
  @scala.inline
  def apply(configurationIds: ApplicationIdsList): DeleteApplicationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationsRequest]
  }
}

