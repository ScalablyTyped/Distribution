package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingStatisticsRequest extends js.Object {
  /**
    * The criteria to use to filter the query results.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  /**
    * The finding property to use to group the query results. Valid values are: classificationDetails.jobId - The unique identifier for the classification job that produced the finding. resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to. severity.description - The severity of the finding, such as High or Medium. type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
    */
  var groupBy: GroupBy = js.native
  /**
    * The maximum number of items to include in each page of the response.
    */
  var size: js.UndefOr[integer] = js.native
  /**
    * The criteria to use to sort the query results.
    */
  var sortCriteria: js.UndefOr[FindingStatisticsSortCriteria] = js.native
}

object GetFindingStatisticsRequest {
  @scala.inline
  def apply(
    groupBy: GroupBy,
    findingCriteria: FindingCriteria = null,
    size: js.UndefOr[integer] = js.undefined,
    sortCriteria: FindingStatisticsSortCriteria = null
  ): GetFindingStatisticsRequest = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    if (findingCriteria != null) __obj.updateDynamic("findingCriteria")(findingCriteria.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (sortCriteria != null) __obj.updateDynamic("sortCriteria")(sortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingStatisticsRequest]
  }
}

