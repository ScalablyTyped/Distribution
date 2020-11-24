package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPermissionSetsResponse extends js.Object {
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * Defines the level of access on an AWS account.
    */
  var PermissionSets: js.UndefOr[PermissionSetList] = js.native
}
object ListPermissionSetsResponse {
  
  @scala.inline
  def apply(): ListPermissionSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionSetsResponse]
  }
  
  @scala.inline
  implicit class ListPermissionSetsResponseOps[Self <: ListPermissionSetsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPermissionSetsVarargs(value: PermissionSetArn*): Self = this.set("PermissionSets", js.Array(value :_*))
    
    @scala.inline
    def setPermissionSets(value: PermissionSetList): Self = this.set("PermissionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionSets: Self = this.set("PermissionSets", js.undefined)
  }
}
