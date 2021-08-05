package typings.ddTrace.mod.plugins

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [redis](https://github.com/NodeRedis/node_redis) module.
  */
trait redis
  extends StObject
     with Instrumentation {
  
  /**
    * List of commands that should not be instrumented. Takes precedence over
    * whitelist if a command matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.undefined
  
  /**
    * List of commands that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.undefined
}
object redis {
  
  inline def apply(): redis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[redis]
  }
  
  extension [Self <: redis](x: Self) {
    
    inline def setBlacklist(
      value: String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: (String | RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    inline def setWhitelist(
      value: String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: (String | RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
