package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectionAliasRequest extends StObject {
  
  /**
    * The identifier of the connection alias to disassociate.
    */
  var AliasId: ConnectionAliasId
}
object DisassociateConnectionAliasRequest {
  
  inline def apply(AliasId: ConnectionAliasId): DisassociateConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectionAliasRequest]
  }
  
  extension [Self <: DisassociateConnectionAliasRequest](x: Self) {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
