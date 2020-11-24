package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListScramSecretsResponse extends js.Object {
  
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * 
    The list of scram secrets associated with the cluster.
    
    */
  var SecretArnList: js.UndefOr[listOfString] = js.native
}
object ListScramSecretsResponse {
  
  @scala.inline
  def apply(): ListScramSecretsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScramSecretsResponse]
  }
  
  @scala.inline
  implicit class ListScramSecretsResponseOps[Self <: ListScramSecretsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSecretArnListVarargs(value: string*): Self = this.set("SecretArnList", js.Array(value :_*))
    
    @scala.inline
    def setSecretArnList(value: listOfString): Self = this.set("SecretArnList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArnList: Self = this.set("SecretArnList", js.undefined)
  }
}
