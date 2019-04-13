package typings
package codemirrorLib.codemirrorMod

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
  def apply(anchor: Position, from: () => Position, head: Position, to: () => Position): Range = {
    val __obj = js.Dynamic.literal(anchor = anchor, from = js.Any.fromFunction0(from), head = head, to = js.Any.fromFunction0(to))
  
    __obj.asInstanceOf[Range]
  }
}

