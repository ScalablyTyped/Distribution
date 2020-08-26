package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostVolumeProperties extends js.Object {
  /**
    * When the host parameter is used, specify a sourcePath to declare the path on the host container instance that is presented to the container. If this parameter is empty, then the Docker daemon has assigned a host path for you. If the host parameter contains a sourcePath file location, then the data volume persists at the specified location on the host container instance until you delete it manually. If the sourcePath value does not exist on the host container instance, the Docker daemon creates it. If the location does exist, the contents of the source path folder are exported. If you are using the Fargate launch type, the sourcePath parameter is not supported.
    */
  var sourcePath: js.UndefOr[String] = js.native
}

object HostVolumeProperties {
  @scala.inline
  def apply(): HostVolumeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostVolumeProperties]
  }
  @scala.inline
  implicit class HostVolumePropertiesOps[Self <: HostVolumeProperties] (val x: Self) extends AnyVal {
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
    def setSourcePath(value: String): Self = this.set("sourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePath: Self = this.set("sourcePath", js.undefined)
  }
  
}

