package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Boundaries
import typings.ckeditorCkeditor5Engine.anon.Root
import typings.ckeditorCkeditor5Engine.anon.Stickiness
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
import typings.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod._SchemaContextDefinition
import typings.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable
import typings.ckeditorCkeditor5Engine.srcModelTreewalkerMod.TreeWalkerValue
import typings.std.Document
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelPositionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/position", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Position
       with _SchemaContextDefinition
       with _Selectable {
    def this(root: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default, path: js.Array[Double]) = this()
    def this(root: typings.ckeditorCkeditor5Engine.srcModelElementMod.default, path: js.Array[Double]) = this()
    def this(
      root: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ) = this()
    def this(
      root: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/position", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ReturnType[js.Function0[Root]], doc: Document): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Position]
  }
  
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
  ): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
    textNode: typings.ckeditorCkeditor5Engine.srcModelTextMod.default
  ): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any], textNode.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  inline def getNodeAfterPosition(position: Position, positionParent: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  inline def getNodeAfterPosition(
    position: Position,
    positionParent: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
    textNode: typings.ckeditorCkeditor5Engine.srcModelTextMod.default
  ): typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAfterPosition")(position.asInstanceOf[js.Any], positionParent.asInstanceOf[js.Any], textNode.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null]
  
  @js.native
  trait Position extends StObject {
    
    def compareWith(otherPosition: Position): PositionRelation = js.native
    
    def findAncestor(parentName: String): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def getAncestors(): js.Array[Item] = js.native
    
    def getCommonAncestor(position: Position): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default | Null = js.native
    
    def getCommonPath(position: Position): js.Array[Double] = js.native
    
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean]): Position = js.native
    def getLastMatchingPosition(skip: js.Function1[/* value */ TreeWalkerValue, Boolean], options: Boundaries): Position = js.native
    
    def getParentPath(): js.Array[Double] = js.native
    
    def getShiftedBy(shift: Double): Position = js.native
    
    def getTransformedByOperation(operation: Operation): Position = js.native
    
    def hasSameParentAs(position: Position): Boolean = js.native
    
    val index: Double = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    def isAfter(otherPosition: Position): Boolean = js.native
    
    val isAtEnd: Boolean = js.native
    
    val isAtStart: Boolean = js.native
    
    def isBefore(otherPosition: Position): Boolean = js.native
    
    def isEqual(otherPosition: Position): Boolean = js.native
    
    def isTouching(otherPosition: Position): Boolean = js.native
    
    val nodeAfter: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = js.native
    
    val nodeBefore: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default | Null = js.native
    
    var offset: Double = js.native
    
    val parent: typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    val path: js.Array[Double] = js.native
    
    val root: typings.ckeditorCkeditor5Engine.srcModelElementMod.default | typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    var stickiness: PositionStickiness = js.native
    
    val textNode: typings.ckeditorCkeditor5Engine.srcModelTextMod.default | Null = js.native
    
    def toJSON(): Stickiness = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different
  */
  trait PositionRelation extends StObject
  object PositionRelation {
    
    inline def after: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after = "after".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after]
    
    inline def before: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before = "before".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before]
    
    inline def different: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different = "different".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.different]
    
    inline def same: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same = "same".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.same]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNone
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNext
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toPrevious
  */
  trait PositionStickiness extends StObject
  object PositionStickiness {
    
    inline def toNext: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNext = "toNext".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNext]
    
    inline def toNone: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNone = "toNone".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toNone]
    
    inline def toPrevious: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toPrevious = "toPrevious".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.toPrevious]
  }
}
