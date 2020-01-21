package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemPolicyDescription extends js.Object {
  /**
    * Specifies the EFS file system to which the FileSystemPolicy applies.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  /**
    * The JSON formatted FileSystemPolicy for the EFS file system.
    */
  var Policy: js.UndefOr[typings.awsSdk.efsMod.Policy] = js.native
}

object FileSystemPolicyDescription {
  @scala.inline
  def apply(FileSystemId: FileSystemId = null, Policy: Policy = null): FileSystemPolicyDescription = {
    val __obj = js.Dynamic.literal()
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPolicyDescription]
  }
}

