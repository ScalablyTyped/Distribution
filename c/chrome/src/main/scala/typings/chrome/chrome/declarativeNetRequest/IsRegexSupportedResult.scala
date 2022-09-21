package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRegexSupportedResult extends StObject {
  
  var isSupported: Boolean
  
  /** Specifies the reason why the regular expression is not supported.
    * Only provided if isSupported is false.
    */
  var reason: js.UndefOr[UnsupportedRegexReason] = js.undefined
}
object IsRegexSupportedResult {
  
  inline def apply(isSupported: Boolean): IsRegexSupportedResult = {
    val __obj = js.Dynamic.literal(isSupported = isSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRegexSupportedResult]
  }
  
  extension [Self <: IsRegexSupportedResult](x: Self) {
    
    inline def setIsSupported(value: Boolean): Self = StObject.set(x, "isSupported", value.asInstanceOf[js.Any])
    
    inline def setReason(value: UnsupportedRegexReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
