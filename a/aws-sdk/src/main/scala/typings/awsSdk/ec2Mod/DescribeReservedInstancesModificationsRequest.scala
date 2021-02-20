package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesModificationsRequest extends StObject {
  
  /**
    * One or more filters.    client-token - The idempotency token for the modification request.    create-date - The time when the modification request was created.    effective-date - The time when the modification becomes effective.    modification-result.reserved-instances-id - The ID for the Reserved Instances created as part of the modification request. This ID is only available when the status of the modification is fulfilled.    modification-result.target-configuration.availability-zone - The Availability Zone for the new Reserved Instances.    modification-result.target-configuration.instance-count  - The number of new Reserved Instances.    modification-result.target-configuration.instance-type - The instance type of the new Reserved Instances.    modification-result.target-configuration.platform - The network platform of the new Reserved Instances (EC2-Classic | EC2-VPC).    reserved-instances-id - The ID of the Reserved Instances modified.    reserved-instances-modification-id - The ID of the modification request.    status - The status of the Reserved Instances modification request (processing | fulfilled | failed).    status-message - The reason for the status.    update-date - The time when the modification request was last updated.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * IDs for the submitted modification request.
    */
  var ReservedInstancesModificationIds: js.UndefOr[ReservedInstancesModificationIdStringList] = js.native
}
object DescribeReservedInstancesModificationsRequest {
  
  @scala.inline
  def apply(): DescribeReservedInstancesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesModificationsRequest]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesModificationsRequestMutableBuilder[Self <: DescribeReservedInstancesModificationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedInstancesModificationIds(value: ReservedInstancesModificationIdStringList): Self = StObject.set(x, "ReservedInstancesModificationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesModificationIdsUndefined: Self = StObject.set(x, "ReservedInstancesModificationIds", js.undefined)
    
    @scala.inline
    def setReservedInstancesModificationIdsVarargs(value: ReservedInstancesModificationId*): Self = StObject.set(x, "ReservedInstancesModificationIds", js.Array(value :_*))
  }
}
