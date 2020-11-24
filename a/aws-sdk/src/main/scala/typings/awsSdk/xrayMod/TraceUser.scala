package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceUser extends js.Object {
  
  /**
    * Services that the user's request hit.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.xrayMod.ServiceIds] = js.native
  
  /**
    * The user's name.
    */
  var UserName: js.UndefOr[String] = js.native
}
object TraceUser {
  
  @scala.inline
  def apply(): TraceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceUser]
  }
  
  @scala.inline
  implicit class TraceUserOps[Self <: TraceUser] (val x: Self) extends AnyVal {
    
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
    def setServiceIdsVarargs(value: ServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceIds(value: ServiceIds): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
