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

