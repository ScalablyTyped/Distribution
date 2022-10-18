package typings.ckeditorCkeditor5Engine

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
import typings.ckeditorCkeditor5Engine.srcModelNodeMod._NodeSet
import typings.std.IterableIterator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelTextproxyMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/textproxy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TextProxy
       with Item
       with _NodeSet {
    def this(
      text: typings.ckeditorCkeditor5Engine.srcModelTextMod.default,
      offsetInText: Double,
      length: Double
    ) = this()
  }
  
  @js.native
  trait TextProxy extends StObject {
    
    val data: String = js.native
    
    val endOffset: Double = js.native
    
    def getAncestors(): js.Array[
        typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
      ] = js.native
    def getAncestors(options: ParentFirst): js.Array[
        typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
      ] = js.native
    
    def getAttribute(key: String): String | Double | Boolean = js.native
    
    def getAttributeKeys(): ReturnType[js.Function0[IterableIterator[String]]] = js.native
    
    def getAttributes(): ReturnType[js.Function0[IterableIterator[js.Tuple2[String, String | Double | Boolean]]]] = js.native
    
    def getPath(): js.Array[Double] = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    val isPartial: Boolean = js.native
    
    val offsetInText: Double = js.native
    
    val offsetSize: Double = js.native
    
    val parent: typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
    val root: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    val startOffset: Double = js.native
    
    val textNode: typings.ckeditorCkeditor5Engine.srcModelTextMod.default = js.native
  }
}
