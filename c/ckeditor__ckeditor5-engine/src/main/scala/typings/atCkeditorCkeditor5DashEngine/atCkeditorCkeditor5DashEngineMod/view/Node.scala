package typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view

import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfBooleanOptional
import typings.atCkeditorCkeditor5DashEngine.Anon_IncludeSelfParentFirstBoolean
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.attributeElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.containerElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.documentFragment
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.element
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.emptyElement
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.text
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.textProxy
import typings.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineStrings.uiElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/node
@JSImport("@ckeditor/ckeditor5-engine", "view.Node")
@js.native
class Node () extends Item {
  val document: Document | Null = js.native
  val index: Double | Null = js.native
  val nextSibling: Node | Null = js.native
  val parent: Element | DocumentFragment | Null = js.native
  val previousSibling: Node | Null = js.native
  val root: Node | DocumentFragment = js.native
  /* protected */ def _clone(): Node = js.native
  def _fireChange(`type`: ChangeType, node: Node): Unit = js.native
  /* protected */ def _remove(): Unit = js.native
  def getAncestors(options: Anon_IncludeSelfParentFirstBoolean): js.Array[Element | DocumentFragment] = js.native
  def getCommonAncestor(node: Node, options: Anon_IncludeSelfBooleanOptional): Element | DocumentFragment | Null = js.native
  def getPath(): js.Array[Double] = js.native
  def is(`type`: String, name: String): Boolean = js.native
  def isAfter(node: Node): Boolean = js.native
  def isBefore(node: Node): Boolean = js.native
  def isSimilar(otherElement: Node): Boolean = js.native
  @JSName("is")
  def is_attributeElement(`type`: attributeElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.AttributeElement */ Boolean = js.native
  @JSName("is")
  def is_containerElement(`type`: containerElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.ContainerElement */ Boolean = js.native
  @JSName("is")
  def is_documentFragment(`type`: documentFragment): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.DocumentFragment */ Boolean = js.native
  @JSName("is")
  def is_element(`type`: element): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.Element */ Boolean = js.native
  @JSName("is")
  def is_emptyElement(`type`: emptyElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.EmptyElement */ Boolean = js.native
  @JSName("is")
  def is_text(`type`: text): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.Text */ Boolean = js.native
  @JSName("is")
  def is_textProxy(`type`: textProxy): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.TextProxy */ Boolean = js.native
  @JSName("is")
  def is_uiElement(`type`: uiElement): /* is @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine.view.UIElement */ Boolean = js.native
  def toJSON(): js.Object = js.native
}

