package typings.cliHighlight.mod

import typings.cliHighlight.themeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightOptions extends js.Object {
  
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
  implicit class HighlightOptionsOps[Self <: HighlightOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinuation(value: js.Any): Self = this.set("continuation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuation: Self = this.set("continuation", js.undefined)
    
    @scala.inline
    def setIgnoreIllegals(value: Boolean): Self = this.set("ignoreIllegals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreIllegals: Self = this.set("ignoreIllegals", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageSubsetVarargs(value: String*): Self = this.set("languageSubset", js.Array(value :_*))
    
    @scala.inline
    def setLanguageSubset(value: js.Array[String]): Self = this.set("languageSubset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageSubset: Self = this.set("languageSubset", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
