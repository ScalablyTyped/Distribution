package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserPoolClientResponse extends js.Object {
  
  /**
    * The user pool client that was just created.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.native
}
object CreateUserPoolClientResponse {
  
  @scala.inline
  def apply(): CreateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolClientResponse]
  }
  
  @scala.inline
  implicit class CreateUserPoolClientResponseOps[Self <: CreateUserPoolClientResponse] (val x: Self) extends AnyVal {
    
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
