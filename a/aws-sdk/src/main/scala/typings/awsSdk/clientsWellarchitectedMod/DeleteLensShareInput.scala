package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLensShareInput extends StObject {
  
  var ClientRequestToken: typings.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var ShareId: typings.awsSdk.clientsWellarchitectedMod.ShareId
}
object DeleteLensShareInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, LensAlias: LensAlias, ShareId: ShareId): DeleteLensShareInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], LensAlias = LensAlias.asInstanceOf[js.Any], ShareId = ShareId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLensShareInput]
  }
  
  extension [Self <: DeleteLensShareInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
  }
}
