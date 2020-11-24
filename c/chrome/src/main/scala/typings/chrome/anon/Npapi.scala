package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Npapi extends js.Object {
  
  var npapi: js.UndefOr[Boolean] = js.native
}
object Npapi {
  
  @scala.inline
  def apply(): Npapi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Npapi]
  }
  
  @scala.inline
  implicit class NpapiOps[Self <: Npapi] (val x: Self) extends AnyVal {
    
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
    def setNpapi(value: Boolean): Self = this.set("npapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNpapi: Self = this.set("npapi", js.undefined)
  }
}
