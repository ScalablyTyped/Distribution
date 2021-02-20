package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesInput extends StObject {
  
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
  implicit class DeleteIdentitiesInputMutableBuilder[Self <: DeleteIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityIdsToDelete(value: IdentityIdList): Self = StObject.set(x, "IdentityIdsToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdsToDeleteVarargs(value: IdentityId*): Self = StObject.set(x, "IdentityIdsToDelete", js.Array(value :_*))
  }
}
