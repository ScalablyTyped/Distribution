package typings.awsSdk.workspacesMod

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
  
  @scala.inline
  def apply(AliasId: ConnectionAliasId): DisassociateConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectionAliasRequest]
  }
  
  @scala.inline
  implicit class DisassociateConnectionAliasRequestMutableBuilder[Self <: DisassociateConnectionAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
