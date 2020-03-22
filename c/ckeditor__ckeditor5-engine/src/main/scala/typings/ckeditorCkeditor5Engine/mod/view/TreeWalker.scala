package typings.ckeditorCkeditor5Engine.mod.view

import typings.ckeditorCkeditor5Engine.AnonShallow
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/treewalker
@JSImport("@ckeditor/ckeditor5-engine", "view.TreeWalker")
@js.native
class TreeWalker protected () extends js.Object {
  def this(options: AnonShallow) = this()
  val boundaries: Range = js.native
  val direction: TreeWalkerDirection = js.native
  val ignoreElementEnd: Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[TreeWalkerValue, _, js.UndefOr[scala.Nothing]]] = js.native
  val position: Position = js.native
  val shallow: Boolean = js.native
  val singleCharacters: Boolean = js.native
  def next(): TreeWalkerValue = js.native
  def skip(skip: js.Function1[/* treeWalkerValue */ TreeWalkerValue, Boolean]): Unit = js.native
}

