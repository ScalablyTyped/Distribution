package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivitiesRequest extends StObject {
  
  /**
    * Specifies which activity types to include in the response. If this field is left empty, all activity types are returned.
    */
  var ActivityTypes: js.UndefOr[ActivityNamesFilterType] = js.undefined
  
  /**
    * Amazon WorkDocs authentication token. Not required when using AWS administrator credentials to access the API.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  
  /**
    * The timestamp that determines the end time of the activities. The response includes the activities performed before the specified timestamp.
    */
  var EndTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * Includes indirect activities. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IncludeIndirectActivities: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * The ID of the organization. This is a mandatory parameter when using administrative API (SigV4) requests.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The document or folder ID for which to describe activity types.
    */
  var ResourceId: js.UndefOr[IdType] = js.undefined
  
  /**
    * The timestamp that determines the starting time of the activities. The response includes the activities performed after the specified timestamp.
    */
  var StartTime: js.UndefOr[TimestampType] = js.undefined
  
  /**
    * The ID of the user who performed the action. The response includes activities pertaining to this user. This is an optional parameter and is only applicable for administrative API (SigV4) requests.
    */
  var UserId: js.UndefOr[IdType] = js.undefined
}
object DescribeActivitiesRequest {
  
  inline def apply(): DescribeActivitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivitiesRequest]
  }
  
  extension [Self <: DescribeActivitiesRequest](x: Self) {
    
    inline def setActivityTypes(value: ActivityNamesFilterType): Self = StObject.set(x, "ActivityTypes", value.asInstanceOf[js.Any])
    
    inline def setActivityTypesUndefined: Self = StObject.set(x, "ActivityTypes", js.undefined)
    
    inline def setAuthenticationToken(value: AuthenticationHeaderType): Self = StObject.set(x, "AuthenticationToken", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTokenUndefined: Self = StObject.set(x, "AuthenticationToken", js.undefined)
    
    inline def setEndTime(value: TimestampType): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setIncludeIndirectActivities(value: BooleanType): Self = StObject.set(x, "IncludeIndirectActivities", value.asInstanceOf[js.Any])
    
    inline def setIncludeIndirectActivitiesUndefined: Self = StObject.set(x, "IncludeIndirectActivities", js.undefined)
    
    inline def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setOrganizationId(value: IdType): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setResourceId(value: IdType): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setStartTime(value: TimestampType): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setUserId(value: IdType): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
