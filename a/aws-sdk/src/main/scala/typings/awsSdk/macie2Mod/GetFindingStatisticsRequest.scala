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
  def apply(groupBy: GroupBy): GetFindingStatisticsRequest = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingStatisticsRequest]
  }
  @scala.inline
  implicit class GetFindingStatisticsRequestOps[Self <: GetFindingStatisticsRequest] (val x: Self) extends AnyVal {
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
    def setGroupBy(value: GroupBy): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("findingCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingCriteria: Self = this.set("findingCriteria", js.undefined)
    @scala.inline
    def setSize(value: integer): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSortCriteria(value: FindingStatisticsSortCriteria): Self = this.set("sortCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCriteria: Self = this.set("sortCriteria", js.undefined)
  }
  
}

