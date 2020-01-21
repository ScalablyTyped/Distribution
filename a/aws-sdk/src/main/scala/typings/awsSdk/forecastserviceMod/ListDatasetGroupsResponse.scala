package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDatasetGroupsResponse extends js.Object {
  /**
    * An array of objects that summarize each dataset group's properties.
    */
  var DatasetGroups: js.UndefOr[typings.awsSdk.forecastserviceMod.DatasetGroups] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListDatasetGroupsResponse {
  @scala.inline
  def apply(DatasetGroups: DatasetGroups = null, NextToken: NextToken = null): ListDatasetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetGroups != null) __obj.updateDynamic("DatasetGroups")(DatasetGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetGroupsResponse]
  }
}

