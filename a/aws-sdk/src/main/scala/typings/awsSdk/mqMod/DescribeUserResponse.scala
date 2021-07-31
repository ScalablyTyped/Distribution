package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserResponse extends StObject {
  
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
  
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The status of the changes pending for the ActiveMQ user.
    */
  var Pending: js.UndefOr[UserPendingChanges] = js.undefined
  
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[string] = js.undefined
}
object DescribeUserResponse {
  
  @scala.inline
  def apply(): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  @scala.inline
  implicit class DescribeUserResponseMutableBuilder[Self <: DescribeUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    @scala.inline
    def setConsoleAccess(value: boolean): Self = StObject.set(x, "ConsoleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleAccessUndefined: Self = StObject.set(x, "ConsoleAccess", js.undefined)
    
    @scala.inline
    def setGroups(value: listOfString): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: string*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setPending(value: UserPendingChanges): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
