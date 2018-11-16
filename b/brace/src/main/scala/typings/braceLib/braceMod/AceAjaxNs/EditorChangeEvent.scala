package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditorChangeEvent extends js.Object {
  var action: java.lang.String
  var end: Position
   // insert, remove
  var lines: js.Array[_]
  var start: Position
}

