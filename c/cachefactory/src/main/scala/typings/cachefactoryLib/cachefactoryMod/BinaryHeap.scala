package typings
package cachefactoryLib.cachefactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cachefactory", "BinaryHeap")
@js.native
class BinaryHeap () extends js.Object {
  def this(weightFunc: js.Function) = this()
  def this(weightFunc: js.Function, compareFunc: js.Function) = this()
  def peek(): js.Any = js.native
  def pop(): js.Any = js.native
  def push(node: js.Any): scala.Unit = js.native
  def remove(node: js.Any): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def size(): scala.Double = js.native
}

