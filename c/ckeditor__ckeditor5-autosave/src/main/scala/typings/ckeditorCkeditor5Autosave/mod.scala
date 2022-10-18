package typings.ckeditorCkeditor5Autosave

import typings.ckeditorCkeditor5Autosave.srcAutosaveMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-autosave", "Autosave")
  @js.native
  open class Autosave () extends default
  /* static members */
  object Autosave {
    
    @JSImport("@ckeditor/ckeditor5-autosave", "Autosave")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-autosave", "Autosave.pluginName")
    @js.native
    def pluginName: typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.Autosave = js.native
    inline def pluginName_=(x: typings.ckeditorCkeditor5Autosave.ckeditorCkeditor5AutosaveStrings.Autosave): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
    
    @JSImport("@ckeditor/ckeditor5-autosave", "Autosave.requires")
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
}
