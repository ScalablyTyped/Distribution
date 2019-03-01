package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Entries extends js.Object {
  var entries: js.Array[filesystemLib.FileEntry]
}

object Anon_Entries {
  @scala.inline
  def apply(entries: js.Array[filesystemLib.FileEntry]): Anon_Entries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[Anon_Entries]
  }
}

