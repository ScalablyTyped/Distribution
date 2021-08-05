package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionAliasResult extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.undefined
}
object CreateConnectionAliasResult {
  
  inline def apply(): CreateConnectionAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectionAliasResult]
  }
  
  extension [Self <: CreateConnectionAliasResult](x: Self) {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    inline def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
  }
}
