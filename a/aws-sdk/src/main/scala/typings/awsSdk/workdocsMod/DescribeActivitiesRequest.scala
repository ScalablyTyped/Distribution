package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActivitiesRequest extends js.Object {
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
  def apply(
    ActivityTypes: ActivityNamesFilterType = null,
    AuthenticationToken: AuthenticationHeaderType = null,
    EndTime: TimestampType = null,
    IncludeIndirectActivities: js.UndefOr[BooleanType] = js.undefined,
    Limit: js.UndefOr[LimitType] = js.undefined,
    Marker: MarkerType = null,
    OrganizationId: IdType = null,
    ResourceId: IdType = null,
    StartTime: TimestampType = null,
    UserId: IdType = null
  ): DescribeActivitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (ActivityTypes != null) __obj.updateDynamic("ActivityTypes")(ActivityTypes.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeIndirectActivities)) __obj.updateDynamic("IncludeIndirectActivities")(IncludeIndirectActivities.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActivitiesRequest]
  }
}

