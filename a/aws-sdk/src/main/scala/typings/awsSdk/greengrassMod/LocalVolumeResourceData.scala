package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalVolumeResourceData extends js.Object {
  /**
    * The absolute local path of the resource inside the Lambda environment.
    */
  var DestinationPath: js.UndefOr[string] = js.native
  /**
    * Allows you to configure additional group privileges for the Lambda process. This field is optional.
    */
  var GroupOwnerSetting: js.UndefOr[typings.awsSdk.greengrassMod.GroupOwnerSetting] = js.native
  /**
    * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot start with ''/sys''.
    */
  var SourcePath: js.UndefOr[string] = js.native
}

object LocalVolumeResourceData {
  @scala.inline
  def apply(): LocalVolumeResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalVolumeResourceData]
  }
  @scala.inline
  implicit class LocalVolumeResourceDataOps[Self <: LocalVolumeResourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationPath(value: string): Self = this.set("DestinationPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationPath: Self = this.set("DestinationPath", js.undefined)
    @scala.inline
    def setGroupOwnerSetting(value: GroupOwnerSetting): Self = this.set("GroupOwnerSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupOwnerSetting: Self = this.set("GroupOwnerSetting", js.undefined)
    @scala.inline
    def setSourcePath(value: string): Self = this.set("SourcePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcePath: Self = this.set("SourcePath", js.undefined)
  }
  
}

