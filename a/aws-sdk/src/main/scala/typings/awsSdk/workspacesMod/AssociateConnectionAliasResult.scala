package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateConnectionAliasResult extends StObject {
  
  /**
    * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when you're configuring your DNS routing policies. 
    */
  var ConnectionIdentifier: js.UndefOr[typings.awsSdk.workspacesMod.ConnectionIdentifier] = js.native
}
object AssociateConnectionAliasResult {
  
  @scala.inline
  def apply(): AssociateConnectionAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateConnectionAliasResult]
  }
  
  @scala.inline
  implicit class AssociateConnectionAliasResultMutableBuilder[Self <: AssociateConnectionAliasResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionIdentifier(value: ConnectionIdentifier): Self = StObject.set(x, "ConnectionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdentifierUndefined: Self = StObject.set(x, "ConnectionIdentifier", js.undefined)
  }
}
