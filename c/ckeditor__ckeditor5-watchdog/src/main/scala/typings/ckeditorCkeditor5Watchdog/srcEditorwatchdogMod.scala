package typings.ckeditorCkeditor5Watchdog

import typings.ckeditorCkeditor5Watchdog.anon.`0`
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.restart
import typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.WatchdogConfig
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEditorwatchdogMod {
  
  @JSImport("@ckeditor/ckeditor5-watchdog/src/editorwatchdog", JSImport.Default)
  @js.native
  /**
    * @param Editor The editor class.
    * @param watchdogConfig The watchdog plugin configuration.
    */
  open class default[TEditor /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any */] () extends EditorWatchdog[TEditor] {
    def this(Editor: `0`[TEditor]) = this()
    def this(Editor: Null, watchdogConfig: WatchdogConfig) = this()
    def this(Editor: `0`[TEditor], watchdogConfig: WatchdogConfig) = this()
  }
  
  type EditorCreatorFunction[TEditor] = js.Function2[
    /* elementOrData */ HTMLElement | String | (Record[String, String]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ /* config */ Any, 
    js.Promise[TEditor]
  ]
  
  @js.native
  trait EditorWatchdog[TEditor /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any */]
    extends typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.default {
    
    /**
      * Clones the editor configuration.
      */
    /* private */ var _cloneEditorConfiguration: Any = js.native
    
    /**
      * The editor configuration.
      */
    /* private */ var _config: Any = js.native
    
    /* protected */ def _creator(
      elementOrData: String,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[TEditor] = js.native
    /**
      * The creation method.
      *
      * @see #setCreator
      */
    /* protected */ def _creator(
      elementOrData: HTMLElement,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[TEditor] = js.native
    /* protected */ def _creator(
      elementOrData: Record[String, String],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[TEditor] = js.native
    /**
      * The creation method.
      *
      * @see #setCreator
      */
    /* protected */ @JSName("_creator")
    var _creator_Original: EditorCreatorFunction[TEditor] = js.native
    
    /**
      * The latest saved editor data represented as a root name -> root data object.
      */
    /* private */ var _data: Any = js.native
    
    /* private */ var _destroy: Any = js.native
    
    /**
      * The destruction method.
      *
      * @see #setDestructor
      */
    /* protected */ def _destructor(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
    ): js.Promise[Any] = js.native
    
    /**
      * The current editor instance.
      */
    /* private */ var _editor: Any = js.native
    
    /**
      * The editor source element or data.
      */
    /* private */ var _elementOrData: Any = js.native
    
    /* private */ var _excludedProps: Any = js.native
    
    /**
      * Returns the editor data.
      */
    /* private */ var _getData: Any = js.native
    
    /**
      * The last document version.
      */
    /* private */ var _lastDocumentVersion: Any = js.native
    
    /**
      * Saves the editor data, so it can be restored after the crash even if the data cannot be fetched at
      * the moment of the crash.
      */
    /* private */ var _save: Any = js.native
    
    /**
      * @internal
      */
    def _setExcludedProperties(props: Set[Any]): Unit = js.native
    
    /**
      * Throttled save method. The `save()` method is called the specified `saveInterval` after `throttledSave()` is called,
      * unless a new action happens in the meantime.
      */
    /* private */ var _throttledSave: Any = js.native
    
    /**
      * Creates the editor instance and keeps it running, using the defined creator and destructor.
      *
      * @param elementOrData The editor source element or the editor data.
      * @param config The editor configuration.
      * @param context A context for the editor.
      */
    def create(): js.Promise[Any] = js.native
    def create(elementOrData: String): js.Promise[Any] = js.native
    def create(
      elementOrData: String,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: String,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: String,
      config: Unit,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: Unit,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: Unit,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: Unit,
      config: Unit,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(elementOrData: HTMLElement): js.Promise[Any] = js.native
    def create(
      elementOrData: HTMLElement,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: HTMLElement,
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: HTMLElement,
      config: Unit,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(elementOrData: Record[String, String]): js.Promise[Any] = js.native
    def create(
      elementOrData: Record[String, String],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: Record[String, String],
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorConfig */ Any,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    def create(
      elementOrData: Record[String, String],
      config: Unit,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
    ): js.Promise[Any] = js.native
    
    /**
      * The current editor instance.
      */
    def editor: TEditor | Null = js.native
    
    /**
      * Sets the function that is responsible for the editor creation.
      * It expects a function that should return a promise.
      *
      * ```ts
      * watchdog.setCreator( ( element, config ) => ClassicEditor.create( element, config ) );
      * ```
      */
    def setCreator(creator: EditorCreatorFunction[TEditor]): Unit = js.native
    
    /**
      * Sets the function that is responsible for the editor destruction.
      * Overrides the default destruction function, which destroys only the editor instance.
      * It expects a function that should return a promise or `undefined`.
      *
      * ```ts
      * watchdog.setDestructor( editor => {
      * 	// Do something before the editor is destroyed.
      *
      * 	return editor
      * 		.destroy()
      * 		.then( () => {
      * 			// Do something after the editor is destroyed.
      * 		} );
      * } );
      * ```
      */
    def setDestructor(
      destructor: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, 
          js.Promise[Any]
        ]
    ): Unit = js.native
  }
  
  trait EditorWatchdogRestartEvent extends StObject {
    
    var args: js.Array[Any]
    
    var name: restart
    
    var `return`: Unit
  }
  object EditorWatchdogRestartEvent {
    
    inline def apply(args: js.Array[Any], `return`: Unit): EditorWatchdogRestartEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "restart")
      __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorWatchdogRestartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorWatchdogRestartEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: restart): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReturn(value: Unit): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    }
  }
}
