package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeActivitiesRequest extends StObject {
  
  /**
    * Specifies which activity types to include in the response. If this field is left empty, all activity types are returned.
    */
  var ActivityTypes: js.UndefOr[ActivityNamesFilterType] = js.native
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  
  /**
    * The timestamp that determines the end time of the activities. The response includes the activities performed before the specified timestamp.
    */
  var EndTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * Includes indirect activities. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IncludeIndirectActivities: js.UndefOr[BooleanType] = js.native
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
  
  /**
    * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
    */
  var OrganizationId: js.UndefOr[IdType] = js.native
  
  /**
    * The document or folder ID for which to describe activity types.
    */
  var ResourceId: js.UndefOr[IdType] = js.native
  
  /**
    * The timestamp that determines the starting time of the activities. The response includes the activities performed after the specified timestamp.
    */
  var StartTime: js.UndefOr[TimestampType] = js.native
  
  /**
    * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an optional parameter and is only applicable for administrative API (SigV4) requests.
    */
  var UserId: js.UndefOr[IdType] = js.native
}
object DescribeActivitiesRequest {
  
  @scala.inline
  def apply(): DescribeActivitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivitiesRequest]
  }
  
  @scala.inline
  implicit class DescribeActivitiesRequestMutableBuilder[Self <: DescribeActivitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityTypes(value: ActivityNamesFilterType): Self = StObject.set(x, "ActivityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypesUndefined: Self = StObject.set(x, "ActivityTypes", js.undefined)
    
    @scala.inline
    def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setIncludeIndirectActivities(value: BooleanType): Self = StObject.set(x, "IncludeIndirectActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeIndirectActivitiesUndefined: Self = StObject.set(x, "IncludeIndirectActivities", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    @scala.inline
    def setResourceId(value: IdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setUserId(value: IdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
