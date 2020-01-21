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
  def apply(
    AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    EstimatedUpdateTime: String = null,
    ServiceUpdateDescription: String = null,
    ServiceUpdateEndDate: TStamp = null,
    ServiceUpdateName: String = null,
    ServiceUpdateRecommendedApplyByDate: TStamp = null,
    ServiceUpdateReleaseDate: TStamp = null,
    ServiceUpdateSeverity: ServiceUpdateSeverity = null,
    ServiceUpdateStatus: ServiceUpdateStatus = null,
    ServiceUpdateType: ServiceUpdateType = null
  ): ServiceUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoUpdateAfterRecommendedApplyByDate)) __obj.updateDynamic("AutoUpdateAfterRecommendedApplyByDate")(AutoUpdateAfterRecommendedApplyByDate.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (EstimatedUpdateTime != null) __obj.updateDynamic("EstimatedUpdateTime")(EstimatedUpdateTime.asInstanceOf[js.Any])
    if (ServiceUpdateDescription != null) __obj.updateDynamic("ServiceUpdateDescription")(ServiceUpdateDescription.asInstanceOf[js.Any])
    if (ServiceUpdateEndDate != null) __obj.updateDynamic("ServiceUpdateEndDate")(ServiceUpdateEndDate.asInstanceOf[js.Any])
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName.asInstanceOf[js.Any])
    if (ServiceUpdateRecommendedApplyByDate != null) __obj.updateDynamic("ServiceUpdateRecommendedApplyByDate")(ServiceUpdateRecommendedApplyByDate.asInstanceOf[js.Any])
    if (ServiceUpdateReleaseDate != null) __obj.updateDynamic("ServiceUpdateReleaseDate")(ServiceUpdateReleaseDate.asInstanceOf[js.Any])
    if (ServiceUpdateSeverity != null) __obj.updateDynamic("ServiceUpdateSeverity")(ServiceUpdateSeverity.asInstanceOf[js.Any])
    if (ServiceUpdateStatus != null) __obj.updateDynamic("ServiceUpdateStatus")(ServiceUpdateStatus.asInstanceOf[js.Any])
    if (ServiceUpdateType != null) __obj.updateDynamic("ServiceUpdateType")(ServiceUpdateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceUpdate]
  }
}

