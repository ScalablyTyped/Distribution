package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRangeList extends js.Object {
  var ranges: js.Array[Range] = js.native
  def add(ranges: Range): Unit = js.native
  def addList(ranges: js.Array[Range]): Unit = js.native
  def merge(): js.Array[Range] = js.native
  def pointIndex(pos: Position): Unit = js.native
  def pointIndex(pos: Position, startIndex: Double): Unit = js.native
  def substractPoint(pos: Position): Unit = js.native
}

