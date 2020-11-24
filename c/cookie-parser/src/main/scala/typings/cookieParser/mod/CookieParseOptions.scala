package typings.cookieParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieParseOptions extends js.Object {
  
  var decode: js.UndefOr[js.Function1[/* val */ String, String]] = js.native
}
object CookieParseOptions {
  
  @scala.inline
  def apply(): CookieParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieParseOptions]
  }
  
  @scala.inline
  implicit class CookieParseOptionsOps[Self <: CookieParseOptions] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: /* val */ String => String): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
  }
}
