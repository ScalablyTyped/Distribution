package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directory extends js.Object {
  /**
    * The date and time when the directory was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[typings.awsSdk.clouddirectoryMod.DirectoryArn] = js.native
  /**
    * The name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.native
  /**
    * The state of the directory. Can be either Enabled, Disabled, or Deleted.
    */
  var State: js.UndefOr[DirectoryState] = js.native
}

object Directory {
  @scala.inline
  def apply(
    CreationDateTime: Date = null,
    DirectoryArn: DirectoryArn = null,
    Name: DirectoryName = null,
    State: DirectoryState = null
  ): Directory = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (DirectoryArn != null) __obj.updateDynamic("DirectoryArn")(DirectoryArn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directory]
  }
}

