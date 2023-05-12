package typings.ckeditorCkeditor5Autosave

import typings.ckeditorCkeditor5Autosave.srcAutosaveMod.AutosaveConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditor5CoreMod {
  
  trait EditorConfig extends StObject {
    
    /**
      * The configuration of the {@link module:autosave/autosave~Autosave autosave feature}.
      *
      * Read more in {@link module:autosave/autosave~AutosaveConfig}.
      */
    var autosave: js.UndefOr[AutosaveConfig] = js.undefined
  }
  object EditorConfig {
    
    inline def apply(): EditorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorConfig] (val x: Self) extends AnyVal {
      
      inline def setAutosave(value: AutosaveConfig): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
    }
  }
  
  @js.native
  trait PluginsMap extends StObject
}
