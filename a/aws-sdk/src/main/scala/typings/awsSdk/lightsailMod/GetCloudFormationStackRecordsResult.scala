package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFormationStackRecordsResult extends js.Object {
  /**
    * A list of objects describing the CloudFormation stack records.
    */
  var cloudFormationStackRecords: js.UndefOr[CloudFormationStackRecordList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetCloudFormationStackRecords request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetCloudFormationStackRecordsResult {
  @scala.inline
  def apply(cloudFormationStackRecords: CloudFormationStackRecordList = null, nextPageToken: String = null): GetCloudFormationStackRecordsResult = {
    val __obj = js.Dynamic.literal()
    if (cloudFormationStackRecords != null) __obj.updateDynamic("cloudFormationStackRecords")(cloudFormationStackRecords.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFormationStackRecordsResult]
  }
}

