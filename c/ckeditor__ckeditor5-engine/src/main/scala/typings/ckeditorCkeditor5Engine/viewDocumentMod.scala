package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.Context
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.bubblingemittermixinMod.BubblingEmitter
import typings.ckeditorCkeditor5Engine.stylesmapMod.StylesProcessor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewDocumentMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/document", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Document {
    def this(stylesProcessor: StylesProcessor) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.children
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributes
    - typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
  */
  trait ChangeType extends StObject
  object ChangeType {
    
    inline def attributes: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributes = "attributes".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attributes]
    
    inline def children: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.children = "children".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.children]
    
    inline def text: typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text = "text".asInstanceOf[typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable * / any */ @js.native
  trait Document
    extends StObject
       with BubblingEmitter {
    
    def bind(bindProperties: String*): Any = js.native
    
    def decorate(methodName: String): Unit = js.native
    
    def delegate(events: String*): Any = js.native
    
    /**
      * Destroys this instance. Makes sure that all observers are destroyed and listeners removed.
      */
    def destroy(): Unit = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    /**
      * Gets a {@link module:engine/view/document~Document#roots view root element} with the specified name. If the name is not
      * specific "main" root is returned.
      */
    def getRoot(): typings.ckeditorCkeditor5Engine.rooteditableelementMod.default | Null = js.native
    def getRoot(name: String): typings.ckeditorCkeditor5Engine.rooteditableelementMod.default | Null = js.native
    
    def isComposing: Boolean = js.native
    /* protected */ def isComposing_=(value: Boolean): Unit = js.native
    
    var isFocused: Boolean = js.native
    
    def isReadOnly: Boolean = js.native
    /* protected */ def isReadOnly_=(value: Boolean): Unit = js.native
    
    var isSelecting: Boolean = js.native
    
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
        ],
      options: Context
    ): Unit = js.native
    
    def once[K /* <: String */](
      event: K,
      callback: js.ThisFunction2[
          /* this */ this.type, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo<this, K> */ /* info */ Any, 
          /* repeated */ Any, 
          Unit
        ],
      options: Context
    ): Unit = js.native
    
    /**
      * Allows registering post-fixer callbacks. A post-fixers mechanism allows to update the view tree just before it is rendered
      * to the DOM.
      *
      * Post-fixers are executed right after all changes from the outermost change block were applied but
      * before the {@link module:engine/view/view~View#event:render render event} is fired. If a post-fixer callback made
      * a change, it should return `true`. When this happens, all post-fixers are fired again to check if something else should
      * not be fixed in the new document tree state.
      *
      * View post-fixers are useful when you want to apply some fixes whenever the view structure changes. Keep in mind that
      * changes executed in a view post-fixer should not break model-view mapping.
      *
      * The types of changes which should be safe:
      *
      * * adding or removing attribute from elements,
      * * changes inside of {@link module:engine/view/uielement~UIElement UI elements},
      * * {@link module:engine/model/differ~Differ#refreshItem marking some of the model elements to be re-converted}.
      *
      * Try to avoid changes which touch view structure:
      *
      * * you should not add or remove nor wrap or unwrap any view elements,
      * * you should not change the editor data model in a view post-fixer.
      *
      * As a parameter, a post-fixer callback receives a {@link module:engine/view/downcastwriter~DowncastWriter downcast writer}.
      *
      * Typically, a post-fixer will look like this:
      *
      *    editor.editing.view.document.registerPostFixer( writer => {
      *      if ( checkSomeCondition() ) {
      *        writer.doSomething();
      *
      *        // Let other post-fixers know that something changed.
      *        return true;
      *      }
      *    } );
      *
      * Note that nothing happens right after you register a post-fixer (e.g. execute such a code in the console).
      * That is because adding a post-fixer does not execute it.
      * The post-fixer will be executed as soon as any change in the document needs to cause its rendering.
      * If you want to re-render the editor's view after registering the post-fixer then you should do it manually by calling
      * {@link module:engine/view/view~View#forceRender `view.forceRender()`}.
      *
      * If you need to register a callback which is executed when DOM elements are already updated,
      * use {@link module:engine/view/view~View#event:render render event}.
      */
    def registerPostFixer(
      postFixer: js.Function1[
          /* writer */ typings.ckeditorCkeditor5Engine.downcastwriterMod.default[default], 
          Boolean | Unit
        ]
    ): Unit = js.native
    
    val roots: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<RootEditableElement> */ Any = js.native
    
    val selection: typings.ckeditorCkeditor5Engine.viewDocumentselectionMod.default = js.native
    
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [option: Record<string, unknown>] | [name: string, value: unknown] | [name: string] is not an array type */ args: js.Array[(/* option */ Record[String, Any]) | (/* name */ String)]
    ): Unit = js.native
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [option: Record<string, unknown>] | [name: string, value: unknown] | [name: string] is not an array type */ args: js.Tuple2[/* name */ String, /* value */ Any]
    ): Unit = js.native
    
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
    
    val stylesProcessor: StylesProcessor = js.native
    
    def unbind(unbindProperties: String*): Unit = js.native
  }
}
