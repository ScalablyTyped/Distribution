package typings.awsSdk.personalizeeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutUsersRequest extends js.Object {
  
  /**
    * The Amazon Resource Number (ARN) of the Users dataset you are adding the user or users to.
    */
  var datasetArn: Arn = js.native
  
  /**
    * A list of user data.
    */
  var users: UserList = js.native
}
object PutUsersRequest {
  
  @scala.inline
  def apply(datasetArn: Arn, users: UserList): PutUsersRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutUsersRequest]
  }
  
  @scala.inline
  implicit class PutUsersRequestOps[Self <: PutUsersRequest] (val x: Self) extends AnyVal {
    
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
    def setDatasetArn(value: Arn): Self = this.set("datasetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: User*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: UserList): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
