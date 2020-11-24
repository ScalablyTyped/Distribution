package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePackagingConfigurationRequest extends js.Object {
  
  var CmafPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.CmafPackage] = js.native
  
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.DashPackage] = js.native
  
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.HlsPackage] = js.native
  
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: string = js.native
  
  var MssPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.MssPackage] = js.native
  
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: string = js.native
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}
object CreatePackagingConfigurationRequest {
  
  @scala.inline
  def apply(Id: string, PackagingGroupId: string): CreatePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreatePackagingConfigurationRequestOps[Self <: CreatePackagingConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = this.set("PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmafPackage(value: CmafPackage): Self = this.set("CmafPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmafPackage: Self = this.set("CmafPackage", js.undefined)
    
    @scala.inline
    def setDashPackage(value: DashPackage): Self = this.set("DashPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashPackage: Self = this.set("DashPackage", js.undefined)
    
    @scala.inline
    def setHlsPackage(value: HlsPackage): Self = this.set("HlsPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHlsPackage: Self = this.set("HlsPackage", js.undefined)
    
    @scala.inline
    def setMssPackage(value: MssPackage): Self = this.set("MssPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMssPackage: Self = this.set("MssPackage", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
