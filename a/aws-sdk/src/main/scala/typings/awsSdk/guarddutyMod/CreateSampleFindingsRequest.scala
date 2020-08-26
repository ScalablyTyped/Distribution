package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSampleFindingsRequest extends js.Object {
  /**
    * The ID of the detector to create sample findings for.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * The types of sample findings to generate.
    */
  var FindingTypes: js.UndefOr[typings.awsSdk.guarddutyMod.FindingTypes] = js.native
}

object CreateSampleFindingsRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  @scala.inline
  implicit class CreateSampleFindingsRequestOps[Self <: CreateSampleFindingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindingTypesVarargs(value: FindingType*): Self = this.set("FindingTypes", js.Array(value :_*))
    @scala.inline
    def setFindingTypes(value: FindingTypes): Self = this.set("FindingTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingTypes: Self = this.set("FindingTypes", js.undefined)
  }
  
}

