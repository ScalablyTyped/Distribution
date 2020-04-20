package typings.chromeApps

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntries extends js.Object {
  var entries: js.Array[FileEntry]
}

object AnonEntries {
  @scala.inline
  def apply(entries: js.Array[FileEntry]): AnonEntries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntries]
  }
}

