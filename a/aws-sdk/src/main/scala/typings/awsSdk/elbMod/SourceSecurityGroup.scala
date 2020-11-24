package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSecurityGroup extends js.Object {
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
  
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.native
}
object SourceSecurityGroup {
  
  @scala.inline
  def apply(): SourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSecurityGroup]
  }
  
  @scala.inline
  implicit class SourceSecurityGroupOps[Self <: SourceSecurityGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: SecurityGroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: SecurityGroupOwnerAlias): Self = this.set("OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAlias: Self = this.set("OwnerAlias", js.undefined)
  }
}
