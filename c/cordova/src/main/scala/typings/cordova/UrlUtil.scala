package typings.cordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// cordova/urlutil module
@js.native
trait UrlUtil extends js.Object {
  
  def makeAbsolute(url: String): String = js.native
}
object UrlUtil {
  
  @scala.inline
  def apply(makeAbsolute: String => String): UrlUtil = {
    val __obj = js.Dynamic.literal(makeAbsolute = js.Any.fromFunction1(makeAbsolute))
    __obj.asInstanceOf[UrlUtil]
  }
  
  @scala.inline
  implicit class UrlUtilOps[Self <: UrlUtil] (val x: Self) extends AnyVal {
    
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
    def setMakeAbsolute(value: String => String): Self = this.set("makeAbsolute", js.Any.fromFunction1(value))
  }
}
