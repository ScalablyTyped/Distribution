package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountState extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var accountId: AccountId
  
  /**
    * An object detailing which resources Amazon Inspector is enabled to scan for the account.
    */
  var resourceState: ResourceState
  
  /**
    * An object detailing the status of Amazon Inspector for the account.
    */
  var state: State
}
object AccountState {
  
  inline def apply(accountId: AccountId, resourceState: ResourceState, state: State): AccountState = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], resourceState = resourceState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountState]
  }
  
  extension [Self <: AccountState](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setResourceState(value: ResourceState): Self = StObject.set(x, "resourceState", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
