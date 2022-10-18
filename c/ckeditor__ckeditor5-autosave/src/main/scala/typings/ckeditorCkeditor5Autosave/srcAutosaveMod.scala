package typings.ckeditorCkeditor5Autosave

import typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.Autosave
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
  open class default ()
    extends StObject
       with AutoSave
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-autosave/src/autosave", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-autosave/src/autosave", "default.pluginName")
    @js.native
    def pluginName: Autosave = js.native
    inline def pluginName_=(x: Autosave): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
    
    @JSImport("@ckeditor/ckeditor5-autosave/src/autosave", "default.requires")
    @js.native
    def requires: js.Array[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PendingActions */ Any
      ] = js.native
    inline def requires_=(
      x: js.Array[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PendingActions */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requires")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AutoSave
    extends StObject
       with Plugin {
    
    var adapter: AutosaveAdapter = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    
    def save(): js.Promise[Any] = js.native
    
    def state: synchronized | waiting | saving = js.native
    /* protected */ def state_=(state: synchronized | waiting | saving): Unit = js.native
  }
  
  trait AutosaveAdapter extends StObject {
    
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
    
    extension [Self <: AutosaveAdapter](x: Self) {
      
      inline def setSave(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any => js.Promise[Any]
      ): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
  
  trait AutosaveConfig extends StObject {
    
    def save(
      editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any
    ): js.Promise[Any]
    
    var waitingTime: js.UndefOr[Double] = js.undefined
  }
  object AutosaveConfig {
    
    inline def apply(
      save: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any => js.Promise[Any]
    ): AutosaveConfig = {
      val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[AutosaveConfig]
    }
    
    extension [Self <: AutosaveConfig](x: Self) {
      
      inline def setSave(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any => js.Promise[Any]
      ): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      inline def setWaitingTime(value: Double): Self = StObject.set(x, "waitingTime", value.asInstanceOf[js.Any])
      
      inline def setWaitingTimeUndefined: Self = StObject.set(x, "waitingTime", js.undefined)
    }
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var AutoSave: typings.ckeditorCkeditor5Autosave.srcAutosaveMod.AutoSave
    }
    object Plugins {
      
      inline def apply(AutoSave: AutoSave): Plugins = {
        val __obj = js.Dynamic.literal(AutoSave = AutoSave.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      extension [Self <: Plugins](x: Self) {
        
        inline def setAutoSave(value: AutoSave): Self = StObject.set(x, "AutoSave", value.asInstanceOf[js.Any])
      }
    }
  }
}
