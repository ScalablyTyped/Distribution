package typings.ckeditorCkeditor5Watchdog

import typings.ckeditorCkeditor5Watchdog.anon.Create
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.editor
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.itemError
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.itemRestart
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.restart
import typings.ckeditorCkeditor5Watchdog.srcEditorwatchdogMod.EditorCreatorFunction
import typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.WatchdogConfig
import typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.WatchdogState
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextwatchdogMod {
  
  @JSImport("@ckeditor/ckeditor5-watchdog/src/contextwatchdog", JSImport.Default)
  @js.native
  open class default[TContext /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any */] protected () extends ContextWatchdog[TContext] {
    /**
      * The context watchdog class constructor.
      *
      * ```ts
      * const watchdog = new ContextWatchdog( Context );
      *
      * await watchdog.create( contextConfiguration );
      *
      * await watchdog.add( item );
      * ```
      *
      * See the {@glink features/watchdog Watchdog feature guide} to learn more how to use this feature.
      *
      * @param Context The {@link module:core/context~Context} class.
      * @param watchdogConfig The watchdog configuration.
      */
    def this(Context: Create[TContext]) = this()
    def this(Context: Create[TContext], watchdogConfig: WatchdogConfig) = this()
  }
  
  @js.native
  trait ContextWatchdog[TContext /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any */]
    extends typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.default {
    
    /**
      * An action queue, which is used to handle async functions queuing.
      */
    /* private */ var _actionQueues: Any = js.native
    
    /**
      * The current context instance.
      */
    /* private */ var _context: Any = js.native
    
    /**
      * The configuration for the {@link module:core/context~Context}.
      */
    /* private */ var _contextConfig: Any = js.native
    
    /**
      * Context properties (nodes/references) that are gathered during the initial context creation
      * and are used to distinguish the origin of an error.
      */
    /* private */ var _contextProps: Any = js.native
    
    /**
      * Initializes the context watchdog.
      */
    /* private */ var _create: Any = js.native
    
    /**
      * The creation method.
      *
      * @see #setCreator
      */
    /* protected */ def _creator(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContextConfig */ Any
    ): js.Promise[TContext] = js.native
    
    /**
      * Destroys the context instance and all added items.
      */
    /* private */ var _destroy: Any = js.native
    
    /**
      * The destruction method.
      *
      * @see #setDestructor
      */
    /* protected */ def _destructor(
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    
    /**
      * Returns the watchdog for a given item ID.
      *
      * @param itemId Item ID.
      */
    /* protected */ def _getWatchdog(itemId: String): typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.default = js.native
    
    /**
      * The watched item.
      */
    @JSName("_item")
    var _item_FContextWatchdog: Any = js.native
    
    /**
      * The watchdog configuration.
      */
    /* private */ val _watchdogConfig: Any = js.native
    
    /**
      * A map of internal watchdogs for added items.
      */
    /* protected */ var _watchdogs: Map[
        String, 
        typings.ckeditorCkeditor5Watchdog.srcEditorwatchdogMod.default[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
        ]
      ] = js.native
    
    /**
      * Adds items to the watchdog. Once created, instances of these items will be available using the {@link #getItem} method.
      *
      * Items can be passed together as an array of objects:
      *
      * ```ts
      * await watchdog.add( [ {
      * 	id: 'editor1',
      * 	type: 'editor',
      * 	sourceElementOrData: document.querySelector( '#editor' ),
      * 	config: {
      * 		plugins: [ Essentials, Paragraph, Bold, Italic ],
      * 		toolbar: [ 'bold', 'italic', 'alignment' ]
      * 	},
      * 	creator: ( element, config ) => ClassicEditor.create( element, config )
      * } ] );
      * ```
      *
      * Or one by one as objects:
      *
      * ```ts
      * await watchdog.add( {
      * 	id: 'editor1',
      * 	type: 'editor',
      * 	sourceElementOrData: document.querySelector( '#editor' ),
      * 	config: {
      * 		plugins: [ Essentials, Paragraph, Bold, Italic ],
      * 		toolbar: [ 'bold', 'italic', 'alignment' ]
      * 	},
      * 	creator: ( element, config ) => ClassicEditor.create( element, config )
      * ] );
      * ```
      *
      * Then an instance can be retrieved using the {@link #getItem} method:
      *
      * ```ts
      * const editor1 = watchdog.getItem( 'editor1' );
      * ```
      *
      * Note that this method can be called multiple times, but for performance reasons it is better
      * to pass all items together.
      *
      * @param itemConfigurationOrItemConfigurations An item configuration object or an array of item configurations.
      */
    def add(
      itemConfigurationOrItemConfigurations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayOrItem<WatchdogItemConfiguration> */ Any
    ): js.Promise[Any] = js.native
    
    /**
      * The context instance. Keep in mind that this property might be changed when the context watchdog restarts,
      * so do not keep this instance internally. Always operate on the `ContextWatchdog#context` property.
      */
    def context: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any) | Null = js.native
    
    /**
      * Initializes the context watchdog. Once it is created, the watchdog takes care about
      * recreating the context and the provided items, and starts the error handling mechanism.
      *
      * ```ts
      * await watchdog.create( {
      * 	plugins: []
      * } );
      * ```
      *
      * @param contextConfig The context configuration. See {@link module:core/context~Context}.
      */
    def create(): js.Promise[Any] = js.native
    def create(
      contextConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContextConfig */ Any
    ): js.Promise[Any] = js.native
    
    /**
      * Returns an item instance with the given `itemId`.
      *
      * ```ts
      * const editor1 = watchdog.getItem( 'editor1' );
      * ```
      *
      * @param itemId The item ID.
      * @returns The item instance or `undefined` if an item with a given ID has not been found.
      */
    def getItem(itemId: String): Any = js.native
    
    /**
      * Gets the state of the given item. See {@link #state} for a list of available states.
      *
      * ```ts
      * const editor1State = watchdog.getItemState( 'editor1' );
      * ```
      *
      * @param itemId Item ID.
      * @returns The state of the item.
      */
    def getItemState(itemId: String): WatchdogState = js.native
    
    /**
      * Removes and destroys item(s) with given ID(s).
      *
      * ```ts
      * await watchdog.remove( 'editor1' );
      * ```
      *
      * Or
      *
      * ```ts
      * await watchdog.remove( [ 'editor1', 'editor2' ] );
      * ```
      *
      * @param itemIdOrItemIds Item ID or an array of item IDs.
      */
    def remove(
      itemIdOrItemIds: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayOrItem<string> */ Any
    ): js.Promise[Any] = js.native
    
    /**
      * Sets the function that is responsible for the context creation.
      * It expects a function that should return a promise (or `undefined`).
      *
      * ```ts
      * watchdog.setCreator( config => Context.create( config ) );
      * ```
      */
    def setCreator(
      creator: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContextConfig */ /* config */ Any, 
          js.Promise[TContext]
        ]
    ): Unit = js.native
    
    /**
      * Sets the function that is responsible for the context destruction.
      * Overrides the default destruction function, which destroys only the context instance.
      * It expects a function that should return a promise (or `undefined`).
      *
      * ```ts
      * watchdog.setDestructor( context => {
      * 	// Do something before the context is destroyed.
      *
      * 	return context
      * 		.destroy()
      * 		.then( () => {
      * 			// Do something after the context is destroyed.
      * 		} );
      * } );
      * ```
      */
    def setDestructor(
      destructor: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ /* context */ Any, 
          js.Promise[Any]
        ]
    ): Unit = js.native
  }
  
  trait ContextWatchdogItemErrorEvent extends StObject {
    
    var args: js.Array[ContextWatchdogItemErrorEventData]
    
    var name: itemError
    
    var `return`: Unit
  }
  object ContextWatchdogItemErrorEvent {
    
    inline def apply(args: js.Array[ContextWatchdogItemErrorEventData], `return`: Unit): ContextWatchdogItemErrorEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "itemError")
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextWatchdogItemErrorEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextWatchdogItemErrorEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[ContextWatchdogItemErrorEventData]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: ContextWatchdogItemErrorEventData*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: itemError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReturn(value: Unit): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextWatchdogItemErrorEventData extends StObject {
    
    var error: js.Error
    
    var itemId: String
  }
  object ContextWatchdogItemErrorEventData {
    
    inline def apply(error: js.Error, itemId: String): ContextWatchdogItemErrorEventData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextWatchdogItemErrorEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextWatchdogItemErrorEventData] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextWatchdogItemRestartEvent extends StObject {
    
    var args: js.Array[ContextWatchdogItemRestartEventData]
    
    var name: itemRestart
    
    var `return`: Unit
  }
  object ContextWatchdogItemRestartEvent {
    
    inline def apply(args: js.Array[ContextWatchdogItemRestartEventData], `return`: Unit): ContextWatchdogItemRestartEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "itemRestart")
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextWatchdogItemRestartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextWatchdogItemRestartEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[ContextWatchdogItemRestartEventData]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: ContextWatchdogItemRestartEventData*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: itemRestart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReturn(value: Unit): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextWatchdogItemRestartEventData extends StObject {
    
    var itemId: String
  }
  object ContextWatchdogItemRestartEventData {
    
    inline def apply(itemId: String): ContextWatchdogItemRestartEventData = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextWatchdogItemRestartEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextWatchdogItemRestartEventData] (val x: Self) extends AnyVal {
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextWatchdogRestartEvent extends StObject {
    
    var args: js.Array[Any]
    
    var name: restart
    
    var `return`: Unit
  }
  object ContextWatchdogRestartEvent {
    
    inline def apply(args: js.Array[Any], `return`: Unit): ContextWatchdogRestartEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "restart")
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextWatchdogRestartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextWatchdogRestartEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: restart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReturn(value: Unit): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
  
  trait WatchdogItemConfiguration extends StObject {
    
    /**
      * An editor configuration.
      */
    var config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    
    def creator(
      elementOrData: String,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
      ]
    /**
      * A function that initializes the item (the editor). The function takes editor initialization arguments
      * and should return a promise. For example: `( el, config ) => ClassicEditor.create( el, config )`.
      */
    def creator(
      elementOrData: HTMLElement,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
      ]
    def creator(
      elementOrData: Record[String, String],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
      ]
    /**
      * A function that initializes the item (the editor). The function takes editor initialization arguments
      * and should return a promise. For example: `( el, config ) => ClassicEditor.create( el, config )`.
      */
    @JSName("creator")
    var creator_Original: EditorCreatorFunction[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
      ]
    
    /**
      * A function that destroys the item instance (the editor). The function
      * takes an item and should return a promise. For example: `editor => editor.destroy()`
      */
    var destructor: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    /**
      * id A unique item identificator.
      */
    var id: String
    
    /**
      * The source element or data that will be passed
      * as the first argument to the `Editor.create()` method.
      */
    var sourceElementOrData: String | HTMLElement
    
    /**
      * The type of the item to create. At the moment, only `'editor'` is supported.
      */
    var `type`: editor
  }
  object WatchdogItemConfiguration {
    
    inline def apply(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any,
      creator: (/* elementOrData */ HTMLElement | String | (Record[String, String]), /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ /* config */ Any) => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
        ],
      id: String,
      sourceElementOrData: String | HTMLElement
    ): WatchdogItemConfiguration = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], creator = js.Any.fromFunction2(creator), id = id.asInstanceOf[js.Any], sourceElementOrData = sourceElementOrData.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("editor")
      __obj.asInstanceOf[WatchdogItemConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchdogItemConfiguration] (val x: Self) extends AnyVal {
      
      inline def setConfig(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
      ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreator(
        value: (/* elementOrData */ HTMLElement | String | (Record[String, String]), /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ /* config */ Any) => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
            ]
      ): Self = StObject.set(x, "creator", js.Any.fromFunction2(value))
      
      inline def setDestructor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any => js.Promise[Any]
      ): Self = StObject.set(x, "destructor", js.Any.fromFunction1(value))
      
      inline def setDestructorUndefined: Self = StObject.set(x, "destructor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSourceElementOrData(value: String | HTMLElement): Self = StObject.set(x, "sourceElementOrData", value.asInstanceOf[js.Any])
      
      inline def setType(value: editor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
