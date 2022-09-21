package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.livePosition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.liveRange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marker
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColon$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColon$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColondocumentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColondocumentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonelement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonlivePosition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonliveRange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonmarker
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonnode
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonposition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonrange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonrootElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColonselection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColontext
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.modelColontextProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.node
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.ckeditorCkeditor5Engine.nodeMod.Node
import typings.ckeditorCkeditor5Engine.nodeMod.default
import typings.std.IterableIterator
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/element.default & {  name :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N * / any} */
@js.native
trait defaultnameany extends StObject {
  
  val childCount: Double = js.native
  
  val endOffset: Double | Null = js.native
  
  def findAncestor(parentName: String): typings.ckeditorCkeditor5Engine.elementMod.Element | Null = js.native
  def findAncestor(parentName: String, options: IncludeSelf): typings.ckeditorCkeditor5Engine.elementMod.Element | Null = js.native
  
  def getAncestors(): js.Array[
    typings.ckeditorCkeditor5Engine.elementMod.default | typings.ckeditorCkeditor5Engine.documentfragmentMod.default
  ] = js.native
  def getAncestors(options: ParentFirst): js.Array[
    typings.ckeditorCkeditor5Engine.elementMod.default | typings.ckeditorCkeditor5Engine.documentfragmentMod.default
  ] = js.native
  
  def getAttribute(key: String): js.UndefOr[String | Double | Boolean] = js.native
  
  def getAttributeKeys(): IterableIterator[String] = js.native
  
  def getAttributes(): IterableIterator[js.Tuple2[String, String | Double | Boolean]] = js.native
  
  def getChild(index: Double): typings.ckeditorCkeditor5Engine.elementMod.Element | typings.ckeditorCkeditor5Engine.textMod.default = js.native
  
  def getChildIndex(node: default): Double = js.native
  
  def getChildStartOffset(node: default): Double = js.native
  
  def getChildren(): IterableIterator[
    typings.ckeditorCkeditor5Engine.elementMod.Element | typings.ckeditorCkeditor5Engine.textMod.default
  ] = js.native
  
  def getCommonAncestor(node: Node): typings.ckeditorCkeditor5Engine.elementMod.default | typings.ckeditorCkeditor5Engine.documentfragmentMod.default | Null = js.native
  def getCommonAncestor(node: Node, options: IncludeSelf): typings.ckeditorCkeditor5Engine.elementMod.default | typings.ckeditorCkeditor5Engine.documentfragmentMod.default | Null = js.native
  
  def getNodeByPath(relativePath: js.Array[Double]): typings.ckeditorCkeditor5Engine.elementMod.Element | typings.ckeditorCkeditor5Engine.textMod.default = js.native
  
  def getPath(): js.Array[Double] = js.native
  
  def hasAttribute(key: String): Boolean = js.native
  
  val index: Double | Null = js.native
  
  def is(
    `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
  ): Boolean = js.native
  def is(`type`: String): Boolean = js.native
  def is(`type`: String, name: String): Boolean = js.native
  def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
  
  def isAfter(node: Node): Boolean = js.native
  
  def isAttached(): Boolean = js.native
  
  def isBefore(node: Node): Boolean = js.native
  
  val isEmpty: Boolean = js.native
  
  val maxOffset: Double = js.native
  
  val name: String & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify N */ Any) = js.native
  
  val nextSibling: Node | Null = js.native
  
  val offsetSize: Double = js.native
  
  def offsetToIndex(offset: Double): Double = js.native
  
  val parent: typings.ckeditorCkeditor5Engine.elementMod.default | typings.ckeditorCkeditor5Engine.documentfragmentMod.default | Null = js.native
  
  val previousSibling: Node | Null = js.native
  
  val root: Node | typings.ckeditorCkeditor5Engine.documentfragmentMod.default = js.native
  
  val startOffset: Double | Null = js.native
  
  def toJSON(): (ReturnType[js.Function0[Record[String, String | Double | Boolean]]]) & ChildrenName = js.native
  @JSName("toJSON")
  def toJSON_Record(): Record[String, String | Double | Boolean] = js.native
}
