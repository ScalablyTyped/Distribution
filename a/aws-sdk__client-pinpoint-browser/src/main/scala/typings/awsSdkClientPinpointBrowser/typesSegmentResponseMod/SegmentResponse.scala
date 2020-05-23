package typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DIMENSIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.IMPORT
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.SegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentResponse extends js.Object {
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
  var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
  /**
    * The unique segment ID.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The import job settings.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.undefined
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
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
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

object SegmentResponse {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    CreationDate: String = null,
    Dimensions: SegmentDimensions = null,
    Id: String = null,
    ImportDefinition: SegmentImportResource = null,
    LastModifiedDate: String = null,
    Name: String = null,
    SegmentGroups: SegmentGroupList = null,
    SegmentType: DIMENSIONAL | IMPORT | String = null,
    Version: js.UndefOr[Double] = js.undefined
  ): SegmentResponse = {
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
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentResponse]
  }
}

