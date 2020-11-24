package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeUserPoolClientResponse extends js.Object {
  
  /**
    * The user pool client from a server response to describe the user pool client.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.native
}
object DescribeUserPoolClientResponse {
  
  @scala.inline
  def apply(): DescribeUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolClientResponse]
  }
  
  @scala.inline
  implicit class DescribeUserPoolClientResponseOps[Self <: DescribeUserPoolClientResponse] (val x: Self) extends AnyVal {
    
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
