package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDescription extends StObject {
  
  /**
    * The desired number of domain controllers in the specified Region for the specified directory.
    */
  var DesiredNumberOfDomainControllers: js.UndefOr[typings.awsSdk.directoryserviceMod.DesiredNumberOfDomainControllers] = js.native
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  
  /**
    * The date and time that the Region description was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LastUpdatedDateTime] = js.native
  
  /**
    * Specifies when the Region replication began.
    */
  var LaunchTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LaunchTime] = js.native
  
  /**
    * The name of the Region. For example, us-east-1.
    */
  var RegionName: js.UndefOr[typings.awsSdk.directoryserviceMod.RegionName] = js.native
  
  /**
    * Specifies if the Region is the primary Region or an additional Region.
    */
  var RegionType: js.UndefOr[typings.awsSdk.directoryserviceMod.RegionType] = js.native
  
  /**
    * The status of the replication process for the specified Region.
    */
  var Status: js.UndefOr[DirectoryStage] = js.native
  
  /**
    * The date and time that the Region status was last updated.
    */
  var StatusLastUpdatedDateTime: js.UndefOr[StateLastUpdatedDateTime] = js.native
  
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.native
}
object RegionDescription {
  
  @scala.inline
  def apply(): RegionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionDescription]
  }
  
  @scala.inline
  implicit class RegionDescriptionMutableBuilder[Self <: RegionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredNumberOfDomainControllers(value: DesiredNumberOfDomainControllers): Self = StObject.set(x, "DesiredNumberOfDomainControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNumberOfDomainControllersUndefined: Self = StObject.set(x, "DesiredNumberOfDomainControllers", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setLaunchTime(value: LaunchTime): Self = StObject.set(x, "LaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTimeUndefined: Self = StObject.set(x, "LaunchTime", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    @scala.inline
    def setRegionType(value: RegionType): Self = StObject.set(x, "RegionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionTypeUndefined: Self = StObject.set(x, "RegionType", js.undefined)
    
    @scala.inline
    def setStatus(value: DirectoryStage): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLastUpdatedDateTime(value: StateLastUpdatedDateTime): Self = StObject.set(x, "StatusLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusLastUpdatedDateTimeUndefined: Self = StObject.set(x, "StatusLastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettings): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSettingsUndefined: Self = StObject.set(x, "VpcSettings", js.undefined)
  }
}
