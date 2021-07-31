package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerInstanceOption extends StObject {
  
  /**
    * The list of available az.
    */
  var AvailabilityZones: js.UndefOr[listOfAvailabilityZone] = js.undefined
  
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.undefined
  
  /**
    * The type of broker instance.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.undefined
  
  /**
    * The list of supported deployment modes.
    */
  var SupportedDeploymentModes: js.UndefOr[listOfDeploymentMode] = js.undefined
  
  /**
    * The list of supported engine versions.
    */
  var SupportedEngineVersions: js.UndefOr[listOfString] = js.undefined
}
object BrokerInstanceOption {
  
  @scala.inline
  def apply(): BrokerInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstanceOption]
  }
  
  @scala.inline
  implicit class BrokerInstanceOptionMutableBuilder[Self <: BrokerInstanceOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: listOfAvailabilityZone): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    @scala.inline
    def setStorageType(value: BrokerStorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setSupportedDeploymentModes(value: listOfDeploymentMode): Self = StObject.set(x, "SupportedDeploymentModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedDeploymentModesUndefined: Self = StObject.set(x, "SupportedDeploymentModes", js.undefined)
    
    @scala.inline
    def setSupportedDeploymentModesVarargs(value: DeploymentMode*): Self = StObject.set(x, "SupportedDeploymentModes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedEngineVersions(value: listOfString): Self = StObject.set(x, "SupportedEngineVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEngineVersionsUndefined: Self = StObject.set(x, "SupportedEngineVersions", js.undefined)
    
    @scala.inline
    def setSupportedEngineVersionsVarargs(value: string*): Self = StObject.set(x, "SupportedEngineVersions", js.Array(value :_*))
  }
}
