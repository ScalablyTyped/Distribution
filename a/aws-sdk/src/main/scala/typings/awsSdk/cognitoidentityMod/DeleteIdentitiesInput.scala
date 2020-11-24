package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesInput extends js.Object {
  
  /**
    * A list of 1-60 identities that you want to delete.
    */
  var IdentityIdsToDelete: IdentityIdList = js.native
}
object DeleteIdentitiesInput {
  
  @scala.inline
  def apply(IdentityIdsToDelete: IdentityIdList): DeleteIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityIdsToDelete = IdentityIdsToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentitiesInput]
  }
  
  @scala.inline
  implicit class DeleteIdentitiesInputOps[Self <: DeleteIdentitiesInput] (val x: Self) extends AnyVal {
    
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
    def setIdentityIdsToDeleteVarargs(value: IdentityId*): Self = this.set("IdentityIdsToDelete", js.Array(value :_*))
    
    @scala.inline
    def setIdentityIdsToDelete(value: IdentityIdList): Self = this.set("IdentityIdsToDelete", value.asInstanceOf[js.Any])
  }
}
