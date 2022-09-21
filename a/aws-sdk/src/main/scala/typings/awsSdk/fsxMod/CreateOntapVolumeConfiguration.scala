package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOntapVolumeConfiguration extends StObject {
  
  /**
    * Specifies the location in the SVM's namespace where the volume is mounted. The JunctionPath must have a leading forward slash, such as /vol3.
    */
  var JunctionPath: typings.awsSdk.fsxMod.JunctionPath
  
  /**
    * Specifies the security style for the volume. If a volume's security style is not specified, it is automatically set to the root volume's security style. The security style determines the type of permissions that FSx for ONTAP uses to control data access. For more information, see Volume security style in the Amazon FSx for NetApp ONTAP User Guide. Specify one of the following values:    UNIX if the file system is managed by a UNIX administrator, the majority of users are NFS clients, and an application accessing the data uses a UNIX user as the service account.     NTFS if the file system is managed by a Windows administrator, the majority of users are SMB clients, and an application accessing the data uses a Windows user as the service account.    MIXED if the file system is managed by both UNIX and Windows administrators and users consist of both NFS and SMB clients.  
    */
  var SecurityStyle: js.UndefOr[typings.awsSdk.fsxMod.SecurityStyle] = js.undefined
  
  /**
    * Specifies the size of the volume, in megabytes (MB), that you are creating.
    */
  var SizeInMegabytes: VolumeCapacity
  
  /**
    * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
    */
  var StorageEfficiencyEnabled: Flag
  
  /**
    * Specifies the ONTAP SVM in which to create the volume.
    */
  var StorageVirtualMachineId: typings.awsSdk.fsxMod.StorageVirtualMachineId
  
  var TieringPolicy: js.UndefOr[typings.awsSdk.fsxMod.TieringPolicy] = js.undefined
}
object CreateOntapVolumeConfiguration {
  
  inline def apply(
    JunctionPath: JunctionPath,
    SizeInMegabytes: VolumeCapacity,
    StorageEfficiencyEnabled: Flag,
    StorageVirtualMachineId: StorageVirtualMachineId
  ): CreateOntapVolumeConfiguration = {
    val __obj = js.Dynamic.literal(JunctionPath = JunctionPath.asInstanceOf[js.Any], SizeInMegabytes = SizeInMegabytes.asInstanceOf[js.Any], StorageEfficiencyEnabled = StorageEfficiencyEnabled.asInstanceOf[js.Any], StorageVirtualMachineId = StorageVirtualMachineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOntapVolumeConfiguration]
  }
  
  extension [Self <: CreateOntapVolumeConfiguration](x: Self) {
    
    inline def setJunctionPath(value: JunctionPath): Self = StObject.set(x, "JunctionPath", value.asInstanceOf[js.Any])
    
    inline def setSecurityStyle(value: SecurityStyle): Self = StObject.set(x, "SecurityStyle", value.asInstanceOf[js.Any])
    
    inline def setSecurityStyleUndefined: Self = StObject.set(x, "SecurityStyle", js.undefined)
    
    inline def setSizeInMegabytes(value: VolumeCapacity): Self = StObject.set(x, "SizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setStorageEfficiencyEnabled(value: Flag): Self = StObject.set(x, "StorageEfficiencyEnabled", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineId(value: StorageVirtualMachineId): Self = StObject.set(x, "StorageVirtualMachineId", value.asInstanceOf[js.Any])
    
    inline def setTieringPolicy(value: TieringPolicy): Self = StObject.set(x, "TieringPolicy", value.asInstanceOf[js.Any])
    
    inline def setTieringPolicyUndefined: Self = StObject.set(x, "TieringPolicy", js.undefined)
  }
}
