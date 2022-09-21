package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegatedAdmin extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The status of the Amazon Inspector delegated administrator.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
}
object DelegatedAdmin {
  
  inline def apply(): DelegatedAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegatedAdmin]
  }
  
  extension [Self <: DelegatedAdmin](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
  }
}
