package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  /**
    * This parameter is specified when you are using Docker volumes. Docker volumes are only supported when you are using the EC2 launch type. Windows containers only support the use of the local driver. To use bind mounts, specify the host parameter instead.
    */
  var dockerVolumeConfiguration: js.UndefOr[DockerVolumeConfiguration] = js.native
  /**
    * This parameter is specified when you are using an Amazon Elastic File System (Amazon EFS) file storage. Amazon EFS file systems are only supported when you are using the EC2 launch type.   EFSVolumeConfiguration remains in preview and is a Beta Service as defined by and subject to the Beta Service Participation Service Terms located at https://aws.amazon.com/service-terms ("Beta Terms"). These Beta Terms apply to your participation in this preview of EFSVolumeConfiguration. 
    */
  var efsVolumeConfiguration: js.UndefOr[EFSVolumeConfiguration] = js.native
  /**
    * This parameter is specified when you are using bind mount host volumes. Bind mount host volumes are supported when you are using either the EC2 or Fargate launch types. The contents of the host parameter determine whether your bind mount host volume persists on the host container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for your data volume. However, the data is not guaranteed to persist after the containers associated with it stop running. Windows containers can mount whole directories on the same drive as $env:ProgramData. Windows containers cannot mount directories on a different drive, and mount point cannot be across drives. For example, you can mount C:\my\path:C:\my\path and D:\:D:\, but not D:\my\path:C:\my\path or D:\:C:\my\path.
    */
  var host: js.UndefOr[HostVolumeProperties] = js.native
  /**
    * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. This name is referenced in the sourceVolume parameter of container definition mountPoints.
    */
  var name: js.UndefOr[String] = js.native
}

object Volume {
  @scala.inline
  def apply(
    dockerVolumeConfiguration: DockerVolumeConfiguration = null,
    efsVolumeConfiguration: EFSVolumeConfiguration = null,
    host: HostVolumeProperties = null,
    name: String = null
  ): Volume = {
    val __obj = js.Dynamic.literal()
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration.asInstanceOf[js.Any])
    if (efsVolumeConfiguration != null) __obj.updateDynamic("efsVolumeConfiguration")(efsVolumeConfiguration.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

