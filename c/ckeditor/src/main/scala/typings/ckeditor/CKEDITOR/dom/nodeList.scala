package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait nodeList extends js.Object {
  def count(): Double
  def getItem(index: Double): node
  def toArray(): js.Array[node]
}

object nodeList {
  @scala.inline
  def apply(count: () => Double, getItem: Double => node, toArray: () => js.Array[node]): nodeList = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getItem = js.Any.fromFunction1(getItem), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[nodeList]
  }
}

