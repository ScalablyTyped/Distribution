package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails extends StObject {
  
  /**
    * The absolute file path where the tmpfs volume is to be mounted.
    */
  var ContainerPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of tmpfs volume mount options. Valid values: "defaults" | "ro" | "rw" | "suid" | "nosuid" | "dev" | "nodev" | "exec" | "noexec" | "sync" | "async" | "dirsync" | "remount" | "mand" | "nomand" | "atime" | "noatime" | "diratime" | "nodiratime" | "bind" | "rbind" | "unbindable" | "runbindable" | "private" | "rprivate" | "shared" | "rshared" | "slave" | "rslave" | "relatime" | "norelatime" | "strictatime" | "nostrictatime" | "mode" | "uid" | "gid" | "nr_inodes" | "nr_blocks" | "mpol" 
    */
  var MountOptions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The maximum size (in MiB) of the tmpfs volume.
    */
  var Size: js.UndefOr[Integer] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails](x: Self) {
    
    inline def setContainerPath(value: NonEmptyString): Self = StObject.set(x, "ContainerPath", value.asInstanceOf[js.Any])
    
    inline def setContainerPathUndefined: Self = StObject.set(x, "ContainerPath", js.undefined)
    
    inline def setMountOptions(value: NonEmptyStringList): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    inline def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    inline def setMountOptionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "MountOptions", js.Array(value*))
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
