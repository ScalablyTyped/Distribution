package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$Entry extends js.Object {
  /** Class ID represented as hex string */
  var clsid: java.lang.String
  /** Red/Black Tree color: 0 = red, 1 = black */
  var color: scala.Double
  /** Raw Content (Buffer when available, Array of bytes otherwise) */
  var content: CFB$Blob
  /** Creation Time */
  var ct: js.UndefOr[stdLib.Date] = js.undefined
  /** Modification Time */
  var mt: js.UndefOr[stdLib.Date] = js.undefined
  /** Case-sensitive internal name */
  var name: java.lang.String
  /** Data Size */
  var size: scala.Double
  /** Starting Sector */
  var start: scala.Double
  /** User-Defined State Bits */
  var state: scala.Double
  /** Storage location -- see CFB$StorageType */
  var storage: js.UndefOr[java.lang.String] = js.undefined
  /** CFB type (salient types: stream, storage) -- see CFB$EntryType */
  var `type`: scala.Double
}

object CFB$Entry {
  @scala.inline
  def apply(
    clsid: java.lang.String,
    color: scala.Double,
    content: CFB$Blob,
    name: java.lang.String,
    size: scala.Double,
    start: scala.Double,
    state: scala.Double,
    `type`: scala.Double,
    ct: stdLib.Date = null,
    mt: stdLib.Date = null,
    storage: java.lang.String = null
  ): CFB$Entry = {
    val __obj = js.Dynamic.literal(clsid = clsid, color = color, content = content.asInstanceOf[js.Any], name = name, size = size, start = start, state = state)
    __obj.updateDynamic("type")(`type`)
    if (ct != null) __obj.updateDynamic("ct")(ct)
    if (mt != null) __obj.updateDynamic("mt")(mt)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    __obj.asInstanceOf[CFB$Entry]
  }
}

