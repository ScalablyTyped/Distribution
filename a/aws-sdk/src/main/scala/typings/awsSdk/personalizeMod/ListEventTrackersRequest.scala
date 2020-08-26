package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTrackersRequest extends js.Object {
  /**
    * The ARN of a dataset group used to filter the response.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The maximum number of event trackers to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListEventTrackers for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListEventTrackersRequest {
  @scala.inline
  def apply(): ListEventTrackersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTrackersRequest]
  }
  @scala.inline
  implicit class ListEventTrackersRequestOps[Self <: ListEventTrackersRequest] (val x: Self) extends AnyVal {
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
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("datasetGroupArn", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

