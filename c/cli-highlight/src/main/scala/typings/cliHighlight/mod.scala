package typings.cliHighlight

import typings.cliHighlight.distThemeMod.JsonTheme
import typings.cliHighlight.distThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-highlight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(code: String, options: HighlightOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cli-highlight", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: Theme = js.native
  
  inline def fromJson(json: JsonTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(json.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def highlight(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def highlight(code: String, options: HighlightOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def listLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listLanguages")().asInstanceOf[js.Array[String]]
  
  inline def parse(json: String): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def plain(codePart: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plain")(codePart.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify(theme: Theme): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(theme.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def supportsLanguage(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsLanguage")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toJson(theme: Theme): JsonTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(theme.asInstanceOf[js.Any]).asInstanceOf[JsonTheme]
  
  trait HighlightOptions extends StObject {
    
    /**
      * When present and evaluates to a true value, forces highlighting to finish even in case of
      * detecting illegal syntax for the language instead of throwing an exception.
      */
    var ignoreIllegals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can be a name, file extension, alias etc. If omitted, tries to auto-detect language.
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * Optional array of language names and aliases restricting detection to only those languages.
      */
    var languageSubset: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Supply a custom theme where you override language tokens with own formatter functions. Every
      * token that is not overriden falls back to the [[DEFAULT_THEME]]
      */
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object HighlightOptions {
    
    inline def apply(): HighlightOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightOptions]
    }
    
    extension [Self <: HighlightOptions](x: Self) {
      
      inline def setIgnoreIllegals(value: Boolean): Self = StObject.set(x, "ignoreIllegals", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIllegalsUndefined: Self = StObject.set(x, "ignoreIllegals", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageSubset(value: js.Array[String]): Self = StObject.set(x, "languageSubset", value.asInstanceOf[js.Any])
      
      inline def setLanguageSubsetUndefined: Self = StObject.set(x, "languageSubset", js.undefined)
      
      inline def setLanguageSubsetVarargs(value: String*): Self = StObject.set(x, "languageSubset", js.Array(value*))
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
