package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRangeList extends js.Object {
  var ranges: js.Array[Range] = js.native
  def add(ranges: Range): scala.Unit = js.native
  def addList(ranges: js.Array[Range]): scala.Unit = js.native
  def merge(): js.Array[Range] = js.native
  def pointIndex(pos: Position): scala.Unit = js.native
  def pointIndex(pos: Position, startIndex: scala.Double): scala.Unit = js.native
  def substractPoint(pos: Position): scala.Unit = js.native
}

