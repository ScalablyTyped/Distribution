package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLensShareInput extends StObject {
  
  var ClientRequestToken: typings.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var SharedWith: typings.awsSdk.clientsWellarchitectedMod.SharedWith
}
object CreateLensShareInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, LensAlias: LensAlias, SharedWith: SharedWith): CreateLensShareInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], LensAlias = LensAlias.asInstanceOf[js.Any], SharedWith = SharedWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLensShareInput]
  }
  
  extension [Self <: CreateLensShareInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setSharedWith(value: SharedWith): Self = StObject.set(x, "SharedWith", value.asInstanceOf[js.Any])
  }
}
