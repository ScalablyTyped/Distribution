package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionDescription extends StObject {
  
  /**
    * The desired number of domain controllers in the specified Region for the specified directory.
    */
  var DesiredNumberOfDomainControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.DesiredNumberOfDomainControllers] = js.undefined
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The date and time that the Region description was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.undefined
  
  /**
    * Specifies when the Region replication began.
    */
  var LaunchTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LaunchTime] = js.undefined
  
  /**
    * The name of the Region. For example, us-east-1.
    */
  var RegionName: js.UndefOr[typings.awsSdk.directoryserviceMod.RegionName] = js.undefined
  
  /**
    * Specifies if the Region is the primary Region or an additional Region.
    */
  var RegionType: js.UndefOr[typings.awsSdk.directoryserviceMod.RegionType] = js.undefined
  
  /**
    * The status of the replication process for the specified Region.
    */
  var Status: js.UndefOr[DirectoryStage] = js.undefined
  
  /**
    * The date and time that the Region status was last updated.
    */
  var StatusLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime] = js.undefined
  
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined
}
object RegionDescription {
  
  inline def apply(): RegionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDescription]
  }
  
  extension [Self <: RegionDescription](x: Self) {
    
    inline def setDesiredNumberOfDomainControllers(value: DesiredNumberOfDomainControllers): Self = StObject.set(x, "DesiredNumberOfDomainControllers", value.asInstanceOf[js.Any])
    
    inline def setDesiredNumberOfDomainControllersUndefined: Self = StObject.set(x, "DesiredNumberOfDomainControllers", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    inline def setLaunchTime(value: LaunchTime): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    inline def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setRegionType(value: RegionType): Self = StObject.set(x, "RegionType", value.asInstanceOf[js.Any])
    
    inline def setRegionTypeUndefined: Self = StObject.set(x, "RegionType", js.undefined)
    
    inline def setStatus(value: DirectoryStage): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusLastUpdatedDateTime(value: StateLastUpdatedDateTime): Self = StObject.set(x, "StatusLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setStatusLastUpdatedDateTimeUndefined: Self = StObject.set(x, "StatusLastUpdatedDateTime", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcSettings(value: DirectoryVpcSettings): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcSettingsUndefined: Self = StObject.set(x, "VpcSettings", js.undefined)
  }
}
