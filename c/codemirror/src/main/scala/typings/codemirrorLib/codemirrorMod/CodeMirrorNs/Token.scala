package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /** The character at which the token ends. */
  var end: scala.Double
  /** The character(on the given line) at which the token starts. */
  var start: scala.Double
  /** The mode's state at the end of this token. */
  var state: js.Any
  /** The token's string. */
  var string: java.lang.String
  /** The token type the mode assigned to the token, such as "keyword" or "comment" (may also be null). */
  var `type`: java.lang.String | scala.Null
}

