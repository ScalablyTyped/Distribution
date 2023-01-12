package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGroupResponse extends StObject {
  
  /**
    * The date and time when a user was deregistered from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The email of the described group.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The date and time when a user was registered to WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the described group.
    */
  var GroupId: js.UndefOr[WorkMailIdentifier] = js.undefined
  
  /**
    * The name of the described group.
    */
  var Name: js.UndefOr[GroupName] = js.undefined
  
  /**
    * The state of the user: enabled (registered to WorkMail) or disabled (deregistered or never registered to WorkMail).
    */
  var State: js.UndefOr[EntityState] = js.undefined
}
object DescribeGroupResponse {
  
  inline def apply(): DescribeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setDisabledDate(value: js.Date): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setEnabledDate(value: js.Date): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    inline def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    inline def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
