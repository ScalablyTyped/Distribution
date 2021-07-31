package typings.ckeditorCkeditor5Engine.mod.view

import typings.ckeditorCkeditor5Engine.anon.IncludeSelfParentFirst
import typings.ckeditorCkeditor5Engine.anon.`1`
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributeElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.containerElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.emptyElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.uiElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/node
@JSImport("@ckeditor/ckeditor5-engine", "view.Node")
@js.native
class Node ()
  extends StObject
     with Item {
  
  /* protected */ def _clone(): Node = js.native
  
  def _fireChange(`type`: ChangeType, node: Node): Unit = js.native
  
  /* protected */ def _remove(): Unit = js.native
  
  val document: Document | Null = js.native
  
  def getAncestors(options: IncludeSelfParentFirst): js.Array[Element | DocumentFragment] = js.native
  
  def getCommonAncestor(node: Node, options: `1`): Element | DocumentFragment | Null = js.native
  
  def getPath(): js.Array[Double] = js.native
  
  val index: Double | Null = js.native
  
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
  
  val nextSibling: Node | Null = js.native
  
  val parent: Element | DocumentFragment | Null = js.native
  
  val previousSibling: Node | Null = js.native
  
  val root: Node | DocumentFragment = js.native
  
  def toJSON(): js.Object = js.native
}
