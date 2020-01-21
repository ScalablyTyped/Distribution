package typings.ckeditorCkeditor5Engine.mod.model

import typings.ckeditorCkeditor5Engine.AnonIncludeSelf
import typings.ckeditorCkeditor5Engine.AnonIncludeSelfBoolean
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/node
@JSImport("@ckeditor/ckeditor5-engine", "model.Node")
@js.native
class Node ()
  extends Item
     with _NodeSet
     with _SchemaContextDefinition {
  def this(attrs: js.Array[js.Tuple2[String, _]]) = this()
  def this(attrs: Map[String, _]) = this()
  val document: Document | Null = js.native
  val endOffset: Double | Null = js.native
  val index: Double | Null = js.native
  val nextSibling: Node | Null = js.native
  val offsetSize: Double = js.native
  val parent: Element | DocumentFragment | Null = js.native
  val previousSibling: Node | Null = js.native
  val root: Node | DocumentFragment = js.native
  val startOffset: Double | Null = js.native
  def getAncestors(options: AnonIncludeSelf): js.Array[Node] = js.native
  def getAttribute(key: String): js.Any = js.native
  def getAttributeKeys(): Iterable[String] = js.native
  def getAttributes(): Iterable[_] = js.native
  def getCommonAncestor(node: Node): Element | DocumentFragment | Null = js.native
  def getCommonAncestor(node: Node, options: AnonIncludeSelfBoolean): Element | DocumentFragment | Null = js.native
  def getPath(): js.Array[Double] = js.native
  def hasAttribute(key: String): Boolean = js.native
  def is(`type`: String, name: String): Boolean = js.native
  def isAfter(node: Node): Boolean = js.native
  def isBefore(node: Node): Boolean = js.native
  @JSName("is")
  def is_documentFragment(`type`: documentFragment): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.DocumentFragment */ Boolean = js.native
  @JSName("is")
  def is_element(`type`: element): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.Element */ Boolean = js.native
  @JSName("is")
  def is_rootElement(`type`: rootElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.RootElement */ Boolean = js.native
  @JSName("is")
  def is_text(`type`: text): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.Text */ Boolean = js.native
  @JSName("is")
  def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.model.TextProxy */ Boolean = js.native
  def toJSON(): js.Object = js.native
}

