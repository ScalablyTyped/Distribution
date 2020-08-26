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
  @scala.inline
  implicit class ListApplicationsResponseOps[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationSummariesVarargs(value: ApplicationSummary*): Self = this.set("ApplicationSummaries", js.Array(value :_*))
    @scala.inline
    def setApplicationSummaries(value: ApplicationSummaries): Self = this.set("ApplicationSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMoreApplications(value: BooleanObject): Self = this.set("HasMoreApplications", value.asInstanceOf[js.Any])
  }
  
}

