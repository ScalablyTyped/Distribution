package typings.cfb.cfbMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$Entry extends js.Object {
  /** Class ID represented as hex string */
  var clsid: String
  /** Red/Black Tree color: 0 = red, 1 = black */
  var color: Double
  /** Raw Content (Buffer when available, Array of bytes otherwise) */
  var content: CFB$Blob
  /** Creation Time */
  var ct: js.UndefOr[Date] = js.undefined
  /** Modification Time */
  var mt: js.UndefOr[Date] = js.undefined
  /** Case-sensitive internal name */
  var name: String
  /** Data Size */
  var size: Double
  /** Starting Sector */
  var start: Double
  /** User-Defined State Bits */
  var state: Double
  /** Storage location -- see CFB$StorageType */
  var storage: js.UndefOr[String] = js.undefined
  /** CFB type (salient types: stream, storage) -- see CFB$EntryType */
  var `type`: Double
}

object CFB$Entry {
  @scala.inline
  def apply(
    clsid: String,
    color: Double,
    content: CFB$Blob,
    name: String,
    size: Double,
    start: Double,
    state: Double,
    `type`: Double,
    ct: Date = null,
    mt: Date = null,
    storage: String = null
  ): CFB$Entry = {
    val __obj = js.Dynamic.literal(clsid = clsid, color = color, content = content.asInstanceOf[js.Any], name = name, size = size, start = start, state = state)
    __obj.updateDynamic("type")(`type`)
    if (ct != null) __obj.updateDynamic("ct")(ct)
    if (mt != null) __obj.updateDynamic("mt")(mt)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[CFB$Entry]
  }
}

