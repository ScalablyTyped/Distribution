package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Http_
  extends StObject
     with Instrumentation {
  
  /**
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var allowlist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
  
  /**
    * Deprecated in favor of `blocklist`.
    *
    * @deprecated
    * @hidden
    */
  var blacklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
  
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * allowlist if a URL matches an entry in both.
    *
    * @default []
    */
  var blocklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
  
  /**
    * An array of headers to include in the span metadata.
    *
    * @default []
    */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    *
    * @default code => code < 500
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ Double, Boolean]] = js.undefined
  
  /**
    * Deprecated in favor of `allowlist`.
    *
    * @deprecated
    * @hidden
    */
  var whitelist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
}
object Http_ {
  
  inline def apply(): Http_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http_]
  }
  
  extension [Self <: Http_](x: Self) {
    
    inline def setAllowlist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
    
    inline def setAllowlistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "allowlist", js.Any.fromFunction1(value))
    
    inline def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
    
    inline def setAllowlistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "allowlist", js.Array(value*))
    
    inline def setBlacklist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "blacklist", js.Array(value*))
    
    inline def setBlocklist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "blocklist", value.asInstanceOf[js.Any])
    
    inline def setBlocklistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "blocklist", js.Any.fromFunction1(value))
    
    inline def setBlocklistUndefined: Self = StObject.set(x, "blocklist", js.undefined)
    
    inline def setBlocklistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "blocklist", js.Array(value*))
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setValidateStatus(value: /* code */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
    
    inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    
    inline def setWhitelist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "whitelist", js.Array(value*))
  }
}
