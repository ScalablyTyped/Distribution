package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationMediaFailureCause extends js.Object {
  
  /**
    * The reason that an installation media import failed.
    */
  var Message: js.UndefOr[String] = js.native
}
object InstallationMediaFailureCause {
  
  @scala.inline
  def apply(): InstallationMediaFailureCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMediaFailureCause]
  }
  
  @scala.inline
  implicit class InstallationMediaFailureCauseOps[Self <: InstallationMediaFailureCause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
