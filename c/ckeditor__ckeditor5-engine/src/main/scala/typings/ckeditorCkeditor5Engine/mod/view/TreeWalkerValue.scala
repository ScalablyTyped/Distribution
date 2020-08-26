package typings.ckeditorCkeditor5Engine.mod.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeWalkerValue extends js.Object {
  var item: Item = js.native
  var length: Double = js.native
  var nextPosition: Position = js.native
  var previousPosition: Position = js.native
  var `type`: TreeWalkerValueType = js.native
}

object TreeWalkerValue {
  @scala.inline
  def apply(
    item: Item,
    length: Double,
    nextPosition: Position,
    previousPosition: Position,
    `type`: TreeWalkerValueType
  ): TreeWalkerValue = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeWalkerValue]
  }
  @scala.inline
  implicit class TreeWalkerValueOps[Self <: TreeWalkerValue] (val x: Self) extends AnyVal {
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
    def setItem(value: Item): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPosition(value: Position): Self = this.set("nextPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousPosition(value: Position): Self = this.set("previousPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TreeWalkerValueType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

