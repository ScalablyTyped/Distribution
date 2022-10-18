package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.IncludeSelf
import typings.ckeditorCkeditor5Engine.anon.ParentFirst
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
import typings.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typings.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable
import typings.std.IterableIterator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelNodeMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/node", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Node
       with Item
       with _Selectable {
    def this(attrs: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof toMap * / any>[0] */ js.Any) = this()
  }
  
  @js.native
  trait Node
    extends StObject
       with _NodeSet {
    
    val endOffset: Double | Null = js.native
    
    def getAncestors(): js.Array[
        typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
      ] = js.native
    def getAncestors(options: ParentFirst): js.Array[
        typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
      ] = js.native
    
    def getAttribute(key: String): js.UndefOr[String | Double | Boolean] = js.native
    
    def getAttributeKeys(): IterableIterator[String] = js.native
    
    def getAttributes(): IterableIterator[js.Tuple2[String, String | Double | Boolean]] = js.native
    
    def getCommonAncestor(node: Node): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    def getCommonAncestor(node: Node, options: IncludeSelf): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
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
    
    val nextSibling: Node | Null = js.native
    
    val offsetSize: Double = js.native
    
    val parent: typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
    val previousSibling: Node | Null = js.native
    
    val root: Node | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    val startOffset: Double | Null = js.native
    
    def toJSON(): Record[String, String | Double | Boolean] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.srcModelNodeMod.Node
    - typings.ckeditorCkeditor5Engine.srcModelTextproxyMod.default
    - java.lang.String
    - typings.ckeditorCkeditor5Engine.srcModelNodelistMod.default
    - typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
    - js.Iterable[scala.Any]
  */
  type NodeSet = _NodeSet | js.Iterable[Any] | String
  
  trait _NodeSet extends StObject
}
