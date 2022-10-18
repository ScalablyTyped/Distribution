package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.End
import typings.ckeditorCkeditor5Engine.anon.Start
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.boundaries
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
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import typings.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable
import typings.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerOptions
import typings.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerValue
import typings.std.Document
import typings.std.Generator
import typings.std.Iterable
import typings.std.Omit
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelRangeMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/range", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Range
       with _Selectable {
    def this(start: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default) = this()
    def this(
      start: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      end: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/range", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[js.Function0[End]], doc: Document): Range = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Range]
  }
  
  @js.native
  trait Range
    extends StObject
       with Iterable[TreeWalkerValue] {
    
    def containsItem(item: Item): Boolean = js.native
    
    def containsPosition(position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): Boolean = js.native
    
    def containsRange(otherRange: Range): Boolean = js.native
    def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
    
    val end: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def getCommonAncestor(): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
    def getContainedElement(): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def getDifference(otherRange: Range): js.Array[Range] = js.native
    
    def getIntersection(otherRange: Range): Range | Null = js.native
    
    def getItems(): Generator[Item, Any, Any] = js.native
    def getItems(options: RangeTreeWalkerOptions): Generator[Item, Any, Any] = js.native
    
    def getJoined(otherRange: Range): Range | Null = js.native
    def getJoined(otherRange: Range, loose: Boolean): Range | Null = js.native
    
    def getMinimalFlatRanges(): js.Array[Range] = js.native
    
    def getPositions(): Generator[typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, Any, Any] = js.native
    def getPositions(options: RangeTreeWalkerOptions): Generator[typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, Any, Any] = js.native
    
    def getTransformedByOperation(operation: Operation): js.Array[Range] = js.native
    
    def getTransformedByOperations(operations: js.Iterable[Operation]): js.Array[Range] = js.native
    
    def getWalker(): typings.ckeditorCkeditor5Engine.srcModelTreewalkerMod.default = js.native
    def getWalker(options: RangeTreeWalkerOptions): typings.ckeditorCkeditor5Engine.srcModelTreewalkerMod.default = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    var isCollapsed: Boolean = js.native
    
    def isEqual(otherRange: Range): Boolean = js.native
    
    var isFlat: Boolean = js.native
    
    def isIntersecting(otherRange: Range): Boolean = js.native
    
    var root: typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    val start: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def toJSON(): Start = js.native
  }
  
  type RangeTreeWalkerOptions = Partial[Omit[TreeWalkerOptions, boundaries]]
}
