package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectionAliasRequest extends StObject {
  
  /**
    * The identifier of the connection alias to delete.
    */
  var AliasId: ConnectionAliasId
}
object DeleteConnectionAliasRequest {
  
  inline def apply(AliasId: ConnectionAliasId): DeleteConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectionAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConnectionAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
