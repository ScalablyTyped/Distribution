package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view

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
    val __obj = js.Dynamic.literal(item = item, length = length, nextPosition = nextPosition, previousPosition = previousPosition)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TreeWalkerValue]
  }
}

