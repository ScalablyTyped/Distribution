package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFileEntry extends js.Object {
  /**
    * The full path of the file to be deleted, including the name of the file.
    */
  var filePath: Path = js.native
}

object DeleteFileEntry {
  @scala.inline
  def apply(filePath: Path): DeleteFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileEntry]
  }
}

