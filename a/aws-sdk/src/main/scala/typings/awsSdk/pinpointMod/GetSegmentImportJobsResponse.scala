package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentImportJobsResponse extends js.Object {
  var ImportJobsResponse: typings.awsSdk.pinpointMod.ImportJobsResponse = js.native
}

object GetSegmentImportJobsResponse {
  @scala.inline
  def apply(ImportJobsResponse: ImportJobsResponse): GetSegmentImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSegmentImportJobsResponse]
  }
}

