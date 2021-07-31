package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string
  
  /**
    * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Groups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The password of the user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas.
    */
  var Password: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: string
}
object UpdateUserRequest {
  
  @scala.inline
  def apply(BrokerId: string, Username: string): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  @scala.inline
  implicit class UpdateUserRequestMutableBuilder[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
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
    def setPassword(value: string): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
