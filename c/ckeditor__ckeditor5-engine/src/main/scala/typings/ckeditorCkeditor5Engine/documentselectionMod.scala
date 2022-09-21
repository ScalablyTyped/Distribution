package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Priority
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
import typings.ckeditorCkeditor5Engine.selectionMod._Selectable
import typings.std.Generator
import typings.std.IterableIterator
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentselectionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/documentselection", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DocumentSelection
       with _Selectable {
    def this(doc: typings.ckeditorCkeditor5Engine.documentMod.default) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait DocumentSelection extends StObject {
    
    val anchor: typings.ckeditorCkeditor5Engine.positionMod.default | Null = js.native
    
    def containsEntireContent(): Boolean = js.native
    def containsEntireContent(element: typings.ckeditorCkeditor5Engine.elementMod.default): Boolean = js.native
    
    def delegate(events: String*): Any = js.native
    
    def destroy(): Unit = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    val focus: typings.ckeditorCkeditor5Engine.positionMod.default | Null = js.native
    
    def getAttribute(key: String): js.UndefOr[String | Double | Boolean] = js.native
    
    def getAttributeKeys(): js.Array[String] = js.native
    
    def getAttributes(): IterableIterator[js.Tuple2[String, String | Double | Boolean]] = js.native
    
    def getFirstPosition(): typings.ckeditorCkeditor5Engine.positionMod.default | Null = js.native
    
    def getFirstRange(): typings.ckeditorCkeditor5Engine.rangeMod.default | Null = js.native
    
    def getLastPosition(): typings.ckeditorCkeditor5Engine.positionMod.default | Null = js.native
    
    def getLastRange(): typings.ckeditorCkeditor5Engine.rangeMod.default | Null = js.native
    
    def getRanges(): Generator[typings.ckeditorCkeditor5Engine.rangeMod.default, Any, Any] = js.native
    
    def getSelectedBlocks(): ReturnType[
        js.Function0[Generator[typings.ckeditorCkeditor5Engine.elementMod.default, Any, Any]]
      ] = js.native
    
    def getSelectedElement(): typings.ckeditorCkeditor5Engine.elementMod.default | Null = js.native
    
    def hasAttribute(key: String): Boolean = js.native
    
    val hasOwnRange: Boolean = js.native
    
    def is(
      `type`: $text | $textProxy | documentFragment | documentSelection | element | livePosition | liveRange | marker | modelColon$text | modelColon$textProxy | modelColondocumentFragment | modelColondocumentSelection | modelColonelement | modelColonlivePosition | modelColonliveRange | modelColonmarker | modelColonnode | modelColonposition | modelColonrange | modelColonrootElement | modelColonselection | modelColontext | modelColontextProxy | node | position | range | rootElement | selection | text | textProxy
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](`type`: element | modelColonelement | modelColonrootElement | rootElement, name: K): Boolean = js.native
    
    val isBackward: Boolean = js.native
    
    val isCollapsed: Boolean = js.native
    
    val isGravityOverridden: Boolean = js.native
    
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
    
    val markers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Marker> */ Any = js.native
    
    def observeMarkers(prefixOrName: String): Unit = js.native
    
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
    
    def refresh(): Unit = js.native
    
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
}
