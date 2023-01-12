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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateConnectionAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
