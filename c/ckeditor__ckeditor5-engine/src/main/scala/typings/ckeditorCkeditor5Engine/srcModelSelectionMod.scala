package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Backward
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
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
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typings.std.Generator
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelSelectionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/selection", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Selection {
    def this(selectable: Selectable) = this()
    def this(selectable: Null, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Null, placeOrOffset: Double) = this()
    def this(selectable: Unit, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Unit, placeOrOffset: Double) = this()
    def this(selectable: Selectable, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Selectable, placeOrOffset: Double) = this()
    def this(selectable: Null, placeOrOffset: before | end | after | on | in, options: Backward) = this()
    def this(selectable: Null, placeOrOffset: Double, options: Backward) = this()
    def this(selectable: Null, placeOrOffset: Unit, options: Backward) = this()
    def this(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Backward) = this()
    def this(selectable: Unit, placeOrOffset: Double, options: Backward) = this()
    def this(selectable: Unit, placeOrOffset: Unit, options: Backward) = this()
    def this(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward) = this()
    def this(selectable: Selectable, placeOrOffset: Double, options: Backward) = this()
    def this(selectable: Selectable, placeOrOffset: Unit, options: Backward) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.srcModelSelectionMod.Selection
    - typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default
    - typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    - typings.ckeditorCkeditor5Engine.srcModelLivepositionMod.default
    - typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
    - typings.ckeditorCkeditor5Engine.srcModelLiverangeMod.default
    - typings.ckeditorCkeditor5Engine.srcModelNodeMod.default
    - typings.ckeditorCkeditor5Engine.srcModelElementMod.default
    - typings.ckeditorCkeditor5Engine.srcModelRootelementMod.default
    - typings.ckeditorCkeditor5Engine.srcModelTextMod.default
    - scala.Null
    - js.Iterable[typings.ckeditorCkeditor5Engine.srcModelRangeMod.default]
  */
  type Selectable = _Selectable | js.Iterable[typings.ckeditorCkeditor5Engine.srcModelRangeMod.default] | Null
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait Selection
    extends StObject
       with _Selectable {
    
    val anchor: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def containsEntireContent(element: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): Boolean = js.native
    
    def delegate(events: String*): Any = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    val focus: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def getAttribute(key: String): js.UndefOr[String | Boolean | Double] = js.native
    
    def getAttributeKeys(): IterableIterator[String] = js.native
    
    def getAttributes(): IterableIterator[js.Tuple2[String, String | Boolean | Double]] = js.native
    
    def getFirstPosition(): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def getFirstRange(): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    def getLastPosition(): typings.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    def getLastRange(): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    def getRanges(): Generator[typings.ckeditorCkeditor5Engine.srcModelRangeMod.default, Any, Any] = js.native
    
    def getSelectedBlocks(): Generator[typings.ckeditorCkeditor5Engine.srcModelElementMod.default, Any, Any] = js.native
    
    def getSelectedElement(): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    val isBackward: Boolean = js.native
    
    val isCollapsed: Boolean = js.native
    
    def isEqual(otherSelection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): Boolean = js.native
    def isEqual(otherSelection: Selection): Boolean = js.native
    
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def listenTo[P /* <: String */, E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def off[K /* <: String */](event: K): Unit = js.native
    def off[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    
    def on[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def on[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Priority
    ): Unit = js.native
    
    val rangeCount: Double = js.native
    
    def removeAttribute(key: String): Unit = js.native
    
    def setAttribute(key: String, value: String): Unit = js.native
    def setAttribute(key: String, value: Boolean): Unit = js.native
    def setAttribute(key: String, value: Double): Unit = js.native
    
    def setFocus(itemOrPosition: Item): Unit = js.native
    def setFocus(itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def setFocus(itemOrPosition: Item, offset: Double): Unit = js.native
    def setFocus(itemOrPosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    
    def setTo(selectable: Selectable): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: before | end | after | on | in): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: Double): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: Double, options: Backward): Unit = js.native
    def setTo(selectable: Selectable, placeOrOffset: Unit, options: Backward): Unit = js.native
    
    def stopDelegating(): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(
      event: String,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    def stopDelegating(
      event: Unit,
      emitter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any
    ): Unit = js.native
    
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: E): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: E, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: E,
      event: Unit,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](emitter: Unit, event: P): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: P,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
    def stopListening[E /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter */ Any */, P /* <: String */](
      emitter: Unit,
      event: Unit,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<E, P> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ]
    ): Unit = js.native
  }
  
  trait _Selectable extends StObject
}
