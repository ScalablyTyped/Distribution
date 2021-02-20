package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnectionAliasResult extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.native
}
object CreateConnectionAliasResult {
  
  @scala.inline
  def apply(): CreateConnectionAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectionAliasResult]
  }
  
  @scala.inline
  implicit class CreateConnectionAliasResultMutableBuilder[Self <: CreateConnectionAliasResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
  }
}
