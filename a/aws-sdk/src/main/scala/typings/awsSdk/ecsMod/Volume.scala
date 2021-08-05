package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * This parameter is specified when you are using Docker volumes. Docker volumes are only supported when you are using the EC2 launch type. Windows containers only support the use of the local driver. To use bind mounts, specify the host parameter instead.
    */
  var dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration] = js.undefined
  
  /**
    * This parameter is specified when you are using an Amazon Elastic File System file system for task storage.
    */
  var efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration] = js.undefined
  
  /**
    * This parameter is specified when you are using Amazon FSx for Windows File Server file system for task storage.
    */
  var fsxWindowsFileServerVolumeConfiguration: js.UndefOr[FSxWindowsFileServerVolumeConfiguration] = js.undefined
  
  /**
    * This parameter is specified when you are using bind mount host volumes. The contents of the host parameter determine whether your bind mount host volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data is not guaranteed to persist after the containers associated with it stop running. Windows containers can mount whole directories on the same drive as $env:ProgramData. Windows containers cannot mount directories on a different drive, and mount point cannot be across drives. For example, you can mount C:\my\path:C:\my\path and D:\:D:\, but not D:\my\path:C:\my\path or D:\:C:\my\path.
    */
  var host: js.UndefOr[HostVolumeProperties] = js.undefined
  
  /**
    * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. This name is referenced in the sourceVolume parameter of container definition mountPoints.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Volume {
  
  inline def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  extension [Self <: Volume](x: Self) {
    
    inline def setDockerVolumeConfiguration(value: DockerVolumeConfiguration): Self = StObject.set(x, "dockerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDockerVolumeConfigurationUndefined: Self = StObject.set(x, "dockerVolumeConfiguration", js.undefined)
    
    inline def setEfsVolumeConfiguration(value: EFSVolumeConfiguration): Self = StObject.set(x, "efsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEfsVolumeConfigurationUndefined: Self = StObject.set(x, "efsVolumeConfiguration", js.undefined)
    
    inline def setFsxWindowsFileServerVolumeConfiguration(value: FSxWindowsFileServerVolumeConfiguration): Self = StObject.set(x, "fsxWindowsFileServerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFsxWindowsFileServerVolumeConfigurationUndefined: Self = StObject.set(x, "fsxWindowsFileServerVolumeConfiguration", js.undefined)
    
    inline def setHost(value: HostVolumeProperties): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
