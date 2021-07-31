package typings.browserSync.mod

import typings.browserSync.anon.Fn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnippetOptions extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  var rule: js.UndefOr[Fn] = js.undefined
  
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}
object SnippetOptions {
  
  @scala.inline
  def apply(): SnippetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnippetOptions]
  }
  
  @scala.inline
  implicit class SnippetOptionsMutableBuilder[Self <: SnippetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: Fn): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
