package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsResponse extends js.Object {
  /**
    * List of ApplicationSummary objects. 
    */
  var ApplicationSummaries: typings.awsSdk.kinesisanalyticsMod.ApplicationSummaries = js.native
  /**
    * Returns true if there are more applications to retrieve.
    */
  var HasMoreApplications: BooleanObject = js.native
}

object ListApplicationsResponse {
  @scala.inline
  def apply(ApplicationSummaries: ApplicationSummaries, HasMoreApplications: BooleanObject): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummaries = ApplicationSummaries.asInstanceOf[js.Any], HasMoreApplications = HasMoreApplications.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

