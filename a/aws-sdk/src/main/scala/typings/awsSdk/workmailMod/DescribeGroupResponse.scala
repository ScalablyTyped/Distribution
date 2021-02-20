package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGroupResponse extends StObject {
  
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
  implicit class DescribeGroupResponseMutableBuilder[Self <: DescribeGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledDate(value: Timestamp): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    @scala.inline
    def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
