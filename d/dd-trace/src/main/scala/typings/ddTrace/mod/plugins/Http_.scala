package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait Http_
  extends Integration
     with Analyzable {
  
  /**
    * List of URLs that should not be instrumented. Takes precedence over
    * whitelist if a URL matches an entry in both.
    *
    * @default []
    */
  var blacklist: js.UndefOr[
    String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.native
  
  /**
    * An array of headers to include in the span metadata.
    *
    * @default []
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Callback function to determine if there was an error. It should take a
    * status code as its only parameter and return `true` for success or `false`
    * for errors.
    *
    * @default code => code < 500
    */
  var validateStatus: js.UndefOr[js.Function1[/* code */ Double, Boolean]] = js.native
  
  /**
    * List of URLs that should be instrumented.
    *
    * @default /^.*$/
    */
  var whitelist: js.UndefOr[
    String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.native
}
object Http_ {
  
  @scala.inline
  def apply(): Http_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http_]
  }
  
  @scala.inline
  implicit class Http_Ops[Self <: Http_] (val x: Self) extends AnyVal {
    
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
    def setBlacklistVarargs(value: (String | RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = this.set("blacklist", js.Array(value :_*))
    
    @scala.inline
    def setBlacklistFunction1(value: /* url */ String => Boolean): Self = this.set("blacklist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlacklist(
      value: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setValidateStatus(value: /* code */ Double => Boolean): Self = this.set("validateStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidateStatus: Self = this.set("validateStatus", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: (String | RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = this.set("whitelist", js.Array(value :_*))
    
    @scala.inline
    def setWhitelistFunction1(value: /* url */ String => Boolean): Self = this.set("whitelist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhitelist(
      value: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
