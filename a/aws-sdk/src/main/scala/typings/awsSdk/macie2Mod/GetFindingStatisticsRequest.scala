package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingStatisticsRequest extends StObject {
  
  /**
    * The criteria to use to filter the query results.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.native
  
  /**
    * The finding property to use to group the query results. Valid values are: classificationDetails.jobId - The unique identifier for the classification job that produced the finding. resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to. severity.description - The severity level of the finding, such as High or Medium. type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
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
  implicit class GetFindingStatisticsRequestMutableBuilder[Self <: GetFindingStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
    
    @scala.inline
    def setGroupBy(value: GroupBy): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: FindingStatisticsSortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
