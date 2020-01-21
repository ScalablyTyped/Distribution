package typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DIMENSIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.IMPORT
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.UnmarshalledSegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentResponse extends SegmentResponse {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentDimensions] = js.undefined
  /**
    * The import job settings.
    */
  @JSName("ImportDefinition")
  var ImportDefinition_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentImportResource] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  @JSName("SegmentGroups")
  var SegmentGroups_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentGroupList] = js.undefined
}

object UnmarshalledSegmentResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    Dimensions: UnmarshalledSegmentDimensions = null,
    Id: String = null,
    ImportDefinition: UnmarshalledSegmentImportResource = null,
    LastModifiedDate: String = null,
    Name: String = null,
    SegmentGroups: UnmarshalledSegmentGroupList = null,
    SegmentType: DIMENSIONAL | IMPORT | String = null,
    Version: Int | Double = null
  ): UnmarshalledSegmentResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ImportDefinition != null) __obj.updateDynamic("ImportDefinition")(ImportDefinition.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups.asInstanceOf[js.Any])
    if (SegmentType != null) __obj.updateDynamic("SegmentType")(SegmentType.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentResponse]
  }
}

