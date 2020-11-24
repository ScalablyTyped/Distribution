package typings.badgin.mod

import typings.badgin.anon.PartialOptions
import typings.badgin.anon.PartialOptionsIndicator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var favicon: PartialOptions = js.native
  
  var method: Method = js.native
  
  var title: PartialOptionsIndicator = js.native
}
object Options {
  
  @scala.inline
  def apply(favicon: PartialOptions, method: Method, title: PartialOptionsIndicator): Options = {
    val __obj = js.Dynamic.literal(favicon = favicon.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFavicon(value: PartialOptions): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Method): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: PartialOptionsIndicator): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
