package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexOptions extends StObject {
  
  /** Whether the regex specified is case sensitive.
    * Default is true.
    */
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** The regular expresson to check. */
  var regex: String
  
  /** Whether the regex specified requires capturing.
    * Capturing is only required for redirect rules which specify a regexSubstition action.
    * The default is false.
    */
  var requireCapturing: js.UndefOr[Boolean] = js.undefined
}
object RegexOptions {
  
  inline def apply(regex: String): RegexOptions = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegexOptions] (val x: Self) extends AnyVal {
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRequireCapturing(value: Boolean): Self = StObject.set(x, "requireCapturing", value.asInstanceOf[js.Any])
    
    inline def setRequireCapturingUndefined: Self = StObject.set(x, "requireCapturing", js.undefined)
  }
}
