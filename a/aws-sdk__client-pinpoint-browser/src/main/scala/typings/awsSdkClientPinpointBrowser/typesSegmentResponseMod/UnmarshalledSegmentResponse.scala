package typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod

import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod.UnmarshalledSegmentImportResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentResponse extends SegmentResponse {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentDimensions] = js.native
  /**
    * The import job settings.
    */
  @JSName("ImportDefinition")
  var ImportDefinition_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentImportResource] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments.
    */
  @JSName("SegmentGroups")
  var SegmentGroups_UnmarshalledSegmentResponse: js.UndefOr[UnmarshalledSegmentGroupList] = js.native
}

object UnmarshalledSegmentResponse {
  @scala.inline
  def apply(): UnmarshalledSegmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentResponse]
  }
  @scala.inline
  implicit class UnmarshalledSegmentResponseOps[Self <: UnmarshalledSegmentResponse] (val x: Self) extends AnyVal {
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
    def setDimensions(value: UnmarshalledSegmentDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setImportDefinition(value: UnmarshalledSegmentImportResource): Self = this.set("ImportDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportDefinition: Self = this.set("ImportDefinition", js.undefined)
    @scala.inline
    def setSegmentGroups(value: UnmarshalledSegmentGroupList): Self = this.set("SegmentGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentGroups: Self = this.set("SegmentGroups", js.undefined)
  }
  
}

