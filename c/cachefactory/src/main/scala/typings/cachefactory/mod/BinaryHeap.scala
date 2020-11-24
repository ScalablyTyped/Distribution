package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cachefactory", "BinaryHeap")
@js.native
class BinaryHeap () extends js.Object {
  def this(weightFunc: js.Function) = this()
  def this(weightFunc: js.UndefOr[scala.Nothing], compareFunc: js.Function) = this()
  def this(weightFunc: js.Function, compareFunc: js.Function) = this()
  
  def peek(): js.Any = js.native
  
  def pop(): js.Any = js.native
  
  def push(node: js.Any): Unit = js.native
  
  def remove(node: js.Any): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def size(): Double = js.native
}
