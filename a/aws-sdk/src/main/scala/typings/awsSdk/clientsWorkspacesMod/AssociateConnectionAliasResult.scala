package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateConnectionAliasResult extends StObject {
  
  /**
    * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when you're configuring your DNS routing policies. 
    */
  var ConnectionIdentifier: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ConnectionIdentifier] = js.undefined
}
object AssociateConnectionAliasResult {
  
  inline def apply(): AssociateConnectionAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateConnectionAliasResult]
  }
  
  extension [Self <: AssociateConnectionAliasResult](x: Self) {
    
    inline def setConnectionIdentifier(value: ConnectionIdentifier): Self = StObject.set(x, "ConnectionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdentifierUndefined: Self = StObject.set(x, "ConnectionIdentifier", js.undefined)
  }
}
