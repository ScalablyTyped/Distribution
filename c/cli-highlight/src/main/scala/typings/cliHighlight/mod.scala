package typings.cliHighlight

import typings.cliHighlight.themeMod.JsonTheme
import typings.cliHighlight.themeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-highlight", JSImport.Default)
  @js.native
  def default(code: String): String = js.native
  @JSImport("cli-highlight", JSImport.Default)
  @js.native
  def default(code: String, options: HighlightOptions): String = js.native
  
  @JSImport("cli-highlight", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: Theme = js.native
  
  @JSImport("cli-highlight", "fromJson")
  @js.native
  def fromJson(json: JsonTheme): Theme = js.native
  
  @JSImport("cli-highlight", "highlight")
  @js.native
  def highlight(code: String): String = js.native
  @JSImport("cli-highlight", "highlight")
  @js.native
  def highlight(code: String, options: HighlightOptions): String = js.native
  
  @JSImport("cli-highlight", "listLanguages")
  @js.native
  def listLanguages(): js.Array[String] = js.native
  
  @JSImport("cli-highlight", "parse")
  @js.native
  def parse(json: String): Theme = js.native
  
  @JSImport("cli-highlight", "plain")
  @js.native
  def plain(codePart: String): String = js.native
  
  @JSImport("cli-highlight", "stringify")
  @js.native
  def stringify(theme: Theme): String = js.native
  
  @JSImport("cli-highlight", "supportsLanguage")
  @js.native
  def supportsLanguage(name: String): Boolean = js.native
  
  @JSImport("cli-highlight", "toJson")
  @js.native
  def toJson(theme: Theme): JsonTheme = js.native
  
  @js.native
  trait HighlightOptions extends StObject {
    
    /**
      * The continuation is an optional mode stack representing unfinished parsing. When present,
      * the function will restart parsing from this state instead of initializing a new one.
      *
      * See http://highlightjs.readthedocs.io/en/latest/api.html
      */
    var continuation: js.UndefOr[js.Any] = js.native
    
    /**
      * When present and evaluates to a true value, forces highlighting to finish even in case of
      * detecting illegal syntax for the language instead of throwing an exception.
      */
    var ignoreIllegals: js.UndefOr[Boolean] = js.native
    
    /**
      * Can be a name, file extension, alias etc. If omitted, tries to auto-detect language.
      */
    var language: js.UndefOr[String] = js.native
    
    /**
      * Optional array of language names and aliases restricting detection to only those languages.
      */
    var languageSubset: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Supply a custom theme where you override language tokens with own formatter functions. Every
      * token that is not overriden falls back to the [[DEFAULT_THEME]]
      */
    var theme: js.UndefOr[Theme] = js.native
  }
  object HighlightOptions {
    
    @scala.inline
    def apply(): HighlightOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightOptions]
    }
    
    @scala.inline
    implicit class HighlightOptionsMutableBuilder[Self <: HighlightOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuation(value: js.Any): Self = StObject.set(x, "continuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuationUndefined: Self = StObject.set(x, "continuation", js.undefined)
      
      @scala.inline
      def setIgnoreIllegals(value: Boolean): Self = StObject.set(x, "ignoreIllegals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreIllegalsUndefined: Self = StObject.set(x, "ignoreIllegals", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageSubset(value: js.Array[String]): Self = StObject.set(x, "languageSubset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageSubsetUndefined: Self = StObject.set(x, "languageSubset", js.undefined)
      
      @scala.inline
      def setLanguageSubsetVarargs(value: String*): Self = StObject.set(x, "languageSubset", js.Array(value :_*))
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
