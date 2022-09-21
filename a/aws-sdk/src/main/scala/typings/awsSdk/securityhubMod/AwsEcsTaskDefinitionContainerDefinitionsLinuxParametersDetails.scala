package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails extends StObject {
  
  /**
    * The Linux capabilities for the container that are added to or dropped from the default configuration provided by Docker.
    */
  var Capabilities: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails] = js.undefined
  
  /**
    * The host devices to expose to the container.
    */
  var Devices: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesList] = js.undefined
  
  /**
    * Whether to run an init process inside the container that forwards signals and reaps processes. 
    */
  var InitProcessEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The total amount of swap memory (in MiB) that a container can use.
    */
  var MaxSwap: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value for the size (in MiB) of the /dev/shm volume.
    */
  var SharedMemorySize: js.UndefOr[Integer] = js.undefined
  
  /**
    * Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The higher the value, the more aggressive the swappiness. The default is 60.
    */
  var Swappiness: js.UndefOr[Integer] = js.undefined
  
  /**
    * The container path, mount options, and size (in MiB) of the tmpfs mount.
    */
  var Tmpfs: js.UndefOr[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsList] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails](x: Self) {
    
    inline def setCapabilities(value: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setDevices(value: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesList): Self = StObject.set(x, "Devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "Devices", js.undefined)
    
    inline def setDevicesVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails*): Self = StObject.set(x, "Devices", js.Array(value*))
    
    inline def setInitProcessEnabled(value: Boolean): Self = StObject.set(x, "InitProcessEnabled", value.asInstanceOf[js.Any])
    
    inline def setInitProcessEnabledUndefined: Self = StObject.set(x, "InitProcessEnabled", js.undefined)
    
    inline def setMaxSwap(value: Integer): Self = StObject.set(x, "MaxSwap", value.asInstanceOf[js.Any])
    
    inline def setMaxSwapUndefined: Self = StObject.set(x, "MaxSwap", js.undefined)
    
    inline def setSharedMemorySize(value: Integer): Self = StObject.set(x, "SharedMemorySize", value.asInstanceOf[js.Any])
    
    inline def setSharedMemorySizeUndefined: Self = StObject.set(x, "SharedMemorySize", js.undefined)
    
    inline def setSwappiness(value: Integer): Self = StObject.set(x, "Swappiness", value.asInstanceOf[js.Any])
    
    inline def setSwappinessUndefined: Self = StObject.set(x, "Swappiness", js.undefined)
    
    inline def setTmpfs(value: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsList): Self = StObject.set(x, "Tmpfs", value.asInstanceOf[js.Any])
    
    inline def setTmpfsUndefined: Self = StObject.set(x, "Tmpfs", js.undefined)
    
    inline def setTmpfsVarargs(value: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails*): Self = StObject.set(x, "Tmpfs", js.Array(value*))
  }
}
