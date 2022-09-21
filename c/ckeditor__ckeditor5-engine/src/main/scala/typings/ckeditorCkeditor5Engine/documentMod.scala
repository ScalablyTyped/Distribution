package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.ModelSelection
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.modelMod.Model
import typings.std.History
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/document", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Document
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emitter * / any */ @js.native
  trait Document extends StObject {
    
    def createRoot(): typings.ckeditorCkeditor5Engine.rootelementMod.default = js.native
    def createRoot(elementName: String): typings.ckeditorCkeditor5Engine.rootelementMod.default = js.native
    def createRoot(elementName: String, rootName: String): typings.ckeditorCkeditor5Engine.rootelementMod.default = js.native
    def createRoot(elementName: Unit, rootName: String): typings.ckeditorCkeditor5Engine.rootelementMod.default = js.native
    
    def delegate(events: String*): Any = js.native
    
    def destroy(): Unit = js.native
    
    val differ: typings.ckeditorCkeditor5Engine.differMod.default = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    def getRoot(): typings.ckeditorCkeditor5Engine.rootelementMod.default | Null = js.native
    def getRoot(name: String): typings.ckeditorCkeditor5Engine.rootelementMod.default | Null = js.native
    
    def getRootNames(): js.Array[String] = js.native
    
    val graveyard: typings.ckeditorCkeditor5Engine.rootelementMod.default = js.native
    
    val history: History = js.native
    
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
    
    val model: Model = js.native
    
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
    
    def registerPostFixer(postFixer: js.Function1[/* writer */ typings.ckeditorCkeditor5Engine.writerMod.default, Unit]): Unit = js.native
    
    val roots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<RootElement> */ Any = js.native
    
    val selection: typings.ckeditorCkeditor5Engine.documentselectionMod.default = js.native
    
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
    
    def toJSON(): (Omit[
        this.type, 
        typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.selection | typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.model
      ]) & ModelSelection = js.native
    
    var version: Double = js.native
  }
}
