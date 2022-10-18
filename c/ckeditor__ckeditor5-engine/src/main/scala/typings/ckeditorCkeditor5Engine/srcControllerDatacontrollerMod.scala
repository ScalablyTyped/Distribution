package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.anon.BatchType
import typings.ckeditorCkeditor5Engine.anon.Priority
import typings.ckeditorCkeditor5Engine.anon.RootName
import typings.ckeditorCkeditor5Engine.srcModelModelMod.Model
import typings.ckeditorCkeditor5Engine.srcModelSchemaMod.SchemaContextDefinition
import typings.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import typings.ckeditorCkeditor5Engine.srcViewStylesmapMod.StylesProcessor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcControllerDatacontrollerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/controller/datacontroller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataController {
    /**
      * Creates a data controller instance.
      */
    def this(model: Model, stylesProcessor: StylesProcessor) = this()
  }
  
  @js.native
  trait DataController extends StObject {
    
    /**
      * Adds a style processor normalization rules.
      *
      * You can implement your own rules as well as use one of the available processor rules:
      *
      * * background: {@link module:engine/view/styles/background~addBackgroundRules}
      * * border: {@link module:engine/view/styles/border~addBorderRules}
      * * margin: {@link module:engine/view/styles/margin~addMarginRules}
      * * padding: {@link module:engine/view/styles/padding~addPaddingRules}
      */
    def addStyleProcessorRules(
      callback: js.Function1[
          /* stylesProcessor */ StylesProcessor, 
          Record[String, (Record[String, String]) | String]
        ]
    ): Unit = js.native
    
    def bind(bindProperties: String*): Any = js.native
    
    def decorate(methodName: String): Unit = js.native
    
    def delegate(events: String*): Any = js.native
    
    /**
      * Removes all event listeners set by the DataController.
      */
    def destroy(): Unit = js.native
    
    /**
      * Downcast dispatcher used by the {@link #get get method}. Downcast converters should be attached to it.
      */
    val downcastDispatcher: typings.ckeditorCkeditor5Engine.srcConversionDowncastdispatcherMod.default[js.Object] = js.native
    
    def fire(eventOrInfo: String, args: Any*): Any = js.native
    def fire(
      eventOrInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInfo */ Any,
      args: Any*
    ): Any = js.native
    
    /**
      * Returns the model's data converted by downcast dispatchers attached to {@link #downcastDispatcher} and
      * formatted by the {@link #processor data processor}.
      */
    def get(): String = js.native
    def get(options: RootName): String = js.native
    
    /**
      * Data processor used specifically for HTML conversion.
      */
    val htmlProcessor: typings.ckeditorCkeditor5Engine.srcDataprocessorHtmldataprocessorMod.default = js.native
    
    /**
      * Sets initial input data parsed by the {@link #processor data processor} and
      * converted by the {@link #upcastDispatcher view-to-model converters}.
      * Initial data can be set only to document that {@link module:engine/model/document~Document#version} is equal 0.
      *
      * **Note** This method is {@link module:utils/observablemixin~ObservableMixin#decorate decorated} which is
      * used by e.g. collaborative editing plugin that syncs remote data on init.
      *
      * When data is passed as a string it is initialized on a default `main` root:
      *
      *    dataController.init( '<p>Foo</p>' ); // Initializes data on the `main` root.
      *
      * To initialize data on a different root or multiple roots at once, object containing `rootName` - `data` pairs should be passed:
      *
      *    dataController.init( { main: '<p>Foo</p>', title: '<h1>Bar</h1>' } ); // Initializes data on the `main` and `title` roots.
      */
    def init(data: String): js.Promise[Unit] = js.native
    def init(data: Record[String, String]): js.Promise[Unit] = js.native
    
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
    
    /**
      * Mapper used for the conversion. It has no permanent bindings, because they are created when getting data and
      * cleared directly after the data are converted. However, the mapper is defined as a class property, because
      * it needs to be passed to the `DowncastDispatcher` as a conversion API.
      */
    val mapper: typings.ckeditorCkeditor5Engine.srcConversionMapperMod.default = js.native
    
    /**
      * Data Model
      */
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
    
    /**
      * Returns the data parsed by the {@link #processor data processor} and then converted by upcast converters
      * attached to the {@link #upcastDispatcher}.
      */
    def parse(data: String): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    def parse(data: String, context: SchemaContextDefinition): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    /**
      * Data processor used during the conversion.
      * Same instance as {@link #htmlProcessor} by default. Can be replaced at run time to handle different format, e.g. XML or Markdown.
      */
    var processor: typings.ckeditorCkeditor5Engine.srcDataprocessorHtmldataprocessorMod.default = js.native
    
    /**
      * Registers a {@link module:engine/view/matcher~MatcherPattern} on {@link #htmlProcessor htmlProcessor}
      * and {@link #processor processor} for view elements whose content should be treated as a raw data
      * and not processed during conversion from DOM to view elements.
      *
      * The raw data can be later accessed by {@link module:engine/view/element~Element#getCustomProperty view element custom property}
      * `"$rawContent"`.
      */
    def registerRawContentMatcher(pattern: MatcherPattern): Unit = js.native
    
    /**
      * Sets input data parsed by the {@link #processor data processor} and
      * converted by the {@link #upcastDispatcher view-to-model converters}.
      * This method can be used any time to replace existing editor data by the new one without clearing the
      * {@link module:engine/model/document~Document#history document history}.
      *
      * This method also creates a batch with all the changes applied. If all you need is to parse data, use
      * the {@link #parse} method.
      *
      * When data is passed as a string it is set on a default `main` root:
      *
      *    dataController.set( '<p>Foo</p>' ); // Sets data on the `main` root.
      *
      * To set data on a different root or multiple roots at once, object containing `rootName` - `data` pairs should be passed:
      *
      *    dataController.set( { main: '<p>Foo</p>', title: '<h1>Bar</h1>' } ); // Sets data on the `main` and `title` roots.
      *
      * To set the data with preserved undo stacks and set the current change to this stack, use the `{ batchType: 'default' }` option.
      *
      *    dataController.set( '<p>Foo</p>', { batchType: 'default' } ); // Sets data as a new change.
      */
    def set(data: String): Unit = js.native
    def set(data: String, options: BatchType): Unit = js.native
    def set(data: Record[String, String]): Unit = js.native
    def set(data: Record[String, String], options: BatchType): Unit = js.native
    
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
    
    def stringify(modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): String = js.native
    def stringify(
      modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      options: Record[String, Any]
    ): String = js.native
    /**
      * Returns the content of the given {@link module:engine/model/element~Element model's element} or
      * {@link module:engine/model/documentfragment~DocumentFragment model document fragment} converted by the downcast converters
      * attached to {@link #downcastDispatcher} and formatted by the {@link #processor data processor}.
      */
    def stringify(modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): String = js.native
    def stringify(
      modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      options: Record[String, Any]
    ): String = js.native
    
    /**
      * Styles processor used during the conversion.
      */
    val stylesProcessor: StylesProcessor = js.native
    
    def toModel(viewElementOrFragment: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    def toModel(
      viewElementOrFragment: typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default,
      context: SchemaContextDefinition
    ): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    /**
      * Returns the result of the given {@link module:engine/view/element~Element view element} or
      * {@link module:engine/view/documentfragment~DocumentFragment view document fragment} converted by the
      * {@link #upcastDispatcher view-to-model converters}, wrapped by {@link module:engine/model/documentfragment~DocumentFragment}.
      *
      * When marker elements were converted during the conversion process, it will be set as a document fragment's
      * {@link module:engine/model/documentfragment~DocumentFragment#markers static markers map}.
      */
    def toModel(viewElementOrFragment: typings.ckeditorCkeditor5Engine.srcViewElementMod.default): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    def toModel(
      viewElementOrFragment: typings.ckeditorCkeditor5Engine.srcViewElementMod.default,
      context: SchemaContextDefinition
    ): typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    def toView(modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def toView(
      modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      options: Record[String, Any]
    ): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    /**
      * Returns the content of the given {@link module:engine/model/element~Element model element} or
      * {@link module:engine/model/documentfragment~DocumentFragment model document fragment} converted by the downcast
      * converters attached to {@link #downcastDispatcher} to a
      * {@link module:engine/view/documentfragment~DocumentFragment view document fragment}.
      */
    def toView(modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelElementMod.default): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def toView(
      modelElementOrFragment: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      options: Record[String, Any]
    ): typings.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def unbind(unbindProperties: String*): Unit = js.native
    
    /**
      * Upcast dispatcher used by the {@link #set set method}. Upcast converters should be attached to it.
      */
    val upcastDispatcher: typings.ckeditorCkeditor5Engine.srcConversionUpcastdispatcherMod.default = js.native
    
    /**
      * The view document used by the data controller.
      */
    val viewDocument: typings.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
  }
}
