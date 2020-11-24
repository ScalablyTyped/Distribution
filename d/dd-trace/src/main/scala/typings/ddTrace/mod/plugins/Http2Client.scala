package typings.ddTrace.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait Http2Client extends Http_ {
  
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.native
}
object Http2Client {
  
  @scala.inline
  def apply(): Http2Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http2Client]
  }
  
  @scala.inline
  implicit class Http2ClientOps[Self <: Http2Client] (val x: Self) extends AnyVal {
    
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
    def setSplitByDomain(value: Boolean): Self = this.set("splitByDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitByDomain: Self = this.set("splitByDomain", js.undefined)
  }
}
