package typings.bcoeV8Coverage.asciiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyRangeTree extends js.Object {
  val children: js.Array[ReadonlyRangeTree]
  val count: Double
  val end: Double
  val start: Double
}

object ReadonlyRangeTree {
  @scala.inline
  def apply(children: js.Array[ReadonlyRangeTree], count: Double, end: Double, start: Double): ReadonlyRangeTree = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRangeTree]
  }
}

