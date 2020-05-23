package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var anchor: Position
  var head: Position
  def empty(): Boolean
  def from(): Position
  def to(): Position
}

object Range {
  @scala.inline
  def apply(anchor: Position, empty: () => Boolean, from: () => Position, head: Position, to: () => Position): Range = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), from = js.Any.fromFunction0(from), head = head.asInstanceOf[js.Any], to = js.Any.fromFunction0(to))
    __obj.asInstanceOf[Range]
  }
}

