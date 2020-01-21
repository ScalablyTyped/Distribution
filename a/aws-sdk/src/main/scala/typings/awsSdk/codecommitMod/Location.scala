package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /**
    * The name of the file being compared, including its extension and subdirectory, if any.
    */
  var filePath: js.UndefOr[Path] = js.native
  /**
    * The position of a change in a compared file, in line number format.
    */
  var filePosition: js.UndefOr[Position] = js.native
  /**
    * In a comparison of commits or a pull request, whether the change is in the before or after of that comparison.
    */
  var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.native
}

object Location {
  @scala.inline
  def apply(
    filePath: Path = null,
    filePosition: Int | Double = null,
    relativeFileVersion: RelativeFileVersionEnum = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (filePosition != null) __obj.updateDynamic("filePosition")(filePosition.asInstanceOf[js.Any])
    if (relativeFileVersion != null) __obj.updateDynamic("relativeFileVersion")(relativeFileVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

