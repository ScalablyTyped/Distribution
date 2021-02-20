package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.anon.Boundaries
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/model/treewalker
@JSImport("@ckeditor/ckeditor5-engine", "model.TreeWalker")
@js.native
class TreeWalker () extends Iterable[TreeWalkerValue] {
  def this(options: Boundaries) = this()
  
  val boundaries: Range = js.native
  
  val direction: backward | forward = js.native
  
  val ignoreElementEnd: Boolean = js.native
  
  def next(): TreeWalkerValue = js.native
  
  val position: Position = js.native
  
  val shallow: Boolean = js.native
  
  val singleCharacters: Boolean = js.native
  
  def skip(skip: js.Function1[/* t */ TreeWalkerValue, Boolean]): Unit = js.native
}
