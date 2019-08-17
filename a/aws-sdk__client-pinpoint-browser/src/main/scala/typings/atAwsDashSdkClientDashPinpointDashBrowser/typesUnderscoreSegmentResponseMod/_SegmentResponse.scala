package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentResponseMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.DIMENSIONAL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.IMPORT
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod._SegmentDimensions
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupListMod._SegmentGroupList
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentImportResourceMod._SegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentResponse extends js.Object {
  /**
    * The ID of the application that the segment applies to.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[_SegmentDimensions] = js.undefined
  /**
    * The unique segment ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The import job settings.
    */
  var ImportDefinition: js.UndefOr[_SegmentImportResource] = js.undefined
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  var SegmentGroups: js.UndefOr[_SegmentGroupList] = js.undefined
  /**
    * The segment type:
    * DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
    * IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
    */
  var SegmentType: js.UndefOr[DIMENSIONAL | IMPORT | String] = js.undefined
  /**
    * The segment version number.
    */
  var Version: js.UndefOr[Double] = js.undefined
}

object _SegmentResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    Dimensions: _SegmentDimensions = null,
    Id: String = null,
    ImportDefinition: _SegmentImportResource = null,
    LastModifiedDate: String = null,
    Name: String = null,
    SegmentGroups: _SegmentGroupList = null,
    SegmentType: DIMENSIONAL | IMPORT | String = null,
    Version: Int | Double = null
  ): _SegmentResponse = {
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
    __obj.asInstanceOf[_SegmentResponse]
  }
}

