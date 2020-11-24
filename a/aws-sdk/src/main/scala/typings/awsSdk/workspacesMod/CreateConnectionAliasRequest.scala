package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnectionAliasRequest extends js.Object {
  
  /**
    * A connection string in the form of a fully qualified domain name (FQDN), such as www.example.com.  After you create a connection string, it is always associated to your AWS account. You cannot recreate the same connection string with a different account, even if you delete all instances of it from the original account. The connection string is globally reserved for your account. 
    */
  var ConnectionString: typings.awsSdk.workspacesMod.ConnectionString = js.native
  
  /**
    * The tags to associate with the connection alias.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateConnectionAliasRequest {
  
  @scala.inline
  def apply(ConnectionString: ConnectionString): CreateConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionAliasRequest]
  }
  
  @scala.inline
  implicit class CreateConnectionAliasRequestOps[Self <: CreateConnectionAliasRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectionString(value: ConnectionString): Self = this.set("ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
