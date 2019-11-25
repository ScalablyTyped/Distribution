package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreSymbolicLinkMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.EXECUTABLE
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.NORMAL
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.SYMLINK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SymbolicLink extends js.Object {
  /**
    * <p>The fully-qualified path to the folder that contains the symbolic link.</p>
    */
  var absolutePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The blob ID that contains the information about the symbolic link.</p>
    */
  var blobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The file mode permissions of the blob that cotains information about the symbolic link.</p>
    */
  var fileMode: js.UndefOr[EXECUTABLE | NORMAL | SYMLINK | String] = js.undefined
  /**
    * <p>The relative path of the symbolic link from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.undefined
}

object _SymbolicLink {
  @scala.inline
  def apply(
    absolutePath: String = null,
    blobId: String = null,
    fileMode: EXECUTABLE | NORMAL | SYMLINK | String = null,
    relativePath: String = null
  ): _SymbolicLink = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (blobId != null) __obj.updateDynamic("blobId")(blobId.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SymbolicLink]
  }
}

