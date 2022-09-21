package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /**
    * The Amazon Web Services account ID of the member account.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for this member account.
    */
  var delegatedAdminAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The status of the member account.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
  
  /**
    * A timestamp showing when the status of this member was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object Member {
  
  inline def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  extension [Self <: Member](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setDelegatedAdminAccountId(value: AccountId): Self = StObject.set(x, "delegatedAdminAccountId", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdminAccountIdUndefined: Self = StObject.set(x, "delegatedAdminAccountId", js.undefined)
    
    inline def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
