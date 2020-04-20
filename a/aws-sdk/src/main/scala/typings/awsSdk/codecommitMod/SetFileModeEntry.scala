package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFileModeEntry extends js.Object {
  /**
    * The file mode for the file.
    */
  var fileMode: FileModeTypeEnum = js.native
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path = js.native
}

object SetFileModeEntry {
  @scala.inline
  def apply(fileMode: FileModeTypeEnum, filePath: Path): SetFileModeEntry = {
    val __obj = js.Dynamic.literal(fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFileModeEntry]
  }
}

