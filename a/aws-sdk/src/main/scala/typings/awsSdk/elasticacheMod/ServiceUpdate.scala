package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceUpdate extends StObject {
  
  /**
    * Indicates whether the service update will be automatically applied once the recommended apply-by date has expired. 
    */
  var AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The estimated length of time the service update will take
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Provides details of the service update
    */
  var ServiceUpdateDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The date after which the service update is no longer available
    */
  var ServiceUpdateEndDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The recommendend date to apply the service update in order to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The date when the service update is initially available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateSeverity] = js.undefined
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateStatus] = js.undefined
  
  /**
    * Reflects the nature of the service update
    */
  var ServiceUpdateType: js.UndefOr[typings.awsSdk.elasticacheMod.ServiceUpdateType] = js.undefined
}
object ServiceUpdate {
  
  @scala.inline
  def apply(): ServiceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdate]
  }
  
  @scala.inline
  implicit class ServiceUpdateMutableBuilder[Self <: ServiceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdateAfterRecommendedApplyByDate(value: BooleanOptional): Self = StObject.set(x, "AutoUpdateAfterRecommendedApplyByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateAfterRecommendedApplyByDateUndefined: Self = StObject.set(x, "AutoUpdateAfterRecommendedApplyByDate", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setEstimatedUpdateTime(value: String): Self = StObject.set(x, "EstimatedUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedUpdateTimeUndefined: Self = StObject.set(x, "EstimatedUpdateTime", js.undefined)
    
    @scala.inline
    def setServiceUpdateDescription(value: String): Self = StObject.set(x, "ServiceUpdateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateDescriptionUndefined: Self = StObject.set(x, "ServiceUpdateDescription", js.undefined)
    
    @scala.inline
    def setServiceUpdateEndDate(value: TStamp): Self = StObject.set(x, "ServiceUpdateEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateEndDateUndefined: Self = StObject.set(x, "ServiceUpdateEndDate", js.undefined)
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    @scala.inline
    def setServiceUpdateRecommendedApplyByDate(value: TStamp): Self = StObject.set(x, "ServiceUpdateRecommendedApplyByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateRecommendedApplyByDateUndefined: Self = StObject.set(x, "ServiceUpdateRecommendedApplyByDate", js.undefined)
    
    @scala.inline
    def setServiceUpdateReleaseDate(value: TStamp): Self = StObject.set(x, "ServiceUpdateReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateReleaseDateUndefined: Self = StObject.set(x, "ServiceUpdateReleaseDate", js.undefined)
    
    @scala.inline
    def setServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = StObject.set(x, "ServiceUpdateSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateSeverityUndefined: Self = StObject.set(x, "ServiceUpdateSeverity", js.undefined)
    
    @scala.inline
    def setServiceUpdateStatus(value: ServiceUpdateStatus): Self = StObject.set(x, "ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateStatusUndefined: Self = StObject.set(x, "ServiceUpdateStatus", js.undefined)
    
    @scala.inline
    def setServiceUpdateType(value: ServiceUpdateType): Self = StObject.set(x, "ServiceUpdateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUpdateTypeUndefined: Self = StObject.set(x, "ServiceUpdateType", js.undefined)
  }
}
