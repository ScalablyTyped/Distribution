package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesResponse extends js.Object {
  
  /**
    * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
    */
  var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.native
}
object DeleteIdentitiesResponse {
  
  @scala.inline
  def apply(): DeleteIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesResponse]
  }
  
  @scala.inline
  implicit class DeleteIdentitiesResponseOps[Self <: DeleteIdentitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setUnprocessedIdentityIdsVarargs(value: UnprocessedIdentityId*): Self = this.set("UnprocessedIdentityIds", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedIdentityIds(value: UnprocessedIdentityIdList): Self = this.set("UnprocessedIdentityIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedIdentityIds: Self = this.set("UnprocessedIdentityIds", js.undefined)
  }
}
