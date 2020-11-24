package typings.chance.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.UrlOptions> */
@js.native
trait PartialUrlOptions extends js.Object {
  
  var domain: js.UndefOr[String] = js.native
  
  var domain_prefix: js.UndefOr[String] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
}
object PartialUrlOptions {
  
  @scala.inline
  def apply(): PartialUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUrlOptions]
  }
  
  @scala.inline
  implicit class PartialUrlOptionsOps[Self <: PartialUrlOptions] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDomain_prefix(value: String): Self = this.set("domain_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain_prefix: Self = this.set("domain_prefix", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
}
