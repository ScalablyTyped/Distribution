package typings
package cfbLib.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$Container extends js.Object {
  /* Array of entries in the same order as FullPaths */
  var FileIndex: js.Array[CFB$Entry]
  /* List of streams and storages */
  var FullPaths: js.Array[java.lang.String]
  /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
  var raw: js.UndefOr[cfbLib.Anon_Header] = js.undefined
}

