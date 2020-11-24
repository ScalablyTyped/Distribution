package typings.cloudflareApps.CloudflareApps

import typings.cloudflareApps.cloudflareAppsStrings.after
import typings.cloudflareApps.cloudflareAppsStrings.append
import typings.cloudflareApps.cloudflareAppsStrings.before
import typings.cloudflareApps.cloudflareAppsStrings.prepend
import typings.cloudflareApps.cloudflareAppsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementLocation extends js.Object {
  
  var method: before | prepend | append | after | replace = js.native
  
  var selector: String = js.native
}
object ElementLocation {
  
  @scala.inline
  def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementLocation]
  }
  
  @scala.inline
  implicit class ElementLocationOps[Self <: ElementLocation] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: before | prepend | append | after | replace): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
}
