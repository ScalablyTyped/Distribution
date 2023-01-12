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
  
  inline def apply(): SnippetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnippetOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnippetOptions] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setRule(value: Fn): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
