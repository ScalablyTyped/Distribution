package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.model

import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfParentFirst
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.textProxy
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/textproxy
@JSImport("@ckeditor/ckeditor5-engine", "model.TextProxy")
@js.native
class TextProxy protected ()
  extends Item
     with _NodeSet {
  protected def this(textNode: Text, offsetInText: Double, length: Double) = this()
  val data: String = js.native
  val document: Document | Null = js.native
  val endOffset: Double = js.native
  val isPartial: Boolean = js.native
  val offsetInText: Double = js.native
  val offsetSize: Double = js.native
  val parent: Element | DocumentFragment | Null = js.native
  val root: Node | DocumentFragment = js.native
  val startOffset: Double = js.native
  val textNode: Text = js.native
  def getAncestors(options: Anon_IncludeSelfParentFirst): js.Array[TextProxy | Element | DocumentFragment] = js.native
  def getAttribute(key: String): js.Any = js.native
  def getAttributeKeys(): Iterable[String] = js.native
  def getAttributes(): Iterable[_] = js.native
  def getPath(): js.Array[Double] = js.native
  def hasAttribute(key: String): Boolean = js.native
  def is(`type`: String): Boolean = js.native
  @JSName("is")
  def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.TextProxy */ Boolean = js.native
}

