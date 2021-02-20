package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBundleTasksRequest extends StObject {
  
  /**
    * The bundle task IDs. Default: Describes all your bundle tasks.
    */
  var BundleIds: js.UndefOr[BundleIdStringList] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    bundle-id - The ID of the bundle task.    error-code - If the task failed, the error code returned.    error-message - If the task failed, the error message returned.    instance-id - The ID of the instance.    progress - The level of task completion, as a percentage (for example, 20%).    s3-bucket - The Amazon S3 bucket to store the AMI.    s3-prefix - The beginning of the AMI name.    start-time - The time the task started (for example, 2013-09-15T17:15:20.000Z).    state - The state of the task (pending | waiting-for-shutdown | bundling | storing | cancelling | complete | failed).    update-time - The time of the most recent update for the task.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
}
object DescribeBundleTasksRequest {
  
  @scala.inline
  def apply(): DescribeBundleTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleTasksRequest]
  }
  
  @scala.inline
  implicit class DescribeBundleTasksRequestMutableBuilder[Self <: DescribeBundleTasksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleIds(value: BundleIdStringList): Self = StObject.set(x, "BundleIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdsUndefined: Self = StObject.set(x, "BundleIds", js.undefined)
    
    @scala.inline
    def setBundleIdsVarargs(value: BundleId*): Self = StObject.set(x, "BundleIds", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
  }
}
