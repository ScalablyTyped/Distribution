package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DIMENSIONAL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.IMPORT
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod._UnmarshalledSegmentDimensions
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupListMod._UnmarshalledSegmentGroupList
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentImportResourceMod._UnmarshalledSegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentResponse extends _SegmentResponse {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions__UnmarshalledSegmentResponse: js.UndefOr[_UnmarshalledSegmentDimensions] = js.undefined
  /**
    * The import job settings.
    */
  @JSName("ImportDefinition")
  var ImportDefinition__UnmarshalledSegmentResponse: js.UndefOr[_UnmarshalledSegmentImportResource] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  @JSName("SegmentGroups")
  var SegmentGroups__UnmarshalledSegmentResponse: js.UndefOr[_UnmarshalledSegmentGroupList] = js.undefined
}

object _UnmarshalledSegmentResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    Dimensions: _UnmarshalledSegmentDimensions = null,
    Id: String = null,
    ImportDefinition: _UnmarshalledSegmentImportResource = null,
    LastModifiedDate: String = null,
    Name: String = null,
    SegmentGroups: _UnmarshalledSegmentGroupList = null,
    SegmentType: DIMENSIONAL | IMPORT | String = null,
    Version: Int | Double = null
  ): _UnmarshalledSegmentResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (ImportDefinition != null) __obj.updateDynamic("ImportDefinition")(ImportDefinition)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups)
    if (SegmentType != null) __obj.updateDynamic("SegmentType")(SegmentType.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentResponse]
  }
}

