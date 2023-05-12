package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.srcTextpartlanguageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguage")
  @js.native
  open class TextPartLanguage () extends default
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageCommand")
  @js.native
  open class TextPartLanguageCommand ()
    extends typings.ckeditorCkeditor5Language.srcTextpartlanguagecommandMod.default
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageEditing")
  @js.native
  open class TextPartLanguageEditing protected ()
    extends typings.ckeditorCkeditor5Language.srcTextpartlanguageeditingMod.default {
    /**
      * @inheritDoc
      */
    def this(editor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Editor */ Any) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageUI")
  @js.native
  open class TextPartLanguageUI ()
    extends typings.ckeditorCkeditor5Language.srcTextpartlanguageuiMod.default
}
