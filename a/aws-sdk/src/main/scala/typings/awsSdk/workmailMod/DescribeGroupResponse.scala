package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGroupResponse extends js.Object {
  
  /**
    * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The email of the described group.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the described group.
    */
  var GroupId: js.UndefOr[WorkMailIdentifier] = js.native
  
  /**
    * The name of the described group.
    */
  var Name: js.UndefOr[GroupName] = js.native
  
  /**
    * The state of the user: enabled (registered to Amazon WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.native
}
object DescribeGroupResponse {
  
  @scala.inline
  def apply(): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeGroupResponseOps[Self <: DescribeGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setDisabledDate(value: Timestamp): Self = this.set("DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("DisabledDate", js.undefined)
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = this.set("EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDate: Self = this.set("EnabledDate", js.undefined)
    
    @scala.inline
    def setGroupId(value: WorkMailIdentifier): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setName(value: GroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
