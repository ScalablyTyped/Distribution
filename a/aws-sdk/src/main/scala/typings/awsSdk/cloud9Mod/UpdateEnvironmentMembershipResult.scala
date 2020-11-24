package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEnvironmentMembershipResult extends js.Object {
  
  /**
    * Information about the environment member whose settings were changed.
    */
  var membership: js.UndefOr[EnvironmentMember] = js.native
}
object UpdateEnvironmentMembershipResult {
  
  @scala.inline
  def apply(): UpdateEnvironmentMembershipResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEnvironmentMembershipResult]
  }
  
  @scala.inline
  implicit class UpdateEnvironmentMembershipResultOps[Self <: UpdateEnvironmentMembershipResult] (val x: Self) extends AnyVal {
    
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
    def setMembership(value: EnvironmentMember): Self = this.set("membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembership: Self = this.set("membership", js.undefined)
  }
}
