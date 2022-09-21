package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StudioComponentConfiguration extends StObject {
  
  /**
    * The configuration for a Microsoft Active Directory (Microsoft AD) studio resource.
    */
  var activeDirectoryConfiguration: js.UndefOr[ActiveDirectoryConfiguration] = js.undefined
  
  /**
    * The configuration for a render farm that is associated with a studio resource.
    */
  var computeFarmConfiguration: js.UndefOr[ComputeFarmConfiguration] = js.undefined
  
  /**
    * The configuration for a license service that is associated with a studio resource.
    */
  var licenseServiceConfiguration: js.UndefOr[LicenseServiceConfiguration] = js.undefined
  
  /**
    * The configuration for a shared file storage system that is associated with a studio resource.
    */
  var sharedFileSystemConfiguration: js.UndefOr[SharedFileSystemConfiguration] = js.undefined
}
object StudioComponentConfiguration {
  
  inline def apply(): StudioComponentConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StudioComponentConfiguration]
  }
  
  extension [Self <: StudioComponentConfiguration](x: Self) {
    
    inline def setActiveDirectoryConfiguration(value: ActiveDirectoryConfiguration): Self = StObject.set(x, "activeDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "activeDirectoryConfiguration", js.undefined)
    
    inline def setComputeFarmConfiguration(value: ComputeFarmConfiguration): Self = StObject.set(x, "computeFarmConfiguration", value.asInstanceOf[js.Any])
    
    inline def setComputeFarmConfigurationUndefined: Self = StObject.set(x, "computeFarmConfiguration", js.undefined)
    
    inline def setLicenseServiceConfiguration(value: LicenseServiceConfiguration): Self = StObject.set(x, "licenseServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLicenseServiceConfigurationUndefined: Self = StObject.set(x, "licenseServiceConfiguration", js.undefined)
    
    inline def setSharedFileSystemConfiguration(value: SharedFileSystemConfiguration): Self = StObject.set(x, "sharedFileSystemConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSharedFileSystemConfigurationUndefined: Self = StObject.set(x, "sharedFileSystemConfiguration", js.undefined)
  }
}
