package typings.cfb.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFBEntry extends js.Object {
  /** Class ID represented as hex string */
  var clsid: String
  /** Red/Black Tree color: 0 = red, 1 = black */
  var color: Double
  /** Raw Content (Buffer when available, Array of bytes otherwise) */
  var content: CFBBlob
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

object CFBEntry {
  @scala.inline
  def apply(
    clsid: String,
    color: Double,
    content: CFBBlob,
    name: String,
    size: Double,
    start: Double,
    state: Double,
    `type`: Double,
    ct: Date = null,
    mt: Date = null,
    storage: String = null
  ): CFBEntry = {
    val __obj = js.Dynamic.literal(clsid = clsid.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ct != null) __obj.updateDynamic("ct")(ct.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBEntry]
  }
}

