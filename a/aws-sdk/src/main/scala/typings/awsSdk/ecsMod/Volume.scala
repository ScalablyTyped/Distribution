package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Volume extends js.Object {
  
  /**
    * This parameter is specified when you are using Docker volumes. Docker volumes are only supported when you are using the EC2 launch type. Windows containers only support the use of the local driver. To use bind mounts, specify the host parameter instead.
    */
  var dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration] = js.native
  
  /**
    * This parameter is specified when you are using an Amazon Elastic File System file system for task storage.
    */
  var efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration] = js.native
  
  /**
    * This parameter is specified when you are using Amazon FSx for Windows File Server file system for task storage.
    */
  var fsxWindowsFileServerVolumeConfiguration: js.UndefOr[FSxWindowsFileServerVolumeConfiguration] = js.native
  
  /**
    * This parameter is specified when you are using bind mount host volumes. The contents of the host parameter determine whether your bind mount host volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data is not guaranteed to persist after the containers associated with it stop running. Windows containers can mount whole directories on the same drive as $env:ProgramData. Windows containers cannot mount directories on a different drive, and mount point cannot be across drives. For example, you can mount C:\my\path:C:\my\path and D:\:D:\, but not D:\my\path:C:\my\path or D:\:C:\my\path.
    */
  var host: js.UndefOr[HostVolumeProperties] = js.native
  
  /**
    * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. This name is referenced in the sourceVolume parameter of container definition mountPoints.
    */
  var name: js.UndefOr[String] = js.native
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDockerVolumeConfiguration(value: DockerVolumeConfiguration): Self = this.set("dockerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerVolumeConfiguration: Self = this.set("dockerVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setEfsVolumeConfiguration(value: EFSVolumeConfiguration): Self = this.set("efsVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEfsVolumeConfiguration: Self = this.set("efsVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setFsxWindowsFileServerVolumeConfiguration(value: FSxWindowsFileServerVolumeConfiguration): Self = this.set("fsxWindowsFileServerVolumeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsxWindowsFileServerVolumeConfiguration: Self = this.set("fsxWindowsFileServerVolumeConfiguration", js.undefined)
    
    @scala.inline
    def setHost(value: HostVolumeProperties): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
