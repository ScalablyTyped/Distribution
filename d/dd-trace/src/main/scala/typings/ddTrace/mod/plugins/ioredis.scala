package typings.ddTrace.mod.plugins

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [ioredis](https://github.com/luin/ioredis) module.
  */
@js.native
trait ioredis extends Instrumentation {
  
  /**
    * List of commands that should not be instrumented. Takes precedence over
    * whitelist if a command matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.native
  
  /**
    * List of commands that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
  ] = js.native
}
object ioredis {
  
  @scala.inline
  def apply(): ioredis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ioredis]
  }
  
  @scala.inline
  implicit class ioredisMutableBuilder[Self <: ioredis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlacklist(
      value: String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "blacklist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: (String | RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelist(
      value: String | RegExp | (js.Function1[/* command */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* command */ String, Boolean])])
    ): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistFunction1(value: /* command */ String => Boolean): Self = StObject.set(x, "whitelist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: (String | RegExp | (js.Function1[/* command */ String, Boolean]))*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
