package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceUpdate extends js.Object {
  /**
    * Indicates whether the service update will be automatically applied once the recommended apply-by date has expired. 
    */
  var AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The estimated length of time the service update will take
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.native
  /**
    * Provides details of the service update
    */
  var ServiceUpdateDescription: js.UndefOr[String] = js.native
  /**
    * The date after which the service update is no longer available
    */
  var ServiceUpdateEndDate: js.UndefOr[TStamp] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  /**
    * The recommendend date to apply the service update in order to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp] = js.native
  /**
    * The date when the service update is initially available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[TStamp] = js.native
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateSeverity] = js.native
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateStatus] = js.native
  /**
    * Reflects the nature of the service update
    */
  var ServiceUpdateType: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateType] = js.native
}

object ServiceUpdate {
  @scala.inline
  def apply(): ServiceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdate]
  }
  @scala.inline
  implicit class ServiceUpdateOps[Self <: ServiceUpdate] (val x: Self) extends AnyVal {
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
    def setAutoUpdateAfterRecommendedApplyByDate(value: BooleanOptional): Self = this.set("AutoUpdateAfterRecommendedApplyByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpdateAfterRecommendedApplyByDate: Self = this.set("AutoUpdateAfterRecommendedApplyByDate", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setEstimatedUpdateTime(value: String): Self = this.set("EstimatedUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedUpdateTime: Self = this.set("EstimatedUpdateTime", js.undefined)
    @scala.inline
    def setServiceUpdateDescription(value: String): Self = this.set("ServiceUpdateDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateDescription: Self = this.set("ServiceUpdateDescription", js.undefined)
    @scala.inline
    def setServiceUpdateEndDate(value: TStamp): Self = this.set("ServiceUpdateEndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateEndDate: Self = this.set("ServiceUpdateEndDate", js.undefined)
    @scala.inline
    def setServiceUpdateName(value: String): Self = this.set("ServiceUpdateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateName: Self = this.set("ServiceUpdateName", js.undefined)
    @scala.inline
    def setServiceUpdateRecommendedApplyByDate(value: TStamp): Self = this.set("ServiceUpdateRecommendedApplyByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateRecommendedApplyByDate: Self = this.set("ServiceUpdateRecommendedApplyByDate", js.undefined)
    @scala.inline
    def setServiceUpdateReleaseDate(value: TStamp): Self = this.set("ServiceUpdateReleaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateReleaseDate: Self = this.set("ServiceUpdateReleaseDate", js.undefined)
    @scala.inline
    def setServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = this.set("ServiceUpdateSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateSeverity: Self = this.set("ServiceUpdateSeverity", js.undefined)
    @scala.inline
    def setServiceUpdateStatus(value: ServiceUpdateStatus): Self = this.set("ServiceUpdateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateStatus: Self = this.set("ServiceUpdateStatus", js.undefined)
    @scala.inline
    def setServiceUpdateType(value: ServiceUpdateType): Self = this.set("ServiceUpdateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUpdateType: Self = this.set("ServiceUpdateType", js.undefined)
  }
  
}

