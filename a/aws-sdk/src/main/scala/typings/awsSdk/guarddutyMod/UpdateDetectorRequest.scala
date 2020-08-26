package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorRequest extends js.Object {
  /**
    * An object that describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.native
  /**
    * The unique ID of the detector to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  /**
    * Specifies whether the detector is enabled or not enabled.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
}

object UpdateDetectorRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
  @scala.inline
  implicit class UpdateDetectorRequestOps[Self <: UpdateDetectorRequest] (val x: Self) extends AnyVal {
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
    def setDataSources(value: DataSourceConfigurations): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("Enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("Enable", js.undefined)
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = this.set("FindingPublishingFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingPublishingFrequency: Self = this.set("FindingPublishingFrequency", js.undefined)
  }
  
}

