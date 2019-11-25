package typings.chromeDashApps

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entries extends js.Object {
  var entries: js.Array[FileEntry]
}

object Anon_Entries {
  @scala.inline
  def apply(entries: js.Array[FileEntry]): Anon_Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Entries]
  }
}

