package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Denied extends js.Object {
  
  /**
    * Information that explicitly denies the authorization. 
    */
  var explicitDeny: js.UndefOr[ExplicitDeny] = js.native
  
  /**
    * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
    */
  var implicitDeny: js.UndefOr[ImplicitDeny] = js.native
}
object Denied {
  
  @scala.inline
  def apply(): Denied = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Denied]
  }
  
  @scala.inline
  implicit class DeniedOps[Self <: Denied] (val x: Self) extends AnyVal {
    
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
    def setExplicitDeny(value: ExplicitDeny): Self = this.set("explicitDeny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitDeny: Self = this.set("explicitDeny", js.undefined)
    
    @scala.inline
    def setImplicitDeny(value: ImplicitDeny): Self = this.set("implicitDeny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitDeny: Self = this.set("implicitDeny", js.undefined)
  }
}
