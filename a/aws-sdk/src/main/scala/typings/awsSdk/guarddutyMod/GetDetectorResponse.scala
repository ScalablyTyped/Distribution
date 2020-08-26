package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorResponse extends js.Object {
  /**
    * The timestamp of when the detector was created.
    */
  var CreatedAt: js.UndefOr[String] = js.native
  /**
    * An object that describes which data sources are enabled for the detector.
    */
  var DataSources: js.UndefOr[DataSourceConfigurationsResult] = js.native
  /**
    * The publishing frequency of the finding.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  /**
    * The GuardDuty service role.
    */
  var ServiceRole: String = js.native
  /**
    * The detector status.
    */
  var Status: DetectorStatus = js.native
  /**
    * The tags of the detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * The last-updated timestamp for the detector.
    */
  var UpdatedAt: js.UndefOr[String] = js.native
}

object GetDetectorResponse {
  @scala.inline
  def apply(ServiceRole: String, Status: DetectorStatus): GetDetectorResponse = {
    val __obj = js.Dynamic.literal(ServiceRole = ServiceRole.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorResponse]
  }
  @scala.inline
  implicit class GetDetectorResponseOps[Self <: GetDetectorResponse] (val x: Self) extends AnyVal {
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
    def setServiceRole(value: String): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DetectorStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDataSources(value: DataSourceConfigurationsResult): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = this.set("FindingPublishingFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingPublishingFrequency: Self = this.set("FindingPublishingFrequency", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUpdatedAt(value: String): Self = this.set("UpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("UpdatedAt", js.undefined)
  }
  
}

