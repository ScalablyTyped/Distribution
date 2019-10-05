package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "cmpPos")
@js.native
object cmpPos extends js.Object {
  /** Compare two positions, return 0 if they are the same, a negative number when a is less, and a positive number otherwise. */
  def apply(a: Position, b: Position): Double = js.native
}

