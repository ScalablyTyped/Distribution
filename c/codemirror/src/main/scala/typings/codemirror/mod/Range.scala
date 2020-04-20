package typings.codemirror.mod

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
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], from = js.Any.fromFunction0(from), head = head.asInstanceOf[js.Any], to = js.Any.fromFunction0(to))
    __obj.asInstanceOf[Range]
  }
}

