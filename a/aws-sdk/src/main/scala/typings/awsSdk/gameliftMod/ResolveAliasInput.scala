package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveAliasInput extends StObject {
  
  /**
    * The unique identifier of the alias that you want to retrieve a fleet ID for. You can use either the alias ID or ARN value.
    */
  var AliasId: AliasIdOrArn
}
object ResolveAliasInput {
  
  inline def apply(AliasId: AliasIdOrArn): ResolveAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAliasInput]
  }
  
  extension [Self <: ResolveAliasInput](x: Self) {
    
    inline def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
