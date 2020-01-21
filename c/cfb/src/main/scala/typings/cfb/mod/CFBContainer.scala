package typings.cfb.mod

import typings.cfb.AnonHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFBContainer extends js.Object {
  /* Array of entries in the same order as FullPaths */
  var FileIndex: js.Array[CFBEntry]
  /* List of streams and storages */
  var FullPaths: js.Array[String]
  /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
  var raw: js.UndefOr[AnonHeader] = js.undefined
}

object CFBContainer {
  @scala.inline
  def apply(FileIndex: js.Array[CFBEntry], FullPaths: js.Array[String], raw: AnonHeader = null): CFBContainer = {
    val __obj = js.Dynamic.literal(FileIndex = FileIndex.asInstanceOf[js.Any], FullPaths = FullPaths.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBContainer]
  }
}

