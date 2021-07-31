package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDetectorRequest extends StObject {
  
  /**
    * An object that describes which data sources will be updated.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.undefined
  
  /**
    * The unique ID of the detector to update.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * Specifies whether the detector is enabled or not enabled.
    */
  var Enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An enum value that specifies how frequently findings are exported, such as to CloudWatch Events.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.undefined
}
object UpdateDetectorRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): UpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorRequest]
  }
  
  @scala.inline
  implicit class UpdateDetectorRequestMutableBuilder[Self <: UpdateDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSources(value: DataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "FindingPublishingFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "FindingPublishingFrequency", js.undefined)
  }
}
