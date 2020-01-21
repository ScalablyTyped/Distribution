package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileMetadata extends js.Object {
  /**
    * The full path to the file to be added or updated, including the name of the file.
    */
  var absolutePath: js.UndefOr[Path] = js.native
  /**
    * The blob ID that contains the file information.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
}

object FileMetadata {
  @scala.inline
  def apply(absolutePath: Path = null, blobId: ObjectId = null, fileMode: FileModeTypeEnum = null): FileMetadata = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMetadata]
  }
}

