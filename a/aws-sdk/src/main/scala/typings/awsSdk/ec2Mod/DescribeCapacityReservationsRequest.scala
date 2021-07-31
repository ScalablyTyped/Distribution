package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCapacityReservationsRequest extends StObject {
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationIds: js.UndefOr[CapacityReservationIdSet] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    instance-type - The type of instance for which the Capacity Reservation reserves capacity.    owner-id - The ID of the AWS account that owns the Capacity Reservation.    availability-zone-id - The Availability Zone ID of the Capacity Reservation.    instance-platform - The type of operating system for which the Capacity Reservation reserves capacity.    availability-zone - The Availability Zone ID of the Capacity Reservation.    tenancy - Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy settings:    default - The Capacity Reservation is created on hardware that is shared with other AWS accounts.    dedicated - The Capacity Reservation is created on single-tenant hardware that is dedicated to a single AWS account.      state - The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:    active- The Capacity Reservation is active and the capacity is available for your use.    expired - The Capacity Reservation expired automatically at the date and time specified in your request. The reserved capacity is no longer available for your use.    cancelled - The Capacity Reservation was manually cancelled. The reserved capacity is no longer available for your use.    pending - The Capacity Reservation request was successful but the capacity provisioning is still pending.    failed - The Capacity Reservation request has failed. A request might fail due to invalid request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.      end-date - The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time.    end-date-type - Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it.    limited - The Capacity Reservation expires automatically at a specified date and time.      instance-match-criteria - Indicates the type of instance launches that the Capacity Reservation accepts. The options include:    open - The Capacity Reservation accepts all instances that have matching attributes (instance type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation automatically without specifying any additional parameters.    targeted - The Capacity Reservation only accepts instances that have matching attributes (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only permitted instances can use the reserved capacity.    
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[DescribeCapacityReservationsMaxResults] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCapacityReservationsRequest {
  
  @scala.inline
  def apply(): DescribeCapacityReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityReservationsRequest]
  }
  
  @scala.inline
  implicit class DescribeCapacityReservationsRequestMutableBuilder[Self <: DescribeCapacityReservationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationIds(value: CapacityReservationIdSet): Self = StObject.set(x, "CapacityReservationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationIdsUndefined: Self = StObject.set(x, "CapacityReservationIds", js.undefined)
    
    @scala.inline
    def setCapacityReservationIdsVarargs(value: CapacityReservationId*): Self = StObject.set(x, "CapacityReservationIds", js.Array(value :_*))
    
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
    
    @scala.inline
    def setMaxResults(value: DescribeCapacityReservationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
