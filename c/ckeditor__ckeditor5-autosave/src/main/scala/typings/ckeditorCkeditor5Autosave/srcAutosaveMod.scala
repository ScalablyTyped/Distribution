package typings.ckeditorCkeditor5Autosave

import typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.error
import typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.saving
import typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.synchronized
import typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.waiting
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAutosaveMod {
  
  @JSImport("@ckeditor/ckeditor5-autosave/src/autosave", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Autosave {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @js.native
  trait Autosave
    extends StObject
       with Plugin {
    
    /**
      * An action that will be added to the pending action manager for actions happening in that plugin.
      */
    /* private */ var _action: Any = js.native
    
    /**
      * The configuration of this plugins.
      */
    /* private */ var _config: Any = js.native
    
    /**
      * Debounced save method. The `save()` method is called the specified `waitingTime` after `debouncedSave()` is called,
      * unless a new action happens in the meantime.
      */
    /* private */ var _debouncedSave: Any = js.native
    
    /**
      * DOM emitter.
      */
    /* private */ var _domEmitter: Any = js.native
    
    /**
      * Invokes the remaining `_save()` method call.
      */
    /* private */ var _flush: Any = js.native
    
    /**
      * The last saved document version.
      */
    /* private */ var _lastDocumentVersion: Any = js.native
    
    /**
      * Informs whether there should be another autosave callback performed, immediately after current autosave callback finishes.
      *
      * This is set to `true` when there is a save request while autosave callback is already being processed
      * and the model has changed since the last save.
      */
    /* private */ var _makeImmediateSave: Any = js.native
    
    /**
      * Editor's pending actions manager.
      */
    /* private */ var _pendingActions: Any = js.native
    
    /**
      * If the adapter is set and a new document version exists,
      * the `_save()` method creates a pending action and calls the `adapter.save()` method.
      * It waits for the result and then removes the created pending action.
      *
      * @returns A promise that will be resolved when the autosave callback is finished.
      */
    /* private */ var _save: Any = js.native
    
    /**
      * Saves callbacks.
      */
    /* private */ def _saveCallbacks: Any = js.native
    
    /**
      * Promise used for asynchronous save calls.
      *
      * Created to handle the autosave call to an external data source. It resolves when that call is finished. It is re-used if
      * save is called before the promise has been resolved. It is set to `null` if there is no call in progress.
      */
    /* private */ var _savePromise: Any = js.native
    
    /**
      * Creates a pending action if it is not set already.
      */
    /* private */ var _setPendingAction: Any = js.native
    
    /**
      * The adapter is an object with a `save()` method. That method will be called whenever
      * the data changes. It might be called some time after the change,
      * since the event is throttled for performance reasons.
      */
    var adapter: js.UndefOr[AutosaveAdapter] = js.native
    
    /**
      * @inheritDoc
      */
    def destroy(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
    
    /**
      * Immediately calls autosave callback. All previously queued (debounced) callbacks are cleared. If there is already an autosave
      * callback in progress, then the requested save will be performed immediately after the current callback finishes.
      *
      * @returns A promise that will be resolved when the autosave callback is finished.
      */
    def save(): js.Promise[Unit] = js.native
    
    /**
      * The state of this plugin.
      *
      * The plugin can be in the following states:
      *
      * * synchronized &ndash; When all changes are saved.
      * * waiting &ndash; When the plugin is waiting for other changes before calling `adapter#save()` and `config.autosave.save()`.
      * * saving &ndash; When the provided save method is called and the plugin waits for the response.
      * * error &ndash When the provided save method will throw an error. This state immediately changes to the `saving` state and
      * the save method will be called again in the short period of time.
      *
      * @observable
      * @readonly
      */
    var state: synchronized | waiting | saving | error = js.native
  }
  
  trait AutosaveAdapter extends StObject {
    
    /**
      * The method that will be called when the data changes. It should return a promise (e.g. in case of saving content to the database),
      * so the autosave plugin will wait for that action before removing it from pending actions.
      */
    def save(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
    ): js.Promise[Any]
  }
  object AutosaveAdapter {
    
    inline def apply(
      save: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any => js.Promise[Any]
    ): AutosaveAdapter = {
      val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[AutosaveAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutosaveAdapter] (val x: Self) extends AnyVal {
      
      inline def setSave(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any => js.Promise[Any]
      ): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
  
  trait AutosaveConfig extends StObject {
    
    /**
      * The callback to be executed when the data needs to be saved.
      *
      * This function must return a promise which should be resolved when the data is successfully saved.
      *
      * ```ts
      * ClassicEditor
      * 	.create( editorElement, {
      * 		autosave: {
      * 			save( editor: Editor ) {
      * 				return saveData( editor.getData() );
      * 			}
      * 		}
      * 	} );
      * 	.then( ... )
      * 	.catch( ... );
      * ```
      */
    var save: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any, 
          js.Promise[Any]
        ]
      ] = js.undefined
    
    /**
      * The minimum amount of time that needs to pass after the last action to call the provided callback.
      * By default it is 1000 ms.
      *
      * ```ts
      * ClassicEditor
      * 	.create( editorElement, {
      * 		autosave: {
      * 			save( editor: Editor ) {
      * 				return saveData( editor.getData() );
      * 			},
      * 			waitingTime: 2000
      * 		}
      * 	} );
      * 	.then( ... )
      * 	.catch( ... );
      * ```
      */
    var waitingTime: js.UndefOr[Double] = js.undefined
  }
  object AutosaveConfig {
    
    inline def apply(): AutosaveConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutosaveConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutosaveConfig] (val x: Self) extends AnyVal {
      
      inline def setSave(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ /* editor */ Any => js.Promise[Any]
      ): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setWaitingTime(value: Double): Self = StObject.set(x, "waitingTime", value.asInstanceOf[js.Any])
      
      inline def setWaitingTimeUndefined: Self = StObject.set(x, "waitingTime", js.undefined)
    }
  }
}
