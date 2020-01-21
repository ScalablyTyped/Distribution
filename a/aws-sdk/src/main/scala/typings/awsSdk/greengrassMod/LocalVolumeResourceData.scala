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
  def apply(
    DestinationPath: string = null,
    GroupOwnerSetting: GroupOwnerSetting = null,
    SourcePath: string = null
  ): LocalVolumeResourceData = {
    val __obj = js.Dynamic.literal()
    if (DestinationPath != null) __obj.updateDynamic("DestinationPath")(DestinationPath.asInstanceOf[js.Any])
    if (GroupOwnerSetting != null) __obj.updateDynamic("GroupOwnerSetting")(GroupOwnerSetting.asInstanceOf[js.Any])
    if (SourcePath != null) __obj.updateDynamic("SourcePath")(SourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVolumeResourceData]
  }
}

