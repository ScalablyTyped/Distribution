package typings.cfb.cfbMod

import typings.cfb.Anon_Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$Container extends js.Object {
  /* Array of entries in the same order as FullPaths */
  var FileIndex: js.Array[CFB$Entry]
  /* List of streams and storages */
  var FullPaths: js.Array[String]
  /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
  var raw: js.UndefOr[Anon_Header] = js.undefined
}

object CFB$Container {
  @scala.inline
  def apply(FileIndex: js.Array[CFB$Entry], FullPaths: js.Array[String], raw: Anon_Header = null): CFB$Container = {
    val __obj = js.Dynamic.literal(FileIndex = FileIndex.asInstanceOf[js.Any], FullPaths = FullPaths.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFB$Container]
  }
}

