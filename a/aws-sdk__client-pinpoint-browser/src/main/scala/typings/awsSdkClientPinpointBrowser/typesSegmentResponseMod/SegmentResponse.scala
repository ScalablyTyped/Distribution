package typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DIMENSIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.IMPORT
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.SegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentResponse extends js.Object {
  /**
    * The ID of the application that the segment applies to.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The unique segment ID.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The import job settings.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.native
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  /**
    * The segment type:
    * DIMENSIONAL - A dynamic segment built from selection criteria based on endpoint data reported by your app. You create this type of segment by using the segment builder in the Amazon Pinpoint console or by making a POST request to the segments resource.
    * IMPORT - A static segment built from an imported set of endpoint definitions. You create this type of segment by importing a segment in the Amazon Pinpoint console or by making a POST request to the jobs/import resource.
    */
  var SegmentType: js.UndefOr[DIMENSIONAL | IMPORT | String] = js.native
  /**
    * The segment version number.
    */
  var Version: js.UndefOr[Double] = js.native
}

object SegmentResponse {
  @scala.inline
  def apply(): SegmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentResponse]
  }
  @scala.inline
  implicit class SegmentResponseOps[Self <: SegmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDimensions(value: SegmentDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setImportDefinition(value: SegmentImportResource): Self = this.set("ImportDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportDefinition: Self = this.set("ImportDefinition", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSegmentGroups(value: SegmentGroupList): Self = this.set("SegmentGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentGroups: Self = this.set("SegmentGroups", js.undefined)
    @scala.inline
    def setSegmentType(value: DIMENSIONAL | IMPORT | String): Self = this.set("SegmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentType: Self = this.set("SegmentType", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

