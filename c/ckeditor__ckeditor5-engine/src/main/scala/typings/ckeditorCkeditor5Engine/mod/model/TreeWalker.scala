package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.AnonBoundaries
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/treewalker
@JSImport("@ckeditor/ckeditor5-engine", "model.TreeWalker")
@js.native
class TreeWalker () extends Iterable[TreeWalkerValue] {
  def this(options: AnonBoundaries) = this()
  val boundaries: Range = js.native
  val direction: backward | forward = js.native
  val ignoreElementEnd: Boolean = js.native
  val position: Position = js.native
  val shallow: Boolean = js.native
  val singleCharacters: Boolean = js.native
  def next(): TreeWalkerValue = js.native
  def skip(skip: js.Function1[/* t */ TreeWalkerValue, Boolean]): Unit = js.native
}

