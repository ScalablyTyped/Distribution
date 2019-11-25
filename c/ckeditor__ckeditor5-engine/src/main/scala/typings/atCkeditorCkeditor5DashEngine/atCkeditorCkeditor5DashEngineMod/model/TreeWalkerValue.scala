package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeWalkerValue extends js.Object {
  var item: Item
  var length: Double
  var nextPosition: Position
  var previousPosition: Position
  var `type`: TreeWalkerValueType
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
}

