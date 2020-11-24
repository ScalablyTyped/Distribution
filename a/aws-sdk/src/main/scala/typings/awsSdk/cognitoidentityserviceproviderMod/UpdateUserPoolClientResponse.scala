package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserPoolClientResponse extends js.Object {
  
  /**
    * The user pool client value from the response from the server when an update user pool client request is made.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.native
}
object UpdateUserPoolClientResponse {
  
  @scala.inline
  def apply(): UpdateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserPoolClientResponse]
  }
  
  @scala.inline
  implicit class UpdateUserPoolClientResponseOps[Self <: UpdateUserPoolClientResponse] (val x: Self) extends AnyVal {
    
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
    def setUserPoolClient(value: UserPoolClientType): Self = this.set("UserPoolClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolClient: Self = this.set("UserPoolClient", js.undefined)
  }
}
