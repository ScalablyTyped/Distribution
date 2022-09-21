package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Fake
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributeElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.containerElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.documentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.element
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.emptyElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.node
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.position
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.range
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rawElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.rootEditableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.uiElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColon$text
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColon$textProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonattributeElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColoncontainerElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColondocumentFragment
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColondocumentSelection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColoneditableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonelement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonemptyElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonnode
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonposition
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrange
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrawElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonrootEditableElement
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonselection
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColontext
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColontextProxy
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.viewColonuiElement
import typings.ckeditorCkeditor5Engine.viewSelectionMod.Selectable
import typings.ckeditorCkeditor5Engine.viewSelectionMod._Selectable
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewDocumentselectionMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/documentselection", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DocumentSelection
       with _Selectable {
    def this(selectable: Selectable) = this()
    def this(selectable: Unit, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Unit, placeOrOffset: Double) = this()
    def this(selectable: Selectable, placeOrOffset: before | end | after | on | in) = this()
    def this(selectable: Selectable, placeOrOffset: Double) = this()
    def this(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Fake) = this()
    def this(selectable: Unit, placeOrOffset: Double, options: Fake) = this()
    def this(selectable: Unit, placeOrOffset: Unit, options: Fake) = this()
    def this(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Fake) = this()
    def this(selectable: Selectable, placeOrOffset: Double, options: Fake) = this()
    def this(selectable: Selectable, placeOrOffset: Unit, options: Fake) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait DocumentSelection extends StObject {
    
    val anchor: typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    
    def delegate(events: String*): Any = js.native
    
    val editableElement: typings.ckeditorCkeditor5Engine.editableelementMod.default | Null = js.native
    
    val fakeSelectionLabel: String = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    val focus: typings.ckeditorCkeditor5Engine.viewPositionMod.default = js.native
    
    def getFirstPosition(): typings.ckeditorCkeditor5Engine.viewPositionMod.default | Null = js.native
    
    def getFirstRange(): typings.ckeditorCkeditor5Engine.viewRangeMod.default | Null = js.native
    
    def getLastPosition(): typings.ckeditorCkeditor5Engine.viewPositionMod.default | Null = js.native
    
    def getLastRange(): typings.ckeditorCkeditor5Engine.viewRangeMod.default | Null = js.native
    
    def getRanges(): Generator[typings.ckeditorCkeditor5Engine.viewRangeMod.default, Any, Any] = js.native
    
    def getSelectedElement(): typings.ckeditorCkeditor5Engine.viewElementMod.default | Null = js.native
    
    def is(
      `type`: $text | $textProxy | attributeElement | containerElement | documentFragment | documentSelection | typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editableElement | element | emptyElement | node | position | range | rawElement | rootEditableElement | selection | text | textProxy | uiElement | viewColon$text | viewColon$textProxy | viewColonattributeElement | viewColoncontainerElement | viewColondocumentFragment | viewColondocumentSelection | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonnode | viewColonposition | viewColonrange | viewColonrawElement | viewColonrootEditableElement | viewColonselection | viewColontext | viewColontextProxy | viewColonuiElement
    ): Boolean = js.native
    def is(`type`: String): Boolean = js.native
    def is(`type`: String, name: String): Boolean = js.native
    def is[K /* <: String */](
      `type`: attributeElement | containerElement | typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.editableElement | element | emptyElement | rawElement | rootEditableElement | uiElement | viewColonattributeElement | viewColoncontainerElement | viewColoneditableElement | viewColonelement | viewColonemptyElement | viewColonrawElement | viewColonrootEditableElement | viewColonuiElement,
      name: K
    ): Boolean = js.native
    
    val isBackward: Boolean = js.native
    
    val isCollapsed: Boolean = js.native
    
    def isEqual(otherSelection: DocumentSelection): Boolean = js.native
    def isEqual(otherSelection: typings.ckeditorCkeditor5Engine.viewSelectionMod.default): Boolean = js.native
    
    val isFake: Boolean = js.native
    
    def isSimilar(otherSelection: DocumentSelection): Boolean = js.native
    def isSimilar(otherSelection: typings.ckeditorCkeditor5Engine.viewSelectionMod.default): Boolean = js.native
    
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
