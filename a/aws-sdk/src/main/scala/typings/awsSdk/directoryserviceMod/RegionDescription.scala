package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionDescription extends js.Object {
  
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
  implicit class RegionDescriptionOps[Self <: RegionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDesiredNumberOfDomainControllers(value: DesiredNumberOfDomainControllers): Self = this.set("DesiredNumberOfDomainControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredNumberOfDomainControllers: Self = this.set("DesiredNumberOfDomainControllers", js.undefined)
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: LastUpdatedDateTime): Self = this.set("LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("LastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setLaunchTime(value: LaunchTime): Self = this.set("LaunchTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTime: Self = this.set("LaunchTime", js.undefined)
    
    @scala.inline
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionName: Self = this.set("RegionName", js.undefined)
    
    @scala.inline
    def setRegionType(value: RegionType): Self = this.set("RegionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionType: Self = this.set("RegionType", js.undefined)
    
    @scala.inline
    def setStatus(value: DirectoryStage): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusLastUpdatedDateTime(value: StateLastUpdatedDateTime): Self = this.set("StatusLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusLastUpdatedDateTime: Self = this.set("StatusLastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setVpcSettings(value: DirectoryVpcSettings): Self = this.set("VpcSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSettings: Self = this.set("VpcSettings", js.undefined)
  }
}
