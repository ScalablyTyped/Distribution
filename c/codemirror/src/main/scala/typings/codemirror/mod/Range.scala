package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  var anchor: Position = js.native
  var head: Position = js.native
  def empty(): Boolean = js.native
  def from(): Position = js.native
  def to(): Position = js.native
}

object Range {
  @scala.inline
  def apply(anchor: Position, empty: () => Boolean, from: () => Position, head: Position, to: () => Position): Range = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], empty = js.Any.fromFunction0(empty), from = js.Any.fromFunction0(from), head = head.asInstanceOf[js.Any], to = js.Any.fromFunction0(to))
    __obj.asInstanceOf[Range]
  }
  @scala.inline
  implicit class RangeOps[Self <: Range] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchor(value: Position): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmpty(value: () => Boolean): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setFrom(value: () => Position): Self = this.set("from", js.Any.fromFunction0(value))
    @scala.inline
    def setHead(value: Position): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: () => Position): Self = this.set("to", js.Any.fromFunction0(value))
  }
  
}

