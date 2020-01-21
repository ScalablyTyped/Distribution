package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    * The fully qualified path to the file in the repository.
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
  /**
    * The relative path of the file from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.native
}

object File {
  @scala.inline
  def apply(
    absolutePath: Path = null,
    blobId: ObjectId = null,
    fileMode: FileModeTypeEnum = null,
    relativePath: Path = null
  ): File = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

