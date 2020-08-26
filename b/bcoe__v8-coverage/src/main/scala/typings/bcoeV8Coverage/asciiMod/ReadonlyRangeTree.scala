package typings.bcoeV8Coverage.asciiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyRangeTree extends js.Object {
  val children: js.Array[ReadonlyRangeTree] = js.native
  val count: Double = js.native
  val end: Double = js.native
  val start: Double = js.native
}

object ReadonlyRangeTree {
  @scala.inline
  def apply(children: js.Array[ReadonlyRangeTree], count: Double, end: Double, start: Double): ReadonlyRangeTree = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRangeTree]
  }
  @scala.inline
  implicit class ReadonlyRangeTreeOps[Self <: ReadonlyRangeTree] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReadonlyRangeTree*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ReadonlyRangeTree]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

