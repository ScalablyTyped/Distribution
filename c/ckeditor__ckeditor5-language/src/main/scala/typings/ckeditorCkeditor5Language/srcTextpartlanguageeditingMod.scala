package typings.ckeditorCkeditor5Language

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextpartlanguageeditingMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/textpartlanguageediting", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TextPartLanguageEditing {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @js.native
  trait TextPartLanguageEditing
    extends StObject
       with Plugin {
    
    /**
      * @private
      */
    /* private */ var _defineConverters: Any = js.native
    
    /**
      * @inheritDoc
      */
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreAugmentingMod {
    
    @js.native
    trait PluginsMap extends StObject
  }
}
