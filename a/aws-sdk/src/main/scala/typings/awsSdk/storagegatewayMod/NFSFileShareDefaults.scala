package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NFSFileShareDefaults extends js.Object {
  /**
    * The Unix directory mode in the form "nnnn". For example, 0666 represents the default access mode for all directories inside the file share. The default value is 0777.
    */
  var DirectoryMode: js.UndefOr[PermissionMode] = js.native
  /**
    * The Unix file mode in the form "nnnn". For example, 0666 represents the default file mode inside the file share. The default value is 0666.
    */
  var FileMode: js.UndefOr[PermissionMode] = js.native
  /**
    * The default group ID for the file share (unless the files have another group ID specified). The default value is nfsnobody.
    */
  var GroupId: js.UndefOr[PermissionId] = js.native
  /**
    * The default owner ID for files in the file share (unless the files have another owner ID specified). The default value is nfsnobody.
    */
  var OwnerId: js.UndefOr[PermissionId] = js.native
}

object NFSFileShareDefaults {
  @scala.inline
  def apply(
    DirectoryMode: PermissionMode = null,
    FileMode: PermissionMode = null,
    GroupId: js.UndefOr[PermissionId] = js.undefined,
    OwnerId: js.UndefOr[PermissionId] = js.undefined
  ): NFSFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    if (DirectoryMode != null) __obj.updateDynamic("DirectoryMode")(DirectoryMode.asInstanceOf[js.Any])
    if (FileMode != null) __obj.updateDynamic("FileMode")(FileMode.asInstanceOf[js.Any])
    if (!js.isUndefined(GroupId)) __obj.updateDynamic("GroupId")(GroupId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(OwnerId)) __obj.updateDynamic("OwnerId")(OwnerId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NFSFileShareDefaults]
  }
}

