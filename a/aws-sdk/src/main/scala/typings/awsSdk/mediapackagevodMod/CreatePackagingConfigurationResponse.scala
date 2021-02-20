package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePackagingConfigurationResponse extends StObject {
  
  /**
    * The ARN of the PackagingConfiguration.
    */
  var Arn: js.UndefOr[string] = js.native
  
  var CmafPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.CmafPackage] = js.native
  
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.DashPackage] = js.native
  
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.HlsPackage] = js.native
  
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: js.UndefOr[string] = js.native
  
  var MssPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.MssPackage] = js.native
  
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[string] = js.native
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.native
}
object CreatePackagingConfigurationResponse {
  
  @scala.inline
  def apply(): CreatePackagingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePackagingConfigurationResponse]
  }
  
  @scala.inline
  implicit class CreatePackagingConfigurationResponseMutableBuilder[Self <: CreatePackagingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCmafPackage(value: CmafPackage): Self = StObject.set(x, "CmafPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmafPackageUndefined: Self = StObject.set(x, "CmafPackage", js.undefined)
    
    @scala.inline
    def setDashPackage(value: DashPackage): Self = StObject.set(x, "DashPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashPackageUndefined: Self = StObject.set(x, "DashPackage", js.undefined)
    
    @scala.inline
    def setHlsPackage(value: HlsPackage): Self = StObject.set(x, "HlsPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsPackageUndefined: Self = StObject.set(x, "HlsPackage", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMssPackage(value: MssPackage): Self = StObject.set(x, "MssPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMssPackageUndefined: Self = StObject.set(x, "MssPackage", js.undefined)
    
    @scala.inline
    def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingGroupIdUndefined: Self = StObject.set(x, "PackagingGroupId", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
