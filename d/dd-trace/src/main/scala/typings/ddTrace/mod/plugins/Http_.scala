package typings.ddTrace.mod.plugins

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Http_
  extends StObject
     with Instrumentation {
  
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * whitelist if a URL matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
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
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
}
object Http_ {
  
  inline def apply(): Http_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http_]
  }
  
  extension [Self <: Http_](x: Self) {
    
    inline def setBlacklist(
      value: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: (String | RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setValidateStatus(value: /* code */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
    
    inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
    
    inline def setWhitelist(
      value: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: (String | RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
