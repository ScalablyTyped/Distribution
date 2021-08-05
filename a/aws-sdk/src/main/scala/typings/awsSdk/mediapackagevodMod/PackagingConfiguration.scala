package typings.awsSdk.mediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagingConfiguration extends StObject {
  
  /**
    * The ARN of the PackagingConfiguration.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  var CmafPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.CmafPackage] = js.undefined
  
  var DashPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.DashPackage] = js.undefined
  
  var HlsPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.HlsPackage] = js.undefined
  
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  var MssPackage: js.UndefOr[typings.awsSdk.mediapackagevodMod.MssPackage] = js.undefined
  
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[string] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackagevodMod.Tags] = js.undefined
}
object PackagingConfiguration {
  
  inline def apply(): PackagingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagingConfiguration]
  }
  
  extension [Self <: PackagingConfiguration](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCmafPackage(value: CmafPackage): Self = StObject.set(x, "CmafPackage", value.asInstanceOf[js.Any])
    
    inline def setCmafPackageUndefined: Self = StObject.set(x, "CmafPackage", js.undefined)
    
    inline def setDashPackage(value: DashPackage): Self = StObject.set(x, "DashPackage", value.asInstanceOf[js.Any])
    
    inline def setDashPackageUndefined: Self = StObject.set(x, "DashPackage", js.undefined)
    
    inline def setHlsPackage(value: HlsPackage): Self = StObject.set(x, "HlsPackage", value.asInstanceOf[js.Any])
    
    inline def setHlsPackageUndefined: Self = StObject.set(x, "HlsPackage", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMssPackage(value: MssPackage): Self = StObject.set(x, "MssPackage", value.asInstanceOf[js.Any])
    
    inline def setMssPackageUndefined: Self = StObject.set(x, "MssPackage", js.undefined)
    
    inline def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    inline def setPackagingGroupIdUndefined: Self = StObject.set(x, "PackagingGroupId", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
