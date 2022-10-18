package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.anon.TypeofTextPartLanguageEdi
import typings.ckeditorCkeditor5Language.anon.TypeofTextPartLanguageUI
import typings.ckeditorCkeditor5Language.srcTextpartlanguageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguage")
  @js.native
  open class TextPartLanguage () extends default
  /* static members */
  object TextPartLanguage {
    
    @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguage.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguage = js.native
    
    @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguage.requires")
    @js.native
    val requires: js.Tuple2[TypeofTextPartLanguageEdi, TypeofTextPartLanguageUI] = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageEditing")
  @js.native
  open class TextPartLanguageEditing ()
    extends typings.ckeditorCkeditor5Language.srcTextpartlanguageeditingMod.default
  /* static members */
  object TextPartLanguageEditing {
    
    @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageEditing.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguageEditing = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageUI")
  @js.native
  open class TextPartLanguageUI ()
    extends typings.ckeditorCkeditor5Language.srcTextpartlanguageuiMod.default
  /* static members */
  object TextPartLanguageUI {
    
    @JSImport("@ckeditor/ckeditor5-language", "TextPartLanguageUI.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.TextPartLanguageUI = js.native
  }
}
