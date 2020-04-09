package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateServiceLastAccessedDetailsResponse extends js.Object {
  /**
    * The JobId that you can use in the GetServiceLastAccessedDetails or GetServiceLastAccessedDetailsWithEntities operations. The JobId returned by GenerateServiceLastAccessedDetail must be used by the same role within a session, or by the same user when used to call GetServiceLastAccessedDetail.
    */
  var JobId: js.UndefOr[jobIDType] = js.native
}

object GenerateServiceLastAccessedDetailsResponse {
  @scala.inline
  def apply(JobId: jobIDType = null): GenerateServiceLastAccessedDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateServiceLastAccessedDetailsResponse]
  }
}

