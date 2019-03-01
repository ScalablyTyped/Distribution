package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var anchor: Position
  var head: Position
  def from(): Position
  def to(): Position
}

object Range {
  @scala.inline
  def apply(anchor: Position, from: js.Function0[Position], head: Position, to: js.Function0[Position]): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("anchor")(anchor)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Range]
  }
}

